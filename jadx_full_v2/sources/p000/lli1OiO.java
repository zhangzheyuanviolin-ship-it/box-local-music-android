            package p000;

            import android.os.Bundle;
            import android.util.Log;
            
            public final class lli1OiO {
                public final int I00000oIO;
                public final OloIlI0ll I00000oOI = new OloIlI0ll();
                public final int I0000Il00O;
                public final Bundle I0000O;
                public final int I0000oI00;

                public lli1OiO(int i, int i2, Bundle bundle, int i3) {
/* 1 */             this.I0000oI00 = i3;
/* 13 */            this.I00000oIO = i;
/* 15 */            this.I0000Il00O = i2;
/* 17 */            this.I0000O = bundle;
                }

                public final boolean I00000oIO() {
                    switch (this.I0000oI00) {
                        case 0:
/* 8 */                     return true;
                        default:
/* 6 */                     return false;
                    }
                }

                public final void I00000oOI(Bundle bundle) {
/* 8 */             if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 31 */                new StringBuilder(toString().length() + 16 + String.valueOf(bundle).length());
                    }
/* 36 */            this.I00000oOI.I00000oOI(bundle);
                }

                public final void I0000Il00O(I1o1lOlooI1 i1o1lOlooI1) {
/* 8 */             if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 31 */                new StringBuilder(toString().length() + 14 + i1o1lOlooI1.toString().length());
                    }
/* 36 */            this.I00000oOI.I00000oIO(i1o1lOlooI1);
                }

                public final String toString() {
/* 1 */             int i = this.I0000Il00O;
/* 7 */             int length = String.valueOf(i).length();
/* 11 */            int i2 = this.I00000oIO;
/* 17 */            int length2 = String.valueOf(i2).length();
/* 21 */            boolean zI00000oIO = I00000oIO();
/* 43 */            StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(zI00000oIO).length() + 1);
/* 50 */            IIlIOloOOO.I001l0I00(sb, "Request { what=", i, " id=", i2);
/* 55 */            sb.append(" oneWay=");
/* 58 */            sb.append(zI00000oIO);
/* 63 */            sb.append("}");
/* 66 */            return sb.toString();
                }
            }
