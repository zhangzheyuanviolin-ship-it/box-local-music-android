            package p000;

            import java.io.Serializable;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            
            public final class il1OoiO10iI extends il0ioI1OI {
                public Serializable I00iOIl;

                public static boolean I000OiO(il1OoiO10iI il1ooio10ii) {
/* 1 */             Serializable serializable = il1ooio10ii.I00iOIl;
/* 5 */             if (!(serializable instanceof Number)) {
/* 31 */                return false;
                    }
/* 7 */             Number number = (Number) serializable;
                    return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
                }

                public final long I0000O() {
                    return this.I00iOIl instanceof Number ? I0000oI00().longValue() : Long.parseLong(I0001Ioi1lo());
                }

                public final Number I0000oI00() {
/* 1 */             Serializable serializable = this.I00iOIl;
/* 5 */             if (serializable instanceof Number) {
/* 7 */                 return (Number) serializable;
                    }
/* 12 */            if (serializable instanceof String) {
/* 18 */                return new ilI0OO((String) serializable);
                    }
/* 24 */            OoOil11Ol1o.I000OiO("Primitive is neither a number nor a string");
/* 27 */            return null;
                }

                public final String I0001Ioi1lo() {
/* 1 */             Serializable serializable = this.I00iOIl;
/* 5 */             if (serializable instanceof String) {
/* 50 */                return (String) serializable;
                    }
/* 9 */             if (serializable instanceof Number) {
/* 45 */                return I0000oI00().toString();
                    }
/* 13 */            if (serializable instanceof Boolean) {
/* 17 */                return ((Boolean) serializable).toString();
                    }
/* 36 */            I000II.I000O01llI0("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
/* 39 */            return null;
                }

                public final BigInteger I000OOo1O() {
/* 1 */             Serializable serializable = this.I00iOIl;
/* 5 */             if (serializable instanceof BigInteger) {
/* 7 */                 return (BigInteger) serializable;
                    }
/* 14 */            if (I000OiO(this)) {
/* 24 */                return BigInteger.valueOf(I0000oI00().longValue());
                    }
/* 29 */            String strI0001Ioi1lo = I0001Ioi1lo();
/* 33 */            liloi1.I00000oOI(strI0001Ioi1lo);
/* 38 */            return new BigInteger(strI0001Ioi1lo);
                }

                public final boolean equals(Object obj) {
/* 1 */             Serializable serializable = this.I00iOIl;
/* 3 */             if (this == obj) {
/* 191 */               return true;
                    }
/* 7 */             if (obj == null || il1OoiO10iI.class != obj.getClass()) {
/* 198 */               return false;
                    }
/* 19 */            il1OoiO10iI il1ooio10ii = (il1OoiO10iI) obj;
/* 21 */            Serializable serializable2 = il1ooio10ii.I00iOIl;
/* 27 */            if (I000OiO(this) && I000OiO(il1ooio10ii)) {
                        return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? I000OOo1O().equals(il1ooio10ii.I000OOo1O()) : I0000oI00().longValue() == il1ooio10ii.I0000oI00().longValue();
                    }
/* 81 */            if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
/* 193 */               return serializable.equals(serializable2);
                    }
/* 89 */            if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
                        return (serializable instanceof BigDecimal ? (BigDecimal) serializable : liloi1.I00000oIO(I0001Ioi1lo())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : liloi1.I00000oIO(il1ooio10ii.I0001Ioi1lo())) == 0;
                    }
/* 149 */           double dDoubleValue = serializable instanceof Number ? I0000oI00().doubleValue() : Double.parseDouble(I0001Ioi1lo());
/* 170 */           double dDoubleValue2 = serializable2 instanceof Number ? il1ooio10ii.I0000oI00().doubleValue() : Double.parseDouble(il1ooio10ii.I0001Ioi1lo());
/* 176 */           if (dDoubleValue != dDoubleValue2) {
                        return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
                    }
/* 191 */           return true;
                }

                public final int hashCode() {
                    long jDoubleToLongBits;
/* 1 */             Serializable serializable = this.I00iOIl;
/* 9 */             if (I000OiO(this)) {
/* 15 */                jDoubleToLongBits = I0000oI00().longValue();
                    } else {
/* 26 */                if (!(serializable instanceof Number)) {
/* 41 */                    return serializable.hashCode();
                        }
/* 36 */                jDoubleToLongBits = Double.doubleToLongBits(I0000oI00().doubleValue());
                    }
/* 22 */            return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                }
            }
