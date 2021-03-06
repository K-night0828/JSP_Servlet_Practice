package bridge.calculator.newer;

/** DesiredPowerOfTwoCalculator, implements DesiredCalculator.
 *  
 * @author benbai123
 *
 */
public class DesiredPowerOfTwoCalculator implements DesiredCalculator {
	private Double _data;
	private Double _result;

	public void setData (Number data) {
		if (data == null) {
			data = 0;
		}
		_data = data.doubleValue();
	}
	public Number getValue () {
		if (_result == null) {
			calc();
		}
		return _result;
	}

	private void calc () {
		_result = Math.pow(2.0, _data.doubleValue());
	}
}
