package lecho.lib.hellocharts.model;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Color;
import android.graphics.Typeface;

/**
 * Data for PieChart, by default it doesn't have axes.
 * 
 * @author Leszek Wach
 * 
 */
public class PieChartData extends AbstractChartData {
	public static final int DEFAULT_CENTER_TEXT1_SIZE_SP = 48;
	public static final int DEFAULT_CENTER_TEXT2_SIZE_SP = 18;
	public static final float DEFAULT_CENTER_CIRCLE_SCALE = 0.6f;

	private ValueFormatter formatter = new NumberValueFormatter();
	private boolean hasLabels = false;
	private boolean hasLabelsOnlyForSelected = false;

	private boolean hasCenterCircle = false;
	private int centerCircleColor = Color.WHITE;
	private float centerCircleScale = 0.6f;

	private int centerText1Color = Color.BLACK;
	private int centerText1FontSize = DEFAULT_CENTER_TEXT1_SIZE_SP;
	private Typeface centerText1Typeface;
	private String centerText1;

	private int centerText2Color = Color.BLACK;
	private int centerText2FontSize = DEFAULT_CENTER_TEXT2_SIZE_SP;
	private Typeface centerText2Typeface;
	private String centerText2;

	private List<ArcValue> values = new ArrayList<ArcValue>();

	public PieChartData() {
		setAxisX(null);
		setAxisY(null);
	};

	public PieChartData(List<ArcValue> values) {
		setValues(values);
		// Empty axes. Pie chart don't need axes.
		setAxisX(null);
		setAxisY(null);
	}

	public PieChartData(PieChartData data) {
		super(data);
		this.formatter = data.formatter;
		this.hasLabels = data.hasLabels;
		this.hasLabelsOnlyForSelected = data.hasLabelsOnlyForSelected;

		this.hasCenterCircle = data.hasCenterCircle;
		this.centerCircleColor = data.centerCircleColor;
		this.centerCircleScale = data.centerCircleScale;

		this.centerText1Color = data.centerText1Color;
		this.centerText1FontSize = data.centerText1FontSize;
		this.centerText1Typeface = data.centerText1Typeface;
		this.centerText1 = data.centerText1;

		this.centerText2Color = data.centerText2Color;
		this.centerText2FontSize = data.centerText2FontSize;
		this.centerText2Typeface = data.centerText2Typeface;
		this.centerText2 = data.centerText2;

		for (ArcValue arcValue : data.values) {
			this.values.add(new ArcValue(arcValue));
		}
	}

	/**
	 * PieChart does not support axes so method call will be ignored
	 */
	@Override
	public void setAxisX(Axis axisX) {
		super.setAxisX(null);
	}

	/**
	 * PieChart does not support axes so method call will be ignored
	 */
	@Override
	public void setAxisY(Axis axisY) {
		super.setAxisY(null);
	}

	public List<ArcValue> getValues() {
		return values;
	}

	public PieChartData setValues(List<ArcValue> values) {
		if (null == values) {
			this.values = new ArrayList<ArcValue>();
		} else {
			this.values = values;
		}
		return this;
	}

	public boolean hasLabels() {
		return hasLabels;
	}

	public PieChartData setHasLabels(boolean hasLabels) {
		this.hasLabels = hasLabels;
		if (hasLabels) {
			hasLabelsOnlyForSelected = false;
		}
		return this;
	}

	public boolean hasLabelsOnlyForSelected() {
		return hasLabelsOnlyForSelected;
	}

	public PieChartData setHasLabelsOnlyForSelected(boolean hasLabelsOnlyForSelected) {
		this.hasLabelsOnlyForSelected = hasLabelsOnlyForSelected;
		if (hasLabelsOnlyForSelected) {
			this.hasLabels = false;
		}
		return this;
	}

	public boolean hasCenterCircle() {
		return hasCenterCircle;
	}

	public void setHasCenterCircle(boolean hasCenterCircle) {
		this.hasCenterCircle = hasCenterCircle;
	}

	public int getCenterCircleColor() {
		return centerCircleColor;
	}

	public void setCenterCircleColor(int centerCircleColor) {
		this.centerCircleColor = centerCircleColor;
	}

	public float getCenterCircleScale() {
		return centerCircleScale;
	}

	public void setCenterCircleScale(float centerCircleScale) {
		this.centerCircleScale = centerCircleScale;
	}

	public int getCenterText1Color() {
		return centerText1Color;
	}

	public void setCenterText1Color(int centerText1Color) {
		this.centerText1Color = centerText1Color;
	}

	public int getCenterText1FontSize() {
		return centerText1FontSize;
	}

	public void setCenterText1FontSize(int centerText1FontSize) {
		this.centerText1FontSize = centerText1FontSize;
	}

	public Typeface getCenterText1Typeface() {
		return centerText1Typeface;
	}

	public void setCenterText1Typeface(Typeface text1Typeface) {
		this.centerText1Typeface = text1Typeface;
	}

	public String getCenterText1() {
		return centerText1;
	}

	public void setCenterText1(String centerText1) {
		this.centerText1 = centerText1;
	}

	public String getCenterText2() {
		return centerText2;
	}

	public void setCenterText2(String centerText2) {
		this.centerText2 = centerText2;
	}

	public int getCenterText2Color() {
		return centerText2Color;
	}

	public void setCenterText2Color(int centerText2Color) {
		this.centerText2Color = centerText2Color;
	}

	public int getCenterText2FontSize() {
		return centerText2FontSize;
	}

	public void setCenterText2FontSize(int centerText2FontSize) {
		this.centerText2FontSize = centerText2FontSize;
	}

	public Typeface getCenterText2Typeface() {
		return centerText2Typeface;
	}

	public void setCenterText2Typeface(Typeface text2Typeface) {
		this.centerText2Typeface = text2Typeface;
	}

	public ValueFormatter getFormatter() {
		return formatter;
	}

	public PieChartData setFormatter(ValueFormatter formatter) {
		if (null == formatter) {
			this.formatter = new NumberValueFormatter();
		} else {
			this.formatter = formatter;
		}
		return this;
	}
}
