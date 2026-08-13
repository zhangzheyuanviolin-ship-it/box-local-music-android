            package p000;

            import java.math.BigDecimal;
            
            public final class IIOolo0l extends IIi0IoOo {
                public BigDecimal I00iOIl;
                public String I00iiI;

                public IIOolo0l(float f) {
/* 10 */            BigDecimal bigDecimal = new BigDecimal(String.valueOf(f));
/* 13 */            this.I00iOIl = bigDecimal;
/* 23 */            this.I00iiI = I00oII(bigDecimal.toPlainString());
                }

                public static String I00oII(String str) {
/* 8 */             if (str.indexOf(46) > -1 && !str.endsWith(".0")) {
/* 24 */                while (str.endsWith(OIllioIilO.I01OO1I) && !str.endsWith(".0")) {
/* 39 */                    str = str.substring(0, str.length() - 1);
                        }
                    }
/* 49 */            return str;
                }

                @Override
                public final float I00ioIO() {
/* 3 */             return this.I00iOIl.floatValue();
                }

                @Override
                public final int I00lli11() {
/* 3 */             return this.I00iOIl.intValue();
                }

                @Override
                public final long I00lll10() {
/* 3 */             return this.I00iOIl.longValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00o0iI0io1() {
/* 3 */             float fFloatValue = this.I00iOIl.floatValue();
/* 9 */             double dDoubleValue = this.I00iOIl.doubleValue();
/* 19 */            boolean z = true;
/* 20 */            if (fFloatValue == Float.NEGATIVE_INFINITY || fFloatValue == Float.POSITIVE_INFINITY) {
/* 60 */                if (Math.abs(dDoubleValue) > 3.4028234663852886E38d) {
/* 73 */                    fFloatValue = (fFloatValue == Float.POSITIVE_INFINITY ? 1 : -1) * Float.MAX_VALUE;
                        } else {
/* 75 */                    z = false;
                        }
                    } else if (fFloatValue != 0.0f || dDoubleValue == 0.0d || Math.abs(dDoubleValue) >= 1.1754943508222875E-38d) {
                    }
/* 76 */            if (z) {
/* 79 */                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(fFloatValue);
/* 83 */                this.I00iOIl = bigDecimalValueOf;
/* 93 */                this.I00iiI = I00oII(bigDecimalValueOf.toPlainString());
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IIOolo0l) && Float.floatToIntBits(((IIOolo0l) obj).I00iOIl.floatValue()) == Float.floatToIntBits(this.I00iOIl.floatValue());
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 12 */            return IIl001iO0Io.I00100l0(new StringBuilder("COSFloat{"), this.I00iiI, "}");
                }
            }
