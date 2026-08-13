            package p000;

            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.lang.invoke.VarHandle;
            import java.net.Socket;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.TimeZone;
            import java.util.concurrent.TimeUnit;
            
            public abstract class OollIoI001lo {
                public static final byte[] I00000oIO;
                public static final Io1Io0OOi011 I00000oOI = illliIoo1l0O.I0000Il00O(new String[0]);
                public static final Oi1010 I0000Il00O;
                public static final OIil0IiIo I0000O;
                public static final TimeZone I0000oI00;
                public static final OOoiliiIoloI I0001Ioi1lo;
                public static final String I000II;

                static {
/* 2 */             byte[] bArr = new byte[0];
/* 4 */             I00000oIO = bArr;
/* 16 */            III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 19 */            iII1o0lOio0.I00ioIO(0, bArr);
/* 24 */            Oi1010 oi1010 = new Oi1010();
/* 29 */            oi1010.I00iOIl = 0L;
/* 31 */            oi1010.I00iiI = iII1o0lOio0;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            I0000Il00O = oi1010;
/* 40 */            I0000Il00O(0L, 0L, 0L);
/* 81 */            I0000O = l1lIlIOOOl0o.I00000oOI(iOiOoIiiI.I00000oIO("efbbbf"), iOiOoIiiI.I00000oIO("feff"), iOiOoIiiI.I00000oIO("fffe"), iOiOoIiiI.I00000oIO("0000ffff"), iOiOoIiiI.I00000oIO("ffff0000"));
/* 89 */            I0000oI00 = TimeZone.getTimeZone("GMT");
/* 98 */            I0001Ioi1lo = new OOoiliiIoloI("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
/* 118 */           I000II = OlOoOIi0o.I00IioO0OiOi(OlOoOIi0o.I00IOO("okhttp3.", OIOlo0OloOi.class.getName()), "Client");
                }

                public static final boolean I00000oIO(IoOi01OlIl1o ioOi01OlIl1o, IoOi01OlIl1o ioOi01OlIl1o2) {
                    return O0000Ioio00.I0000O(ioOi01OlIl1o.I0000O, ioOi01OlIl1o2.I0000O) && ioOi01OlIl1o.I0000oI00 == ioOi01OlIl1o2.I0000oI00 && O0000Ioio00.I0000O(ioOi01OlIl1o.I00000oIO, ioOi01OlIl1o2.I00000oIO);
                }

                public static final int I00000oOI() {
/* 3 */             if (TimeUnit.MILLISECONDS != null) {
/* 5 */                 return 10000;
                    }
/* 10 */            I000II.I001IO000("unit == null");
/* 13 */            return 0;
                }

                public static final void I0000Il00O(long j, long j2, long j3) {
/* 7 */             if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
/* 215 */               throw new ArrayIndexOutOfBoundsException();
                    }
                }

                public static final void I0000O(Closeable closeable) {
                    try {
/* 1 */                 closeable.close();
                    } catch (RuntimeException e) {
/* 49 */                throw e;
                    } catch (Exception unused) {
                    }
                }

                public static final void I0000oI00(Socket socket) throws IOException {
                    try {
/* 1 */                 socket.close();
                    } catch (AssertionError e) {
/* 49 */                throw e;
                    } catch (RuntimeException e2) {
/* 16 */                if (!O0000Ioio00.I0000O(e2.getMessage(), "bio == null")) {
/* 19 */                    throw e2;
                        }
                    } catch (Exception unused) {
                    }
                }

                public static final int I0001Ioi1lo(int i, int i2, String str, String str2) {
/* 1 */             while (i < i2) {
/* 11 */                if (OlOoOIi0o.I00100l0(str2, str.charAt(i))) {
/* 13 */                    return i;
                        }
/* 14 */                i++;
                    }
/* 483 */           return i2;
                }

                public static final int I000II(String str, char c, int i, int i2) {
/* 1 */             while (i < i2) {
/* 7 */                 if (str.charAt(i) == c) {
/* 9 */                     return i;
                        }
/* 10 */                i++;
                    }
/* 483 */           return i2;
                }

                public static final String I000O01llI0(String str, Object... objArr) {
/* 1 */             Locale locale = Locale.US;
/* 4 */             Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 13 */            return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }

                public static final boolean I000OOo1O(String[] strArr, String[] strArr2, Comparator comparator) {
/* 3 */             if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
/* 14 */                for (String str : strArr) {
/* 18 */                    I01I0Iioooo0 i01I0Iioooo0I00000oIO = iOO1OO.I00000oIO(strArr2);
/* 26 */                    while (i01I0Iioooo0I00000oIO.hasNext()) {
/* 38 */                        if (comparator.compare(str, (String) i01I0Iioooo0I00000oIO.next()) == 0) {
/* 40 */                            return true;
                                }
                            }
                        }
                    }
/* 2 */             return false;
                }

                public static final long I000OiO(Oi1001l0Il oi1001l0Il) {
/* 5 */             String strI00000oOI = oi1001l0Il.I00ilO0.I00000oOI("Content-Length");
/* 11 */            if (strI00000oOI == null) {
/* 9 */                 return -1L;
                    }
                    try {
/* 13 */                return Long.parseLong(strI00000oOI);
                    } catch (NumberFormatException unused) {
/* 9 */                 return -1L;
                    }
                }

                public static final List I000iOII(Object... objArr) {
/* 5 */             Object[] objArr2 = (Object[]) objArr.clone();
/* 16 */            return Collections.unmodifiableList(IOOi1I.I000O01llI0(Arrays.copyOf(objArr2, objArr2.length)));
                }

                public static final int I000l1(String str) {
/* 1 */             int length = str.length();
/* 6 */             for (int i = 0; i < length; i++) {
/* 8 */                 char cCharAt = str.charAt(i);
/* 18 */                if (O0000Ioio00.I0000oI00(cCharAt, 31) <= 0 || O0000Ioio00.I0000oI00(cCharAt, 127) >= 0) {
/* 32 */                    return i;
                        }
                    }
/* 33 */            return -1;
                }

                public static final int I000lI(int i, int i2, String str) {
/* 1 */             while (i < i2) {
/* 3 */                 char cCharAt = str.charAt(i);
/* 9 */                 if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
/* 34 */                    return i;
                        }
/* 31 */                i++;
                    }
/* 215 */           return i2;
                }

                public static final int I000o00OoI0I(int i, int i2, String str) {
                    int i3 = i2 - 1;
/* 3 */             if (i <= i3) {
                        while (true) {
/* 5 */                     char cCharAt = str.charAt(i3);
/* 11 */                    if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
/* 38 */                        return i3 + 1;
                            }
/* 33 */                    if (i3 == i) {
                                break;
                            }
                            i3--;
                        }
                    }
/* 215 */           return i;
                }

                public static final String[] I000oI1ioi(String[] strArr, String[] strArr2, Comparator comparator) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 9 */             for (String str : strArr) {
/* 13 */                int length = strArr2.length;
/* 14 */                int i = 0;
                        while (true) {
/* 15 */                    if (i >= length) {
                                break;
                            }
/* 23 */                    if (comparator.compare(str, strArr2[i]) == 0) {
/* 25 */                        arrayList.add(str);
                                break;
                            }
/* 29 */                    i++;
                        }
                    }
/* 41 */            return (String[]) arrayList.toArray(new String[0]);
                }

                public static final boolean I00100l0(String str) {
                    return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
                }

                public static final int I00100o1O0lo(char c) {
/* 3 */             if ('0' <= c && c < ':') {
/* 9 */                 return c - '0';
                    }
/* 13 */            if ('a' <= c && c < 'g') {
/* 19 */                return c - 'W';
                    }
/* 24 */            if ('A' > c || c >= 'G') {
/* 33 */                return -1;
                    }
/* 30 */            return c - '7';
                }

                public static final Charset I0010I0i(IIIIlO11I0lO iIIIlO11I0lO, Charset charset) {
/* 3 */             int iI00IO1oi11O = iIIIlO11I0lO.I00IO1oi11O(I0000O);
/* 8 */             if (iI00IO1oi11O == -1) {
/* 89 */                return charset;
                    }
/* 10 */            if (iI00IO1oi11O == 0) {
/* 65 */                return StandardCharsets.UTF_8;
                    }
/* 13 */            if (iI00IO1oi11O == 1) {
/* 62 */                return StandardCharsets.UTF_16BE;
                    }
/* 16 */            if (iI00IO1oi11O == 2) {
/* 59 */                return StandardCharsets.UTF_16LE;
                    }
/* 19 */            if (iI00IO1oi11O == 3) {
/* 44 */                Charset charset2 = IO1IOI.I00000oIO;
/* 46 */                Charset charset3 = IO1IOI.I0000oI00;
/* 48 */                if (charset3 != null) {
/* 58 */                    return charset3;
                        }
/* 52 */                Charset charsetForName = Charset.forName("UTF-32BE");
/* 56 */                IO1IOI.I0000oI00 = charsetForName;
/* 58 */                return charsetForName;
                    }
/* 22 */            if (iI00IO1oi11O != 4) {
/* 39 */                OoOil11Ol1o.I0000Il00O();
/* 42 */                return null;
                    }
/* 24 */            Charset charset4 = IO1IOI.I00000oIO;
/* 26 */            Charset charset5 = IO1IOI.I0000O;
/* 28 */            if (charset5 != null) {
/* 38 */                return charset5;
                    }
/* 32 */            Charset charsetForName2 = Charset.forName("UTF-32LE");
/* 36 */            IO1IOI.I0000O = charsetForName2;
/* 38 */            return charsetForName2;
                }

                public static final int I0010o(OOliO0 oOliO0) {
/* 24 */            return (oOliO0.readByte() & 255) | ((oOliO0.readByte() & 255) << 16) | ((oOliO0.readByte() & 255) << 8);
                }

                public static final boolean I00111O(OlI1ii olI1ii, int i) {
/* 1 */             long jNanoTime = System.nanoTime();
/* 30 */            long jI0000Il00O = olI1ii.timeout().I0000oI00() ? olI1ii.timeout().I0000Il00O() - jNanoTime : Long.MAX_VALUE;
/* 47 */            olI1ii.timeout().I0000O(Math.min(jI0000Il00O, TimeUnit.MILLISECONDS.toNanos(i)) + jNanoTime);
                    try {
/* 52 */                III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 65 */                while (olI1ii.read(iII1o0lOio0, 8192L) != -1) {
/* 67 */                    iII1o0lOio0.I00000oIO();
                        }
/* 76 */                if (jI0000Il00O == Long.MAX_VALUE) {
/* 82 */                    olI1ii.timeout().I00000oIO();
/* 75 */                    return true;
                        }
/* 91 */                olI1ii.timeout().I0000O(jNanoTime + jI0000Il00O);
/* 75 */                return true;
                    } catch (InterruptedIOException unused) {
/* 118 */               if (jI0000Il00O == Long.MAX_VALUE) {
/* 124 */                   olI1ii.timeout().I00000oIO();
/* 136 */                   return false;
                        }
/* 133 */               olI1ii.timeout().I0000O(jNanoTime + jI0000Il00O);
/* 136 */               return false;
                    } catch (Throwable th) {
/* 97 */                if (jI0000Il00O == Long.MAX_VALUE) {
/* 103 */                   olI1ii.timeout().I00000oIO();
                        } else {
/* 112 */                   olI1ii.timeout().I0000O(jNanoTime + jI0000Il00O);
                        }
/* 115 */               throw th;
                    }
                }

                public static final Io1Io0OOi011 I001IIilI0O(List list) {
/* 5 */             ArrayList arrayList = new ArrayList(20);
/* 8 */             Iterator it = list.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                Io1IiiI11 io1IiiI11 = (Io1IiiI11) it.next();
/* 24 */                IIOIIi1ilIO iIOIIi1ilIO = io1IiiI11.I00000oIO;
/* 26 */                IIOIIi1ilIO iIOIIi1ilIO2 = io1IiiI11.I00000oOI;
/* 28 */                String strI000o00OoI0I = iIOIIi1ilIO.I000o00OoI0I();
/* 32 */                String strI000o00OoI0I2 = iIOIIi1ilIO2.I000o00OoI0I();
/* 36 */                arrayList.add(strI000o00OoI0I);
/* 47 */                arrayList.add(OlOoOIi0o.I00OIo(strI000o00OoI0I2).toString());
                    }
/* 62 */            return new Io1Io0OOi011((String[]) arrayList.toArray(new String[0]));
                }

                public static final String I001IO000(IoOi01OlIl1o ioOi01OlIl1o, boolean z) {
/* 1 */             int i = ioOi01OlIl1o.I0000oI00;
/* 3 */             String strI000iOII = ioOi01OlIl1o.I0000O;
/* 12 */            if (OlOoOIi0o.I000oI1ioi(strI000iOII, ":", false)) {
/* 18 */                strI000iOII = IIl001iO0Io.I000iOII(']', "[", strI000iOII);
                    }
/* 22 */            if (!z) {
/* 24 */                String str = ioOi01OlIl1o.I00000oIO;
/* 49 */                if (i == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
/* 52 */                    return strI000iOII;
                        }
                    }
/* 66 */            return strI000iOII + ':' + i;
                }

                public static final List I001i1O0Ol(List list) {
/* 8 */             return Collections.unmodifiableList(new ArrayList(list));
                }

                public static final int I001i1lo1io(int i, String str) throws NumberFormatException {
/* 1 */             if (str == null) {
/* 89 */                return i;
                    }
                    try {
/* 3 */                 long j = Long.parseLong(str);
/* 12 */                if (j > 2147483647L) {
/* 14 */                    return Integer.MAX_VALUE;
                        }
/* 22 */                if (j < 0) {
/* 24 */                    return 0;
                        }
/* 26 */                return (int) j;
                    } catch (NumberFormatException unused) {
/* 89 */                return i;
                    }
                }
            }
