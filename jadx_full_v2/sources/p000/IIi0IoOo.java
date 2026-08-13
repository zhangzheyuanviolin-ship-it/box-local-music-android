            package p000;

            import java.io.IOException;
            import java.math.BigDecimal;
            
            public abstract class IIi0IoOo extends IIOoOiOI {
                static {
/* 1 */             IIOool[] iIOoolArr = IIOool.I00iiO;
                }

                public static IIi0IoOo I00l0I0l0lO1(String str) throws IOException {
/* 12 */            if (str.length() == 1) {
/* 14 */                char cCharAt = str.charAt(0);
/* 20 */                if ('0' <= cCharAt && cCharAt <= '9') {
/* 30 */                    return IIOool.I00o0iI0io1(cCharAt - 48);
                        }
/* 37 */                if (cCharAt == '-' || cCharAt == '.') {
/* 50 */                    return IIOool.I00iio;
                        }
/* 46 */                IioIoO10iOiI.I000OOo1O("Not a number: ".concat(str));
/* 5 */                 return null;
                    }
/* 53 */            int length = str.length();
/* 60 */            for (int i = 0; i < length; i++) {
/* 62 */                char cCharAt2 = str.charAt(i);
/* 66 */                if (cCharAt2 == '.' || cCharAt2 == 'e') {
/* 78 */                    IIOolo0l iIOolo0l = new IIOolo0l();
                            try {
/* 81 */                        iIOolo0l.I00iiI = str;
/* 90 */                        iIOolo0l.I00iOIl = new BigDecimal(iIOolo0l.I00iiI);
/* 92 */                        iIOolo0l.I00o0iI0io1();
/* 95 */                        return iIOolo0l;
                            } catch (NumberFormatException e) {
/* 107 */                       if (str.startsWith("--")) {
/* 113 */                           iIOolo0l.I00iiI = str.substring(1);
                                } else {
/* 122 */                           if (!str.matches("^0\\.0*\\-\\d+")) {
/* 181 */                               throw new IOException(IlIi0I0.I000lI("Error expected floating point number actual='", str, "'"), e);
                                    }
/* 146 */                           iIOolo0l.I00iiI = "-" + iIOolo0l.I00iiI.replaceFirst("\\-", "");
                                }
                                try {
/* 155 */                           iIOolo0l.I00iOIl = new BigDecimal(iIOolo0l.I00iiI);
/* 157 */                           iIOolo0l.I00o0iI0io1();
/* 160 */                           return iIOolo0l;
                                } catch (NumberFormatException e2) {
/* 171 */                           throw new IOException(IlIi0I0.I000lI("Error expected floating point number actual='", str, "'"), e2);
                                }
                            }
                        }
                    }
                    try {
                        return str.charAt(0) == '+' ? IIOool.I00o0iI0io1(Long.parseLong(str.substring(1))) : IIOool.I00o0iI0io1(Long.parseLong(str));
                    } catch (NumberFormatException unused) {
/* 239 */               if (((str.startsWith("+") || str.startsWith("-")) ? str.substring(1) : str).matches("[0-9]*")) {
                            return str.startsWith("-") ? IIOool.I00io1l : IIOool.I00ilO0;
                        }
/* 257 */               IioIoO10iOiI.I000OOo1O("Not a number: ".concat(str));
/* 5 */                 return null;
                    }
                }

                public abstract float I00ioIO();

                public abstract int I00lli11();

                public abstract long I00lll10();
            }
