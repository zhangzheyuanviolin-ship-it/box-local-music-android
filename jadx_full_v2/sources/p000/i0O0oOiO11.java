            package p000;

            import java.util.HashMap;
            
            public final class i0O0oOiO11 {
                public HashMap I00000oIO;

                public final synchronized double I00000oIO(String str) {
/* 8 */             Double d = (Double) this.I00000oIO.get(str);
/* 10 */            if (d == null) {
/* 13 */                return 0.0d;
                    }
/* 16 */            return d.doubleValue();
                }

                public final synchronized void I00000oOI(String str) {
/* 10 */            this.I00000oIO.put(str, Double.valueOf(0.0d));
                }
            }
