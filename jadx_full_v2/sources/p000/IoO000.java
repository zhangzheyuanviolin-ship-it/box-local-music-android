            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Set;
            
            public abstract class IoO000 {
                public static final Set I00000oIO = I1IoiO1l.I00IlilI0i0i(new Character[]{'/', '?', '#', '@'});

                static {
/* 35 */            List list = O0olIIIOllio.I00000oOI;
/* 62 */            iOOIlolo00O.I00000oIO(IOOi1I.I000O01llI0("HTTP/1.0", "HTTP/1.1"), new I10I0o1ii10(4), new I000OiO(8));
                }

                public static final void I00000oIO(CharSequence charSequence, char c) {
/* 89 */            throw new IOIoIlIlO("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) charSequence), 5);
                }

                public static final int I00000oOI(IO110I io110i, IIOiiIi iIOiiIi) {
/* 3 */             int i = iIOiiIi.I0000Il00O;
/* 6 */             for (int i2 = iIOiiIi.I00000oOI; i2 < i; i2++) {
/* 8 */                 char cCharAt = io110i.charAt(i2);
/* 14 */                if (cCharAt == ':' && i2 != iIOiiIi.I00000oOI) {
/* 22 */                    iIOiiIi.I00000oOI = i2 + 1;
/* 24 */                    return i2;
                        }
/* 31 */                if (O0000Ioio00.I0000oI00(cCharAt, 32) <= 0 || OlOoOIi0o.I00100l0("\"(),/:;<=>?@[\\]{}", cCharAt)) {
/* 45 */                    int i3 = iIOiiIi.I00000oOI;
/* 47 */                    if (cCharAt == ':') {
/* 71 */                        throw new IOIoIlIlO("Empty header names are not allowed as per RFC7230.", 5);
                            }
/* 49 */                    if (i2 == i3) {
/* 58 */                        throw new IOIoIlIlO("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.", 5);
                            }
/* 59 */                    I00000oIO(io110i, cCharAt);
/* 63 */                    throw null;
                        }
                    }
/* 551 */           throw new IOIoIlIlO("No colon in HTTP header in " + io110i.subSequence(iIOiiIi.I00000oOI, iIOiiIi.I0000Il00O).toString() + " in builder: \n" + ((Object) io110i), 5);
                }

                /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
                
                    I00000oIO(r8, r15);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
                
                    throw r19;
                 */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[Catch: all -> 0x0036, DONT_GENERATE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002e, B:23:0x0076, B:25:0x0082, B:27:0x0086, B:31:0x0093, B:34:0x009f, B:37:0x00ab, B:39:0x00b0, B:55:0x00e1, B:19:0x005f, B:42:0x00ba, B:51:0x00d0, B:52:0x00d3, B:53:0x00d4, B:54:0x00d9, B:56:0x00ed, B:57:0x00f4, B:58:0x00f5, B:60:0x00fd), top: B:64:0x002e }] */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002e, B:23:0x0076, B:25:0x0082, B:27:0x0086, B:31:0x0093, B:34:0x009f, B:37:0x00ab, B:39:0x00b0, B:55:0x00e1, B:19:0x005f, B:42:0x00ba, B:51:0x00d0, B:52:0x00d3, B:53:0x00d4, B:54:0x00d9, B:56:0x00ed, B:57:0x00f4, B:58:0x00f5, B:60:0x00fd), top: B:64:0x002e }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:23:0x0076). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(IIIoloiiI1 iIIoloiiI1, IO110I io110i, IIOiiIi iIOiiIi, IOoilo iOoilo) throws Throwable {
                    IoIoo0loOiOI ioIoo0loOiOI;
                    IIIoloiiI1 iIIoloiiI12;
                    IoIoo0loOiOI ioIoo0loOiOI2;
                    IO110I io110i2;
                    IoIoOi ioIoOi;
                    IIOiiIi iIOiiIi2;
                    Object objI000OiO;
                    Throwable th;
/* 5 */             if (iOoilo instanceof IoIoo0loOiOI) {
/* 8 */                 ioIoo0loOiOI = (IoIoo0loOiOI) iOoilo;
/* 10 */                int i = ioIoo0loOiOI.I00ilO0;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    ioIoo0loOiOI.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    ioIoo0loOiOI = new IoIoo0loOiOI(iOoilo);
                        }
                    }
/* 27 */            Object obj = ioIoo0loOiOI.I00ilI0I1;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = ioIoo0loOiOI.I00ilO0;
/* 33 */            Throwable th2 = null;
/* 35 */            if (i2 == 0) {
/* 64 */                lIoii1l01l0i.I00000oOI(obj);
/* 69 */                IoIoOi ioIoOi2 = new IoIoOi();
/* 74 */                ioIoOi2.I00000oIO = io110i;
/* 84 */                ioIoOi2.I0000O = (Io1OIIl0Oi0) IoIoiloi.I00000oOI.I001lllioOl();
/* 86 */                VarHandle.storeStoreFence();
/* 89 */                iIIoloiiI12 = iIIoloiiI1;
/* 91 */                ioIoo0loOiOI2 = ioIoo0loOiOI;
/* 92 */                io110i2 = io110i;
/* 93 */                ioIoOi = ioIoOi2;
/* 94 */                iIOiiIi2 = iIOiiIi;
/* 96 */                ioIoo0loOiOI2.I00iOIl = iIIoloiiI12;
/* 98 */                ioIoo0loOiOI2.I00iiI = io110i2;
/* 100 */               ioIoo0loOiOI2.I00iiO = iIOiiIi2;
/* 102 */               ioIoo0loOiOI2.I00iio = ioIoOi;
/* 104 */               ioIoo0loOiOI2.I00ilO0 = 1;
/* 110 */               objI000OiO = iOiOOIlI1o01.I000OiO(iIIoloiiI12, io110i2, 8192L, O0olI0li.I00iOIl, ioIoo0loOiOI2);
/* 114 */               if (objI000OiO != ii0111o) {
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 60 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 39 */                ioIoOi = ioIoo0loOiOI.I00iio;
/* 41 */                IIOiiIi iIOiiIi3 = ioIoo0loOiOI.I00iiO;
/* 43 */                IO110I io110i3 = ioIoo0loOiOI.I00iiI;
/* 45 */                IIIoloiiI1 iIIoloiiI13 = ioIoo0loOiOI.I00iOIl;
                        try {
/* 47 */                    lIoii1l01l0i.I00000oOI(obj);
/* 51 */                    io110i2 = io110i3;
/* 52 */                    iIIoloiiI12 = iIIoloiiI13;
/* 53 */                    ioIoo0loOiOI2 = ioIoo0loOiOI;
/* 129 */                   if (((Number) obj).longValue() != -1) {
/* 134 */                       return th2;
                            }
/* 135 */                   int i3 = io110i2.I00io1l;
/* 137 */                   iIOiiIi3.I0000Il00O = i3;
/* 139 */                   int i4 = iIOiiIi3.I00000oOI;
/* 141 */                   int i5 = i3 - i4;
/* 142 */                   if (i5 == 0) {
/* 248 */                       IO10oOlIiO iO10oOlIiOI00000oIO = ioIoOi.I00000oIO("Host");
/* 252 */                       if (iO10oOlIiOI00000oIO != null) {
/* 254 */                           I0000O(iO10oOlIiOI00000oIO);
                                }
/* 257 */                       return ioIoOi;
                            }
/* 146 */                   if (i5 >= 8192) {
/* 245 */                       throw new IllegalStateException("Header line length limit exceeded");
                            }
/* 148 */                   int iI00000oOI = I00000oOI(io110i2, iIOiiIi3);
/* 152 */                   int i6 = iIOiiIi3.I0000Il00O;
/* 154 */                   int i7 = iIOiiIi3.I00000oOI;
/* 158 */                   while (i7 < i6) {
/* 160 */                       char cCharAt = io110i2.charAt(i7);
/* 168 */                       if (!iOlI1lIi0.I0000Il00O(cCharAt) && cCharAt != '\t') {
                                    break;
                                }
/* 172 */                       i7++;
                            }
/* 175 */                   if (i7 >= i6) {
/* 177 */                       iIOiiIi3.I00000oOI = i6;
/* 179 */                       th = th2;
/* 181 */                       i7 = i6;
                            } else {
/* 183 */                       int i8 = i7;
/* 184 */                       int i9 = i8;
/* 185 */                       while (i8 < i6) {
/* 187 */                           char cCharAt2 = io110i2.charAt(i8);
/* 191 */                           Throwable th3 = th2;
/* 193 */                           if (cCharAt2 != '\t') {
/* 197 */                               if (cCharAt2 == '\n' || cCharAt2 == '\r') {
                                            break;
                                        }
/* 205 */                               if (cCharAt2 != ' ') {
/* 207 */                                   i9 = i8;
                                        }
                                    }
/* 213 */                           i8++;
/* 215 */                           th2 = th3;
                                }
/* 218 */                       th = th2;
/* 220 */                       iIOiiIi3.I00000oOI = i7;
/* 224 */                       iIOiiIi3.I0000Il00O = i9 + 1;
                            }
/* 226 */                   int i10 = iIOiiIi3.I0000Il00O;
/* 228 */                   iIOiiIi3.I00000oOI = i6;
/* 230 */                   ioIoOi.I0000Il00O(i4, iI00000oOI, i7, i10);
/* 233 */                   th2 = th;
/* 235 */                   iIOiiIi2 = iIOiiIi3;
/* 96 */                    ioIoo0loOiOI2.I00iOIl = iIIoloiiI12;
/* 98 */                    ioIoo0loOiOI2.I00iiI = io110i2;
/* 100 */                   ioIoo0loOiOI2.I00iiO = iIOiiIi2;
/* 102 */                   ioIoo0loOiOI2.I00iio = ioIoOi;
/* 104 */                   ioIoo0loOiOI2.I00ilO0 = 1;
/* 110 */                   objI000OiO = iOiOOIlI1o01.I000OiO(iIIoloiiI12, io110i2, 8192L, O0olI0li.I00iOIl, ioIoo0loOiOI2);
/* 114 */                   if (objI000OiO != ii0111o) {
/* 116 */                       return ii0111o;
                            }
/* 117 */                   iIOiiIi3 = iIOiiIi2;
/* 118 */                   obj = objI000OiO;
/* 129 */                   if (((Number) obj).longValue() != -1) {
                            }
                        } finally {
/* 258 */                   ioIoOi.I0000O();
                        }
                    }
                }

                public static final void I0000O(IO10oOlIiO iO10oOlIiO) {
/* 8 */             if (OlOoOIi0o.I0010o(iO10oOlIiO, ":")) {
/* 186 */               throw new IOIoIlIlO("Host header with ':' should contains port: " + ((Object) iO10oOlIiO), 5);
                    }
/* 15 */            for (int i = 0; i < iO10oOlIiO.length(); i++) {
/* 21 */                Character chValueOf = Character.valueOf(iO10oOlIiO.charAt(i));
/* 25 */                Set set = I00000oIO;
/* 31 */                if (set.contains(chValueOf)) {
/* 55 */                    throw new IOIoIlIlO("Host cannot contain any of the following symbols: " + set, 5);
                        }
                    }
                }
            }
