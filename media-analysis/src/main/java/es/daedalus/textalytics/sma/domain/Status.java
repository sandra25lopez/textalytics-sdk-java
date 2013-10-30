package es.daedalus.textalytics.sma.domain;

public class Status {
		private int code;
		private String message;
		private String moreInfo;
		
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getMoreInfo() {
			return moreInfo;
		}
		public void setMoreInfo(String moreInfo) {
			this.moreInfo = moreInfo;
		}
		
		@Override
		public String toString() {
			return "Status [code=" + code + ", message=" + message
					+ ", moreInfo=" + moreInfo + "]";
		}
		
		
		
}
