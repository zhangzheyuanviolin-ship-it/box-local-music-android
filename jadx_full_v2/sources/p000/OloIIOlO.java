            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OloIIOlO implements I10ooi {
                public final Ooo1lO01O0 I00000oIO;
                public final OoIoOiiO1 I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;
                public I110ooool I0000oI00;
                public I110ooool I0001Ioi1lo;
                public final I110ooool I000II;
                public long I000O01llI0;
                public I110ooool I000OOo1O;

                public OloIIOlO(I110IiI0o1Il i110IiI0o1Il, OoIoOiiO1 ooIoOiiO1, Object obj, Object obj2, I110ooool i110ooool) {
/* 8 */             this.I00000oIO = i110IiI0o1Il.I00000oIO(ooIoOiiO1);
/* 10 */            this.I00000oOI = ooIoOiiO1;
/* 12 */            this.I0000Il00O = obj2;
/* 14 */            this.I0000O = obj;
/* 24 */            this.I0000oI00 = (I110ooool) ooIoOiiO1.I00000oIO.invoke(obj);
/* 26 */            Function1 function1 = ooIoOiiO1.I00000oIO;
/* 34 */            this.I0001Ioi1lo = (I110ooool) function1.invoke(obj2);
/* 53 */            this.I000II = i110ooool != null ? iOO0I0o1i0Il.I00000oIO(i110ooool) : ((I110ooool) function1.invoke(obj)).I0000Il00O();
/* 57 */            this.I000O01llI0 = -1L;
                }

                @Override
                public final boolean I00000oIO() {
/* 3 */             return this.I00000oIO.I00000oIO();
                }

                @Override
                public final long I00000oOI() {
/* 1 */             long j = this.I000O01llI0;
/* 7 */             if (j >= 0) {
/* 55 */                return j;
                    }
/* 17 */            long jI00000oOI = this.I00000oIO.I00000oOI(this.I0000oI00, this.I0001Ioi1lo, this.I000II);
/* 21 */            this.I000O01llI0 = jI00000oOI;
/* 55 */            return jI00000oOI;
                }

                @Override
                public final OoIoOiiO1 I0000Il00O() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final I110ooool I0000O(long j) {
/* 5 */             if (!I0000oI00(j)) {
/* 16 */                return this.I00000oIO.I000oI1ioi(j, this.I0000oI00, this.I0001Ioi1lo, this.I000II);
                    }
/* 21 */            I110ooool i110ooool = this.I000OOo1O;
/* 23 */            if (i110ooool != null) {
/* 77 */                return i110ooool;
                    }
/* 33 */            I110ooool i110oooolI00Io1o110i = this.I00000oIO.I00Io1o110i(this.I0000oI00, this.I0001Ioi1lo, this.I000II);
/* 37 */            this.I000OOo1O = i110oooolI00Io1o110i;
/* 77 */            return i110oooolI00Io1o110i;
                }

                public final void I0001Ioi1lo(Object obj) {
/* 7 */             if (O0000Ioio00.I0000O(obj, this.I0000O)) {
/* 77 */                return;
                    }
/* 9 */             this.I0000O = obj;
/* 21 */            this.I0000oI00 = (I110ooool) this.I00000oOI.I00000oIO.invoke(obj);
/* 24 */            this.I000OOo1O = null;
/* 28 */            this.I000O01llI0 = -1L;
                }

                @Override
                public final Object I000II(long j) {
/* 5 */             if (I0000oI00(j)) {
/* 82 */                return this.I0000Il00O;
                    }
/* 16 */            I110ooool i110oooolI00Io1lO = this.I00000oIO.I00Io1lO(j, this.I0000oI00, this.I0001Ioi1lo, this.I000II);
/* 20 */            int iI00000oOI = i110oooolI00Io1lO.I00000oOI();
/* 25 */            for (int i = 0; i < iI00000oOI; i++) {
/* 35 */                if (Float.isNaN(i110oooolI00Io1lO.I00000oIO(i))) {
/* 67 */                    OO1olIl.I00000oOI("AnimationVector cannot contain a NaN. " + i110oooolI00Io1lO + ". Animation: " + this + ", playTimeNanos: " + j);
                        }
                    }
/* 77 */            return this.I00000oOI.I00000oOI.invoke(i110oooolI00Io1lO);
                }

                @Override
                public final Object I000O01llI0() {
/* 1 */             return this.I0000Il00O;
                }

                public final void I000OOo1O(Object obj) {
/* 7 */             if (O0000Ioio00.I0000O(this.I0000Il00O, obj)) {
/* 77 */                return;
                    }
/* 9 */             this.I0000Il00O = obj;
/* 21 */            this.I0001Ioi1lo = (I110ooool) this.I00000oOI.I00000oIO.invoke(obj);
/* 24 */            this.I000OOo1O = null;
/* 28 */            this.I000O01llI0 = -1L;
                }

                public final String toString() {
/* 59 */            return "TargetBasedAnimation: " + this.I0000O + " -> " + this.I0000Il00O + ",initial velocity: " + this.I000II + ", duration: " + (I00000oOI() / 1000000) + " ms,animationSpec: " + this.I00000oIO;
                }
            }
