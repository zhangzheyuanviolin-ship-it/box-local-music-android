            package p000;

            import android.os.ParcelFileDescriptor;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.prompt.CreateCachedContextRequest;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class o0OO0i extends iOil1lO10l {
                public ConcurrentHashMap I00io1l;
                public ConcurrentHashMap I00ioIO;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00OOll1(o0OO0i o0oo0i, IOoilo iOoilo) throws Throwable {
                    o0O0olilOloo o0o0oliloloo;
/* 3 */             if (iOoilo instanceof o0O0olilOloo) {
/* 6 */                 o0o0oliloloo = (o0O0olilOloo) iOoilo;
/* 8 */                 int i = o0o0oliloloo.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0o0oliloloo.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0o0oliloloo = new o0O0olilOloo(o0oo0i, iOoilo);
                        }
                    }
/* 25 */            Object obj = o0o0oliloloo.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0o0oliloloo.I00iiO;
                    try {
/* 32 */                if (i2 == 0) {
/* 47 */                    lIoii1l01l0i.I00000oOI(obj);
/* 50 */                    o0o0oliloloo.I00iiO = 1;
/* 52 */                    Object objI00IOO = iOil1lO10l.I00IOO(o0oo0i, o0o0oliloloo);
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

                @Override
                public final ioii01Ii100 I000II(l00Iil l00iil, ilOiOOII0I0 iloiooii0i0) {
/* 10 */            return new iloll1(l00iil, iloiooii0i0, new l1I0oI(24));
                }

                @Override
                public final Object I000O01llI0(Object obj, iOi1Olo ioi1olo) throws GenAiException {
/* 1 */             CreateCachedContextRequest createCachedContextRequest = (CreateCachedContextRequest) obj;
/* 9 */             i1O0O0O i1o0o0o = (i1O0O0O) this.I00ioIO.get(createCachedContextRequest);
/* 14 */            if (i1o0o0o == null) {
/* 106 */               throw new GenAiException("Prefix parameters not found for request", (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                    }
/* 16 */            String str = i1o0o0o.I00000oIO;
/* 22 */            if (str.length() == 0) {
/* 91 */                throw new GenAiException("Prompt prefix is empty", (Throwable) null, 0);
                    }
/* 30 */            if (str.length() > 32000) {
/* 82 */                throw new GenAiException("Prompt prefix length exceeds the limit. Please check the countTokens API.", (Throwable) null, 12);
                    }
/* 32 */            ParcelFileDescriptor parcelFileDescriptor = i1o0o0o.I00000oOI;
/* 34 */            if (parcelFileDescriptor == null) {
/* 72 */                throw new GenAiException("File descriptor to write is null", (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                    }
/* 40 */            OoIol00Ool ooIol00Ool = new OoIol00Ool(15);
/* 43 */            ooIol00Ool.I00iiI = this;
/* 45 */            ooIol00Ool.I00iiO = createCachedContextRequest;
/* 47 */            VarHandle.storeStoreFence();
/* 52 */            illIIi01 illiii01 = new illIIi01();
/* 55 */            illiii01.I00000oIO = parcelFileDescriptor;
/* 57 */            illiii01.I00000oOI = str;
/* 59 */            illiii01.I0000Il00O = ooIol00Ool;
/* 61 */            VarHandle.storeStoreFence();
/* 64 */            return illiii01;
                }

                @Override
                public final Object I000l1(Object obj) {
/* 3 */             return Boolean.TRUE;
                }

                @Override
                public final Object I00OIl(IOoilo iOoilo) {
/* 1 */             return I00OOll1(this, iOoilo);
                }
            }
