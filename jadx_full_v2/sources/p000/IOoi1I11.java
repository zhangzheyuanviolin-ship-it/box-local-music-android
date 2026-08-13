            package p000;
            
            public final class IOoi1I11 extends I01O1lIi implements OOlo0i0 {
                public final int I00iiI;
                public final OI1Iio0ii1 I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOoi1I11(Object obj, O0iIl1 o0iIl1, OI1Iio0ii1 oI1Iio0ii1, int i) {
/* 3 */             super(o0iIl1);
/* 1 */             this.I00iiI = i;
/* 6 */             this.I00iio = obj;
/* 8 */             this.I00iiO = oI1Iio0ii1;
                }

                public final OI1Iio0ii1 I010OIo1l() {
                    switch (this.I00iiI) {
                    }
/* 6 */             return this.I00iiO;
                }

                public final String toString() {
/* 1 */             int i = this.I00iiI;
/* 5 */             Object obj = this.I00iio;
                    switch (i) {
                        case 0:
/* 55 */                    return getType() + ": Ctx { " + ((OI000ilOol) obj) + " }";
                        default:
/* 25 */                    return "Cxt { " + ((IIiIoIl11IO) obj) + " }";
                    }
                }
            }
