package interface_46;

public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface {

	@Override
	public double cong(double a, double b) {
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		return a/b;
	}


	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		int i,j, min_id;
		for(i=0; i<n-1; i++) {
			min_id = i;
			for(j = i+1; j <n ; j++) {
				if(arr[j] < arr[min_id])
					min_id =j;
			}
			double temp = arr[min_id];
			arr[min_id] = arr[i];
			arr[i] = temp;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		int i,j, min_id;
		for(i=0; i<n-1; i++) {
			min_id = i;
			for(j = i+1; j <n ; j++) {
				if(arr[j] > arr[min_id])
					min_id =j;
			}
			double temp = arr[min_id];
			arr[min_id] = arr[i];
			arr[i] = temp;
		}
	}

}
