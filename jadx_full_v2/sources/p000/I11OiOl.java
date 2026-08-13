            package p000;

            import com.google.android.gms.common.api.Status;
            
            public class I11OiOl extends Exception {
                public final Status I00iOIl;

                public I11OiOl(Status status) {
/* 1 */             int i = status.I00iOIl;
/* 3 */             String str = status.I00iiI;
/* 8 */             str = str == null ? "" : str;
/* 31 */            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
/* 34 */            sb.append(i);
/* 39 */            sb.append(": ");
/* 42 */            sb.append(str);
/* 49 */            super(sb.toString());
/* 52 */            this.I00iOIl = status;
                }
            }
