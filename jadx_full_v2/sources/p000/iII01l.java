            package p000;

            import java.math.BigDecimal;
            import java.math.RoundingMode;
            import java.text.DecimalFormat;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class iII01l implements iO0iIIoO11 {
                public final Double I00iOIl;

                public iII01l(Double d) {
/* 4 */             if (d == null) {
/* 12 */                this.I00iOIl = Double.valueOf(Double.NaN);
                    } else {
/* 15 */                this.I00iOIl = d;
                    }
                }

                @Override
                public final iO0iIIoO11 I00000oOI(String str, OillOo0 oillOo0, ArrayList arrayList) {
/* 7 */             if ("toString".equals(str)) {
/* 15 */                return new iOO00I0O(zzc());
                    }
/* 31 */            I000II.I000iOII(Oi010OO0.I001IIilI0O(zzc(), ".", str, " is not a function."));
/* 34 */            return null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof iII01l) {
/* 17 */                return this.I00iOIl.equals(((iII01l) obj).I00iOIl);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 1 */             return zzc();
                }

                @Override
                public final String zzc() throws NumberFormatException {
/* 1 */             Double d = this.I00iOIl;
/* 11 */            if (Double.isNaN(d.doubleValue())) {
/* 13 */                return "NaN";
                    }
/* 24 */            if (Double.isInfinite(d.doubleValue())) {
                        return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
                    }
/* 50 */            BigDecimal bigDecimalStripTrailingZeros = BigDecimal.valueOf(d.doubleValue()).stripTrailingZeros();
/* 58 */            DecimalFormat decimalFormat = new DecimalFormat("0E0");
/* 63 */            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
/* 84 */            decimalFormat.setMinimumFractionDigits((bigDecimalStripTrailingZeros.scale() > 0 ? bigDecimalStripTrailingZeros.precision() : bigDecimalStripTrailingZeros.scale()) - 1);
/* 87 */            String str = decimalFormat.format(bigDecimalStripTrailingZeros);
/* 93 */            int iIndexOf = str.indexOf("E");
/* 97 */            if (iIndexOf <= 0) {
/* 245 */               return str;
                    }
/* 105 */           int i = Integer.parseInt(str.substring(iIndexOf + 1));
                    return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalStripTrailingZeros.toPlainString();
                }

                @Override
                public final Double zzd() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final Boolean zze() {
/* 1 */             Double d = this.I00iOIl;
/* 11 */            boolean z = false;
/* 12 */            if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
/* 24 */                z = true;
                    }
/* 25 */            return Boolean.valueOf(z);
                }

                @Override
                public final Iterator zzf() {
/* 1 */             return null;
                }

                @Override
                public final iO0iIIoO11 zzt() {
/* 5 */             return new iII01l(this.I00iOIl);
                }
            }
