            package p000;
            
            public final class IOO1O00oI {
                public float I00000oIO;
                public float I00000oOI;

                public static boolean I00000oOI(Float f, Float f2) {
                    return f.floatValue() <= f2.floatValue();
                }

                public final boolean I00000oIO(Float f) {
/* 1 */             float fFloatValue = f.floatValue();
                    return fFloatValue >= this.I00000oIO && fFloatValue <= this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IOO1O00oI)) {
/* 41 */                return false;
                    }
/* 5 */             float f = this.I00000oIO;
/* 7 */             float f2 = this.I00000oOI;
/* 11 */            if (f > f2) {
/* 14 */                IOO1O00oI iOO1O00oI = (IOO1O00oI) obj;
/* 22 */                if (iOO1O00oI.I00000oIO > iOO1O00oI.I00000oOI) {
/* 39 */                    return true;
                        }
                    }
/* 25 */            IOO1O00oI iOO1O00oI2 = (IOO1O00oI) obj;
                    return f == iOO1O00oI2.I00000oIO && f2 == iOO1O00oI2.I00000oOI;
                }

                public final int hashCode() {
/* 1 */             float f = this.I00000oIO;
/* 3 */             float f2 = this.I00000oOI;
/* 7 */             if (f > f2) {
/* 9 */                 return -1;
                    }
/* 21 */            return Float.hashCode(f2) + (Float.hashCode(f) * 31);
                }

                public final String toString() {
/* 21 */            return this.I00000oIO + ".." + this.I00000oOI;
                }
            }
