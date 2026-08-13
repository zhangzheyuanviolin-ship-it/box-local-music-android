            package p000;

            import java.nio.charset.Charset;
            import java.nio.charset.CharsetDecoder;
            
            public abstract class io0OoioI0O1 {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(Ii1olII1lO1 ii1olII1lO1, IOoilo iOoilo) throws Throwable {
                    IoOI0i ioOI0i;
                    O0O01O0o o0O01O0oI00000oIO;
/* 3 */             if (iOoilo instanceof IoOI0i) {
/* 6 */                 ioOI0i = (IoOI0i) iOoilo;
/* 8 */                 int i = ioOI0i.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioOI0i.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioOI0i = new IoOI0i(iOoilo);
                        }
                    }
/* 25 */            Object objI00000oOI = ioOI0i.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioOI0i.I00iiI;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 50 */                IoIlIolo10o ioIlIolo10oI00iOIl = ii1olII1lO1.I00iOIl();
/* 58 */                O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(IIIoloiiI1.class);
                        try {
/* 62 */                    o0O01O0oI00000oIO = OOoOl0i.I00000oIO(IIIoloiiI1.class);
                        } catch (Throwable unused) {
/* 67 */                    o0O01O0oI00000oIO = null;
                        }
/* 70 */                OoOO010 ooOO010 = new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO);
/* 73 */                ioOI0i.I00iiI = 1;
/* 75 */                objI00000oOI = ioIlIolo10oI00iOIl.I00000oOI(ooOO010, ioOI0i);
/* 79 */                if (objI00000oOI == ii0111o) {
/* 81 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
                    }
/* 82 */            if (objI00000oOI != null) {
/* 84 */                return (IIIoloiiI1) objI00000oOI;
                    }
/* 89 */            IOOlIIilOl0.I000II("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
/* 32 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(Ii1olII1lO1 ii1olII1lO1, Charset charset, IOoilo iOoilo) throws Throwable {
                    IoOI0i0O ioOI0i0O;
                    O0O01O0o o0O01O0oI00000oIO;
                    CharsetDecoder charsetDecoder;
/* 3 */             if (iOoilo instanceof IoOI0i0O) {
/* 6 */                 ioOI0i0O = (IoOI0i0O) iOoilo;
/* 8 */                 int i = ioOI0i0O.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioOI0i0O.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioOI0i0O = new IoOI0i0O(iOoilo);
                        }
                    }
/* 25 */            Object objI00000oOI = ioOI0i0O.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioOI0i0O.I00iiO;
/* 33 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 52 */                IOoOloI0iI iOoOloI0iII00000oIO = io0Iiol0ol1.I00000oIO(ii1olII1lO1);
/* 63 */                Charset charsetI00000oIO = iOoOloI0iII00000oIO != null ? IOoi00l.I00000oIO(iOoOloI0iII00000oIO) : null;
/* 64 */                if (charsetI00000oIO != null) {
/* 67 */                    charset = charsetI00000oIO;
                        }
/* 68 */                CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
/* 72 */                IoIlIolo10o ioIlIolo10oI00iOIl = ii1olII1lO1.I00iOIl();
/* 80 */                O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(OlI1iil1l0.class);
                        try {
/* 84 */                    o0O01O0oI00000oIO = OOoOl0i.I00000oIO(OlI1iil1l0.class);
                        } catch (Throwable unused) {
/* 89 */                    o0O01O0oI00000oIO = null;
                        }
/* 92 */                OoOO010 ooOO010 = new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO);
/* 95 */                ioOI0i0O.I00iOIl = charsetDecoderNewDecoder;
/* 97 */                ioOI0i0O.I00iiO = 1;
/* 99 */                objI00000oOI = ioIlIolo10oI00iOIl.I00000oOI(ooOO010, ioOI0i0O);
/* 103 */               if (objI00000oOI == ii0111o) {
/* 105 */                   return ii0111o;
                        }
/* 106 */               charsetDecoder = charsetDecoderNewDecoder;
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                charsetDecoder = ioOI0i0O.I00iOIl;
/* 39 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
                    }
/* 107 */           if (objI00000oOI == null) {
/* 198 */               IOOlIIilOl0.I000II("null cannot be cast to non-null type kotlinx.io.Source");
/* 32 */                return null;
                    }
/* 109 */           OlI1iil1l0 olI1iil1l0 = (OlI1iil1l0) objI00000oOI;
/* 127 */           StringBuilder sb = new StringBuilder((int) Math.min(2147483647L, olI1iil1l0.I0000oI00().I00iiO));
/* 140 */           if (charsetDecoder.charset().equals(IO1IOI.I00000oIO)) {
/* 147 */               olI1iil1l0.I000lI(Long.MAX_VALUE);
/* 164 */               sb.append((CharSequence) li0oio00o1o.I00000oIO(olI1iil1l0.I0000oI00(), olI1iil1l0.I0000oI00().I00iiO));
                    } else {
/* 172 */               long j = olI1iil1l0.I0000oI00().I00iiO;
/* 188 */               sb.append((CharSequence) new String(lOO1Ill.I0000Il00O(olI1iil1l0, -1), charsetDecoder.charset()));
                    }
/* 191 */           return sb.toString();
                }

                public static final IoO10Iooo0 I0000Il00O(Ii1olII1lO1 ii1olII1lO1) {
/* 5 */             return ii1olII1lO1.I00iOIl().I0000O();
                }
            }
