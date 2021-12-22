package ua.nure.sheliemietiev;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	
	private static final Log log = LogFactory.getLog(CalcServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.debug("doGet");
		
		String leftOperandText = req.getParameter("x");
		String rightOperandText = req.getParameter("y");
		String operationCode = req.getParameter("op");
		
		log.trace("x = " + leftOperandText);
		log.trace("y = " + rightOperandText);
		log.trace("op = " + operationCode);
		
		req.setAttribute("x", leftOperandText);
		req.setAttribute("y", rightOperandText);
		req.setAttribute("op", operationCode);
		
		try {
			int leftOperand = Integer.parseInt(leftOperandText);
			int rightOperand = Integer.parseInt(rightOperandText);
			
			int result;
			switch (operationCode) {
			case "add":
				result = Calc.add(leftOperand, rightOperand);
				break;
			case "sub":
				result = Calc.sub(leftOperand, rightOperand);
				break;
			case "div":
				result = Calc.div(leftOperand, rightOperand);
				break;
			case "mul":
				result = Calc.mul(leftOperand, rightOperand);
				break;
			default:
				throw new IllegalArgumentException();
			}

			req.setAttribute("result", result);
		} catch (NumberFormatException e) {
			req.setAttribute("error", "One of the parameters is not integer.");
			log.error("One of the parameters is not integer.");
		} catch(IllegalArgumentException e) {
			req.setAttribute("error", "Unknown operation is given.");
		} catch(ArithmeticException e) {
			req.setAttribute("error", "Zero division attempt.");
		} catch(Exception e) {
			req.setAttribute("error", e.getMessage());
		}

		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
