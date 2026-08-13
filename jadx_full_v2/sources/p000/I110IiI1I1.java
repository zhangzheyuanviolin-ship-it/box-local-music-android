            package p000;
            
/* 37 */    public final class I110IiI1I1 implements OlO01l1oOil {
                public final OoIoOiiO1 I00iOIl;
                public final OIooliIO0 I00iiI;
                public I110ooool I00iiO;
                public long I00iio;
                public long I00ilI0I1;
                public boolean I00ilO0;

                public I110IiI1I1(OoIoOiiO1 ooIoOiiO1, Object obj, I110ooool i110ooool, long j, long j2, boolean z) {
                    I110ooool i110oooolI00000oIO;
/* 4 */             this.I00iOIl = ooIoOiiO1;
/* 10 */            this.I00iiI = lOO00IiI0li.I00000oIO(obj);
/* 12 */            if (i110ooool != null) {
/* 14 */                i110oooolI00000oIO = iOO0I0o1i0Il.I00000oIO(i110ooool);
                    } else {
/* 25 */                i110oooolI00000oIO = (I110ooool) ooIoOiiO1.I00000oIO.invoke(obj);
/* 27 */                i110oooolI00000oIO.I0000O();
                    }
/* 30 */            this.I00iiO = i110oooolI00000oIO;
/* 32 */            this.I00iio = j;
/* 34 */            this.I00ilI0I1 = j2;
/* 36 */            this.I00ilO0 = z;
                }

                public final Object I00000oIO() {
/* 7 */             return this.I00iOIl.I00000oOI.invoke(this.I00iiO);
                }

                @Override
                public final Object getValue() {
/* 3 */             return this.I00iiI.getValue();
                }

                public final String toString() {
/* 64 */            return "AnimationState(value=" + this.I00iiI.getValue() + ", velocity=" + I00000oIO() + ", isRunning=" + this.I00ilO0 + ", lastFrameTimeNanos=" + this.I00iio + ", finishedTimeNanos=" + this.I00ilI0I1 + ")";
                }

/* 38 */        public I110IiI1I1(OoIoOiiO1 ooIoOiiO1, Object obj, I110ooool i110ooool, int i) {
/* 39 */            this(ooIoOiiO1, obj, (i & 4) != 0 ? null : i110ooool, Long.MIN_VALUE, Long.MIN_VALUE, false);
                }
            }
