            package p000;

            import android.os.ParcelFileDescriptor;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.common.StreamingCallback;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Optional;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ExecutorService;
            
            public final class i1O01I1oi00l extends iOil1lO10l {
                public final ConcurrentHashMap I00io1l;

                public i1O01I1oi00l(int i, ExecutorService executorService, o0oloIl1oIo o0oloil1oio) {
/* 1 */             super(executorService, i, o0oloil1oio);
/* 13 */            il001oo1.I00000oIO(new Il11ooO1o(this.I00iOIl.I00iOIl));
/* 21 */            this.I00io1l = new ConcurrentHashMap();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00OOll1(i1O01I1oi00l i1o01i1oi00l, IOoilo iOoilo) {
                    i1Ioli1 i1ioli1;
/* 3 */             if (iOoilo instanceof i1Ioli1) {
/* 6 */                 i1ioli1 = (i1Ioli1) iOoilo;
/* 8 */                 int i = i1ioli1.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i1ioli1.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i1ioli1 = new i1Ioli1(i1o01i1oi00l, iOoilo);
                        }
                    }
/* 25 */            Object obj = i1ioli1.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i1ioli1.I00iiO;
                    try {
/* 32 */                if (i2 == 0) {
/* 47 */                    lIoii1l01l0i.I00000oOI(obj);
/* 50 */                    i1ioli1.I00iiO = 1;
/* 52 */                    Object objI00IOO = iOil1lO10l.I00IOO(i1o01i1oi00l, i1ioli1);
                            return objI00IOO == ii0111o ? ii0111o : objI00IOO;
                        }
/* 34 */                if (i2 == 1) {
/* 36 */                    lIoii1l01l0i.I00000oOI(obj);
/* 39 */                    return obj;
                        }
/* 42 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                return null;
                    } catch (GenAiException unused) {
/* 63 */                return new Integer(0);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.util.concurrent.ConcurrentHashMap] */
                /* JADX WARN: Type inference failed for: r5v4, types: [com.google.mlkit.genai.prompt.GenerateContentRequest, java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00Ol00(i1O01I1oi00l i1o01i1oi00l, i1O0ll11O0ll i1o0ll11o0ll, i1O0O0O i1o0o0o, StreamingCallback streamingCallback, IOoilo iOoilo) {
                    i1Iolo1 i1iolo1;
                    i1O0ll11O0ll i1o0ll11o0ll2;
                    i1O01I1oi00l i1o01i1oi00l2;
/* 3 */             if (iOoilo instanceof i1Iolo1) {
/* 6 */                 i1iolo1 = (i1Iolo1) iOoilo;
/* 8 */                 int i = i1iolo1.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i1iolo1.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i1iolo1 = new i1Iolo1(i1o01i1oi00l, iOoilo);
                        }
                    }
/* 25 */            Object objI00IoiI = i1iolo1.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i1iolo1.I00iiO;
                    try {
/* 32 */                if (i2 == 0) {
/* 53 */                    lIoii1l01l0i.I00000oOI(objI00IoiI);
/* 60 */                    i1o01i1oi00l.I00io1l.put(i1o0ll11o0ll.I00000oIO, i1o0o0o);
/* 63 */                    i1iolo1.I00iio = i1o01i1oi00l;
/* 65 */                    i1iolo1.I00ilI0I1 = i1o0ll11o0ll;
/* 67 */                    i1iolo1.I00iiO = 1;
/* 69 */                    objI00IoiI = i1o01i1oi00l.I00IoiI(i1o0ll11o0ll, streamingCallback, i1iolo1);
                            i1o01i1oi00l2 = i1o01i1oi00l;
                            i1o0ll11o0ll2 = i1o0ll11o0ll;
/* 73 */                    if (objI00IoiI == ii0111o) {
/* 75 */                        return ii0111o;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 48 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                        return null;
                            }
/* 36 */                    i1O0ll11O0ll i1o0ll11o0ll3 = i1iolo1.I00ilI0I1;
/* 38 */                    i1O01I1oi00l i1o01i1oi00l3 = i1iolo1.I00iio;
/* 40 */                    lIoii1l01l0i.I00000oOI(objI00IoiI);
                            i1o01i1oi00l2 = i1o01i1oi00l3;
                            i1o0ll11o0ll2 = i1o0ll11o0ll3;
                        }
/* 83 */                return objI00IoiI;
                    } finally {
/* 88 */                i1o01i1oi00l.I00io1l.remove(i1o0ll11o0ll.I00000oIO);
                    }
                }

                @Override
                public final ioii01Ii100 I000II(l00Iil l00iil, ilOiOOII0I0 iloiooii0i0) {
/* 5 */             iolOOiI iolooii = new iolOOiI(26);
/* 10 */            l0iO01l l0io01l = new l0iO01l();
/* 13 */            l0io01l.I00000oIO = l00iil;
/* 15 */            l0io01l.I00000oOI = iolooii;
/* 17 */            l0io01l.I0000Il00O = iloiooii0i0;
/* 19 */            VarHandle.storeStoreFence();
/* 30 */            l10Io11o1Ol l10io11o1ol = new l10Io11o1Ol(l0io01l.I00000oIO, l0io01l.I0000Il00O, l0io01l.I00000oOI);
/* 37 */            l10io11o1ol.I000iOII = Optional.empty();
/* 39 */            VarHandle.storeStoreFence();
/* 106 */           return l10io11o1ol;
                }

                @Override
                public final Object I000O01llI0(Object obj, iOi1Olo ioi1olo) throws GenAiException {
/* 1 */             i1O0ll11O0ll i1o0ll11o0ll = (i1O0ll11O0ll) obj;
/* 11 */            i1O0O0O i1o0o0o = (i1O0O0O) this.I00io1l.get(i1o0ll11o0ll.I00000oIO);
/* 16 */            if (i1o0o0o == null) {
/* 332 */               throw new GenAiException("Prefix parameters not found for request", (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                    }
/* 18 */            String str = i1o0o0o.I00000oIO;
/* 25 */            if (str.length() == 0) {
/* 108 */               throw new GenAiException("Prompt prefix is empty", (Throwable) null, 0);
                    }
/* 33 */            if (str.length() > 32000) {
/* 100 */               throw new GenAiException("Prompt prefix length exceeds the limit. Please check the countTokens API.", (Throwable) null, 12);
                    }
/* 35 */            ParcelFileDescriptor parcelFileDescriptor = i1o0o0o.I0000Il00O;
/* 37 */            if (parcelFileDescriptor == null) {
/* 90 */                throw new GenAiException("File descriptor to read is null", (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                    }
/* 39 */            l0O00I l0o00iI00000oIO = l0O00I.I00000oIO(0, str);
/* 43 */            lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 47 */            lOI1lll1l10.I000o00OoI0I(lOl10OOloi.I00ilI0I1);
/* 54 */            lOI1lll1l10 loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(Collections.singletonList(l0o00iI00000oIO));
/* 58 */            if (loi1lll1l10I000o00OoI0I == null) {
/* 79 */                I000II.I001IO000("Missing required properties: promptPrefix");
/* 15 */                return null;
                    }
/* 62 */            l0OI0O11o l0oi0o11o = new l0OI0O11o();
/* 65 */            l0oi0o11o.I00000oIO = loi1lll1l10I000o00OoI0I;
/* 67 */            l0oi0o11o.I00000oOI = parcelFileDescriptor;
/* 69 */            VarHandle.storeStoreFence();
/* 72 */            return o10Oi10i0io.I0000Il00O(i1o0ll11o0ll, ioi1olo, l0oi0o11o);
                }

                @Override
                public final Object I000l1(Object obj) {
/* 3 */             return o10Oi10i0io.I00000oOI((l0i10Il) obj);
                }

                @Override
                public final Object I00OIl(IOoilo iOoilo) {
/* 1 */             return I00OOll1(this, iOoilo);
                }
            }
