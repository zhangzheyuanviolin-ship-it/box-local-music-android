            package p000;

            import java.io.Serializable;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.Objects;
            
            public final class O01li1IO extends O01O10Ii {
                public Serializable I00iOIl;

                public O01li1IO(String str) {
/* 4 */             Objects.requireNonNull(str);
/* 7 */             this.I00iOIl = str;
                }

                public static boolean I000iOII(O01li1IO o01li1IO) {
/* 1 */             Serializable serializable = o01li1IO.I00iOIl;
/* 5 */             if (!(serializable instanceof Number)) {
/* 31 */                return false;
                    }
/* 7 */             Number number = (Number) serializable;
                    return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
                }

                @Override
                public final String I0000O() {
/* 1 */             Serializable serializable = this.I00iOIl;
/* 5 */             if (serializable instanceof String) {
/* 7 */                 return (String) serializable;
                    }
/* 12 */            if (serializable instanceof Number) {
/* 18 */                return I000OiO().toString();
                    }
/* 25 */            if (serializable instanceof Boolean) {
/* 29 */                return ((Boolean) serializable).toString();
                    }
/* 110 */           throw new AssertionError("Unexpected value type: " + serializable.getClass());
                }

                public final BigInteger I0000oI00() {
/* 1 */             Serializable serializable = this.I00iOIl;
/* 5 */             if (serializable instanceof BigInteger) {
/* 7 */                 return (BigInteger) serializable;
                    }
/* 14 */            if (I000iOII(this)) {
/* 24 */                return BigInteger.valueOf(I000OiO().longValue());
                    }
/* 29 */            String strI0000O = I0000O();
/* 33 */            l1ioi10IIoO0.I00000oIO(strI0000O);
/* 38 */            return new BigInteger(strI0000O);
                }

                public final boolean I0001Ioi1lo() {
/* 1 */             Serializable serializable = this.I00iOIl;
                    return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(I0000O());
                }

                public final double I000OOo1O() {
                    return this.I00iOIl instanceof Number ? I000OiO().doubleValue() : Double.parseDouble(I0000O());
                }

                public final Number I000OiO() {
/* 1 */             Serializable serializable = this.I00iOIl;
/* 5 */             if (serializable instanceof Number) {
/* 7 */                 return (Number) serializable;
                    }
/* 12 */            if (serializable instanceof String) {
/* 18 */                return new O0ioIi((String) serializable);
                    }
/* 24 */            OoOil11Ol1o.I000OiO("Primitive is neither a number nor a string");
/* 27 */            return null;
                }

                public final boolean equals(Object obj) {
/* 1 */             Serializable serializable = this.I00iOIl;
/* 3 */             if (this == obj) {
/* 155 */               return true;
                    }
/* 7 */             if (obj == null || O01li1IO.class != obj.getClass()) {
/* 162 */               return false;
                    }
/* 19 */            O01li1IO o01li1IO = (O01li1IO) obj;
/* 21 */            Serializable serializable2 = o01li1IO.I00iOIl;
/* 27 */            if (I000iOII(this) && I000iOII(o01li1IO)) {
                        return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? I0000oI00().equals(o01li1IO.I0000oI00()) : I000OiO().longValue() == o01li1IO.I000OiO().longValue();
                    }
/* 80 */            if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
/* 157 */               return serializable.equals(serializable2);
                    }
/* 88 */            if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
                        return (serializable instanceof BigDecimal ? (BigDecimal) serializable : l1ioi10IIoO0.I00000oOI(I0000O())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : l1ioi10IIoO0.I00000oOI(o01li1IO.I0000O())) == 0;
                    }
/* 131 */           double dI000OOo1O = I000OOo1O();
/* 135 */           double dI000OOo1O2 = o01li1IO.I000OOo1O();
/* 141 */           if (dI000OOo1O != dI000OOo1O2) {
                        return Double.isNaN(dI000OOo1O) && Double.isNaN(dI000OOo1O2);
                    }
/* 155 */           return true;
                }

                public final int hashCode() {
                    long jDoubleToLongBits;
/* 1 */             Serializable serializable = this.I00iOIl;
/* 9 */             if (I000iOII(this)) {
/* 15 */                jDoubleToLongBits = I000OiO().longValue();
                    } else {
/* 26 */                if (!(serializable instanceof Number)) {
/* 41 */                    return serializable.hashCode();
                        }
/* 36 */                jDoubleToLongBits = Double.doubleToLongBits(I000OiO().doubleValue());
                    }
/* 22 */            return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                }
            }
