            package p000;

            import java.util.HashMap;
            
            public abstract class IIOO0I {
                public final boolean I00000oIO;
                public final HashMap I00000oOI = new HashMap(250);
                public final HashMap I0000Il00O = new HashMap(250);
                public final HashMap I0000O = new HashMap(250);
                public final HashMap I0000oI00 = new HashMap();
                public final HashMap I0001Ioi1lo = new HashMap(250);

                public IIOO0I(boolean z) {
/* 41 */            this.I00000oIO = z;
                }

                public final void I00000oIO(int i, int i2) {
/* 3 */             if (!this.I00000oIO) {
/* 34 */                I000II.I001IO000("Not a CIDFont");
/* 89 */                return;
                    }
/* 15 */            this.I00000oOI.put(Integer.valueOf(i2), Integer.valueOf(i));
/* 28 */            this.I0000oI00.put(Integer.valueOf(i), Integer.valueOf(i2));
                }

                public final void I00000oOI(int i, int i2, String str) {
/* 3 */             if (this.I00000oIO) {
/* 52 */                I000II.I001IO000("Not a Type 1-equivalent font");
/* 215 */               return;
                    }
/* 15 */            this.I00000oOI.put(Integer.valueOf(i2), Integer.valueOf(i));
/* 28 */            this.I0000Il00O.put(Integer.valueOf(i), Integer.valueOf(i2));
/* 37 */            this.I0000O.put(str, Integer.valueOf(i2));
/* 46 */            this.I0001Ioi1lo.put(Integer.valueOf(i), str);
                }

                public int I0000Il00O(int i) {
/* 4 */             if (!this.I00000oIO) {
/* 28 */                I000II.I001IO000("Not a CIDFont");
/* 3 */                 return 0;
                    }
/* 16 */            Integer num = (Integer) this.I00000oOI.get(Integer.valueOf(i));
/* 18 */            if (num == null) {
/* 3 */                 return 0;
                    }
/* 21 */            return num.intValue();
                }

                public final int I0000O(int i) {
/* 4 */             if (this.I00000oIO) {
/* 28 */                I000II.I001IO000("Not a Type 1-equivalent font");
/* 3 */                 return 0;
                    }
/* 16 */            Integer num = (Integer) this.I00000oOI.get(Integer.valueOf(i));
/* 18 */            if (num == null) {
/* 3 */                 return 0;
                    }
/* 21 */            return num.intValue();
                }

                public final int I0000oI00(int i) {
/* 4 */             if (this.I00000oIO) {
/* 28 */                I000II.I001IO000("Not a Type 1-equivalent font");
/* 3 */                 return 0;
                    }
/* 16 */            Integer num = (Integer) this.I0000Il00O.get(Integer.valueOf(i));
/* 18 */            if (num == null) {
/* 3 */                 return 0;
                    }
/* 21 */            return num.intValue();
                }
            }
