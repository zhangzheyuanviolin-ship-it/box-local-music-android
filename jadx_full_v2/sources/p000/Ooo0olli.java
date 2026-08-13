            package p000;
            
/* 21 */    public abstract class Ooo0olli extends Ooo0oOOIl {
                public OO0iO1ll00[] I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;

                public Ooo0olli(Ooo0olli ooo0olli) {
/* 5 */             this.I00000oIO = null;
/* 8 */             this.I0000Il00O = 0;
/* 12 */            this.I00000oOI = ooo0olli.I00000oOI;
/* 20 */            this.I00000oIO = l1ooi0IOi.I0000Il00O(ooo0olli.I00000oIO);
                }

                public OO0iO1ll00[] getPathData() {
/* 1 */             return this.I00000oIO;
                }

                public String getPathName() {
/* 1 */             return this.I00000oOI;
                }

                public void setPathData(OO0iO1ll00[] oO0iO1ll00Arr) {
/* 1 */             OO0iO1ll00[] oO0iO1ll00Arr2 = this.I00000oIO;
/* 3 */             if (oO0iO1ll00Arr2 != null && oO0iO1ll00Arr != null && oO0iO1ll00Arr2.length == oO0iO1ll00Arr.length) {
/* 16 */                for (int i = 0; i < oO0iO1ll00Arr2.length; i++) {
/* 18 */                    OO0iO1ll00 oO0iO1ll00 = oO0iO1ll00Arr2[i];
/* 20 */                    char c = oO0iO1ll00.I00000oIO;
/* 22 */                    OO0iO1ll00 oO0iO1ll002 = oO0iO1ll00Arr[i];
/* 26 */                    if (c == oO0iO1ll002.I00000oIO && oO0iO1ll00.I00000oOI.length == oO0iO1ll002.I00000oOI.length) {
                            }
                        }
/* 40 */                OO0iO1ll00[] oO0iO1ll00Arr3 = this.I00000oIO;
/* 44 */                for (int i2 = 0; i2 < oO0iO1ll00Arr.length; i2++) {
/* 52 */                    oO0iO1ll00Arr3[i2].I00000oIO = oO0iO1ll00Arr[i2].I00000oIO;
/* 54 */                    int i3 = 0;
                            while (true) {
/* 57 */                        float[] fArr = oO0iO1ll00Arr[i2].I00000oOI;
/* 60 */                        if (i3 < fArr.length) {
/* 68 */                            oO0iO1ll00Arr3[i2].I00000oOI[i3] = fArr[i3];
/* 70 */                            i3++;
                                }
                            }
                        }
/* 76 */                return;
                    }
/* 81 */            this.I00000oIO = l1ooi0IOi.I0000Il00O(oO0iO1ll00Arr);
                }

/* 22 */        public Ooo0olli() {
/* 24 */            this.I00000oIO = null;
/* 25 */            this.I0000Il00O = 0;
                }
            }
