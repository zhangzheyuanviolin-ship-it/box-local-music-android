            package p000;

            import java.util.Arrays;
            
            public final class iiooi0i00l {
                public Object[] I00000oIO = new Object[4];
                public int I00000oOI = 0;
                public boolean I0000Il00O;

                public final void I00000oIO(Object obj) {
/* 1 */             obj.getClass();
/* 8 */             I00000oOI(this.I00000oOI + 1);
/* 11 */            Object[] objArr = this.I00000oIO;
/* 13 */            int i = this.I00000oOI;
/* 17 */            this.I00000oOI = i + 1;
/* 19 */            objArr[i] = obj;
                }

                public final void I00000oOI(int i) {
/* 1 */             Object[] objArr = this.I00000oIO;
/* 3 */             int length = objArr.length;
/* 5 */             if (length >= i) {
/* 35 */                if (this.I0000Il00O) {
/* 43 */                    this.I00000oIO = (Object[]) objArr.clone();
/* 45 */                    this.I0000Il00O = false;
/* 49 */                    return;
                        }
/* 49 */                return;
                    }
/* 10 */            int iI0000Il00O = length + (length >> 1) + 1;
/* 12 */            if (iI0000Il00O < i) {
/* 15 */                iI0000Il00O = OooioIOo1.I0000Il00O(i, -1);
                    }
/* 19 */            if (iI0000Il00O < 0) {
/* 21 */                iI0000Il00O = Integer.MAX_VALUE;
                    }
/* 28 */            this.I00000oIO = Arrays.copyOf(objArr, iI0000Il00O);
/* 30 */            this.I0000Il00O = false;
                }

                public final ilIIoll0ll I0000Il00O() {
/* 2 */             this.I0000Il00O = true;
/* 4 */             Object[] objArr = this.I00000oIO;
/* 6 */             int i = this.I00000oOI;
/* 8 */             il00ii il00iiVar = il0II0OO1.I00iiI;
                    return i == 0 ? ilIIoll0ll.I00ilI0I1 : new ilIIoll0ll(objArr, i);
                }
            }
