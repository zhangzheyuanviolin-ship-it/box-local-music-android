            package p000;

            import com.google.mlkit.genai.common.DownloadStatus;
            import com.google.mlkit.genai.common.GenAiException;
            
            public final class o10110I extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final IliI1Ii1II I00iiI;
                public final o100I0Oo0il I00iiO;
                public final OOIoOo0O I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o10110I(IliI1Ii1II iliI1Ii1II, o100I0Oo0il o100i0oo0il, OOIoOo0O oOIoOo0O, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = iliI1Ii1II;
/* 3 */             this.I00iiO = o100i0oo0il;
/* 5 */             this.I00iio = oOIoOo0O;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new o10110I(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((o10110I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OOIoOo0O oOIoOo0O = this.I00iio;
                    try {
/* 7 */                 if (i != 0) {
/* 9 */                     lIoii1l01l0i.I00000oOI(obj);
                        } else {
/* 17 */                    lIoii1l01l0i.I00000oOI(obj);
/* 20 */                    IliI1Ii1II iliI1Ii1II = this.I00iiI;
/* 22 */                    o100I0Oo0il o100i0oo0il = this.I00iiO;
/* 25 */                    this.I00iOIl = 1;
/* 31 */                    if (iliI1Ii1II.invoke(o100i0oo0il, this) == ii0111o) {
/* 33 */                        return ii0111o;
                            }
                        }
                    } catch (GenAiException e) {
/* 67 */                OOIoO0IIOO0 oOIoO0IIOO0 = (OOIoO0IIOO0) oOIoOo0O;
/* 69 */                oOIoO0IIOO0.I000lI(new DownloadStatus.DownloadFailed(e));
/* 72 */                oOIoO0IIOO0.I0001Ioi1lo(e);
                    } catch (Throwable th) {
/* 36 */                String message = th.getMessage();
/* 40 */                if (message == null) {
/* 42 */                    message = "Unknown error";
                        }
/* 45 */                GenAiException genAiException = new GenAiException(message, th, 0);
/* 53 */                OOIoO0IIOO0 oOIoO0IIOO02 = (OOIoO0IIOO0) oOIoOo0O;
/* 55 */                oOIoO0IIOO02.I000lI(new DownloadStatus.DownloadFailed(genAiException));
/* 58 */                oOIoO0IIOO02.I0001Ioi1lo(genAiException);
                    }
/* 75 */            return OoiIlOl1iI.I00000oIO;
                }
            }
