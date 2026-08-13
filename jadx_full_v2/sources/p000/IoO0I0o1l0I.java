            package p000;

            import java.io.EOFException;
            import java.nio.charset.Charset;
            
            public final class IoO0I0o1l0I extends Oll0io implements IlliOIo0o10 {
                public int I00iOIl;
                public Ii1olII1lO1 I00iiI;
                public IIIoloiiI1 I00iiO;
                public OoOO010 I00iio;
                public final Charset I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoO0I0o1l0I(Charset charset, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(5, iOoil1iiIilo);
/* 1 */             this.I00ilI0I1 = charset;
                }

                @Override
                public final Object I0010I0i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
/* 15 */            IoO0I0o1l0I ioO0I0o1l0I = new IoO0I0o1l0I(this.I00ilI0I1, (IOoil1iiIilo) obj5);
/* 18 */            ioO0I0o1l0I.I00iiI = (Ii1olII1lO1) obj2;
/* 20 */            ioO0I0o1l0I.I00iiO = (IIIoloiiI1) obj3;
/* 22 */            ioO0I0o1l0I.I00iio = (OoOO010) obj4;
/* 26 */            return ioO0I0o1l0I.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i;
                    String str;
/* 1 */             Ii1olII1lO1 ii1olII1lO1 = this.I00iiI;
/* 3 */             IIIoloiiI1 iIIoloiiI1 = this.I00iiO;
/* 5 */             OoOO010 ooOO010 = this.I00iio;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i2 = this.I00iOIl;
/* 13 */            if (i2 == 0) {
/* 27 */                lIoii1l01l0i.I00000oOI(obj);
/* 44 */                if (!O0000Ioio00.I0000O(ooOO010.I00000oIO, OOoOl0i.I00000oIO.I00000oOI(String.class))) {
/* 12 */                    return null;
                        }
/* 47 */                this.I00iiI = ii1olII1lO1;
/* 49 */                this.I00iiO = null;
/* 51 */                this.I00iio = null;
/* 53 */                this.I00iOIl = 1;
/* 55 */                obj = iOiOOIlI1o01.I000l1(iIIoloiiI1, this);
/* 59 */                if (obj == ii0111o) {
/* 61 */                    return ii0111o;
                        }
                    } else {
/* 15 */                if (i2 != 1) {
/* 23 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                    return null;
                        }
/* 17 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 62 */            OlI1iil1l0 olI1iil1l0 = (OlI1iil1l0) obj;
/* 64 */            IoIlIolo10o ioIlIolo10oI00iOIl = ii1olII1lO1.I00iOIl();
/* 68 */            O1I1OOiol o1I1OOiol = IoO0O10O11.I00000oIO;
/* 74 */            IOoOloI0iI iOoOloI0iII00000oIO = io0Iiol0ol1.I00000oIO(ioIlIolo10oI00iOIl.I0000oI00());
/* 85 */            Charset charsetI00000oIO = iOoOloI0iII00000oIO != null ? IOoi00l.I00000oIO(iOoOloI0iII00000oIO) : null;
/* 86 */            if (charsetI00000oIO == null) {
/* 88 */                charsetI00000oIO = this.I00ilI0I1;
                    }
/* 122 */           IoO0O10O11.I00000oIO.I000o00OoI0I("Reading response body for " + ioIlIolo10oI00iOIl.I0000O().getUrl() + " as String with charset " + charsetI00000oIO);
/* 131 */           for (long j = 1; olI1iil1l0.I000lI(j); j *= 2) {
                    }
/* 137 */           III1oo00i1li iII1oo00i1liI0000oI00 = olI1iil1l0.I0000oI00();
/* 145 */           long j2 = olI1iil1l0.I0000oI00().I00iiO;
/* 151 */           if (j2 < 0 || j2 > 2147483647L) {
/* 283 */               I000II.I0010I0i(IlIi0I0.I000l1(j2, "byteCount (", ") is not within the range [0..2147483647)"));
/* 12 */                return null;
                    }
/* 164 */           if (iII1oo00i1liI0000oI00.I00iiO < j2) {
/* 253 */               StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j2, "Buffer contains less bytes then required (byteCount: ", ", size: ");
/* 259 */               sbI001iOo1i0O.append(iII1oo00i1liI0000oI00.I00iiO);
/* 264 */               sbI001iOo1i0O.append(')');
/* 274 */               throw new EOFException(sbI001iOo1i0O.toString());
                    }
/* 166 */           if (j2 == 0) {
/* 168 */               return "";
                    }
/* 175 */           if (iII1oo00i1liI0000oI00.I00II0Ol1O0l()) {
/* 243 */               I000II.I000iOII("Buffer is empty");
/* 12 */                return null;
                    }
/* 177 */           Oii1O1l oii1O1l = iII1oo00i1liI0000oI00.I00iOIl;
/* 179 */           byte[] bArr = oii1O1l.I00000oIO;
/* 181 */           int i3 = oii1O1l.I00000oOI;
/* 189 */           if (oii1O1l.I0000Il00O - i3 >= j2) {
/* 193 */               i = (int) j2;
/* 194 */               str = new String(bArr, i3, i, charsetI00000oIO);
                    } else {
/* 198 */               i = 0;
/* 199 */               str = null;
                    }
/* 200 */           if (i != 0) {
/* 202 */               if (i < 0) {
/* 223 */                   I000II.I001IO000("Returned negative read bytes count");
/* 12 */                    return null;
                        }
/* 208 */               if (i > oii1O1l.I00000oIO()) {
/* 217 */                   I000II.I001IO000("Returned too many bytes");
/* 12 */                    return null;
                        }
/* 211 */               iII1oo00i1liI0000oI00.skip(i);
                    }
                    return str == null ? new String(lOO1Ill.I00000oOI(iII1oo00i1liI0000oI00, (int) j2), charsetI00000oIO) : str;
                }
            }
