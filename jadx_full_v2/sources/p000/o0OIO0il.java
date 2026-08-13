            package p000;

            import android.util.Log;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.prompt.CachedContext;
            import com.google.mlkit.genai.prompt.CreateCachedContextRequest;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class o0OIO0il extends Oll0io implements IlliIl1l11O {
                public lio0IOO101oI I00iOIl;
                public IiIOIO1I I00iiI;
                public int I00iiO;
                public Object I00iio;
                public final i1O0O0O I00ilI0I1;
                public final o0OO0i I00ilO0;
                public final CreateCachedContextRequest I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o0OIO0il(i1O0O0O i1o0o0o, o0OO0i o0oo0i, CreateCachedContextRequest createCachedContextRequest, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00ilI0I1 = i1o0o0o;
/* 3 */             this.I00ilO0 = o0oo0i;
/* 5 */             this.I00io1l = createCachedContextRequest;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             o0OIO0il o0oio0il = new o0OIO0il(this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo);
/* 12 */            o0oio0il.I00iio = obj;
/* 37 */            return o0oio0il;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((o0OIO0il) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[Catch: all -> 0x0028, GenAiException -> 0x002b, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:6:0x0021, B:28:0x00a1, B:30:0x00a9, B:35:0x00c8, B:36:0x00e8, B:44:0x00f3, B:45:0x00f6), top: B:52:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00c8 A[Catch: all -> 0x0028, GenAiException -> 0x002b, TRY_ENTER, TryCatch #1 {all -> 0x0028, blocks: (B:6:0x0021, B:28:0x00a1, B:30:0x00a9, B:35:0x00c8, B:36:0x00e8, B:44:0x00f3, B:45:0x00f6), top: B:52:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    String str;
                    lio0IOO101oI lio0ioo101oi;
                    IiIOIO1I iiIOIO1II00000oOI;
                    Object objI00IoiI;
                    lio0IOO101oI lio0ioo101oi2;
                    Object objI00o0iI0io1;
                    String str2;
/* 3 */             o0OO0i o0oo0i = this.I00ilO0;
/* 5 */             ConcurrentHashMap concurrentHashMap = o0oo0i.I00io1l;
/* 7 */             ConcurrentHashMap concurrentHashMap2 = o0oo0i.I00ioIO;
/* 9 */             Object obj2 = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiO;
/* 18 */            CreateCachedContextRequest createCachedContextRequest = this.I00io1l;
/* 20 */            IOoil1iiIilo iOoil1iiIilo = null;
                    try {
/* 23 */                if (i != 0) {
/* 25 */                    if (i != 1) {
/* 27 */                        lio0ioo101oi2 = this.I00iOIl;
/* 32 */                        str2 = (String) this.I00iio;
                                try {
/* 34 */                            lIoii1l01l0i.I00000oOI(obj);
/* 37 */                            objI00o0iI0io1 = obj;
/* 168 */                           if (((Boolean) objI00o0iI0io1).booleanValue()) {
/* 215 */                               StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 34);
/* 218 */                               sb.append("Cache creation failed for prefix: ");
/* 221 */                               sb.append(str2);
/* 233 */                               throw new GenAiException(sb.toString(), (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                                    }
/* 174 */                           CachedContext cachedContextZza = CachedContext.Companion.zza(createCachedContextRequest.getZza());
/* 178 */                           concurrentHashMap2.remove(createCachedContextRequest);
/* 187 */                           if (((lio0IOO101oI) concurrentHashMap.remove(createCachedContextRequest)) == null) {
/* 197 */                               Log.w("CacheCreationProcessor", "Future not found in map for request with prefix: ".concat(String.valueOf(str2)));
                                    }
/* 200 */                           return cachedContextZza;
                                } catch (GenAiException e) {
/* 44 */                            e = e;
                                }
                            } else {
/* 47 */                        IiIOIO1I iiIOIO1I = this.I00iiI;
/* 49 */                        lio0IOO101oI lio0ioo101oi3 = this.I00iOIl;
/* 53 */                        String str3 = (String) this.I00iio;
                                try {
/* 55 */                            lIoii1l01l0i.I00000oOI(obj);
/* 58 */                            lio0ioo101oi = lio0ioo101oi3;
/* 59 */                            str = str3;
/* 60 */                            iiIOIO1II00000oOI = iiIOIO1I;
/* 61 */                            objI00IoiI = obj;
                                } catch (GenAiException e2) {
/* 68 */                            e = e2;
/* 69 */                            lio0ioo101oi2 = lio0ioo101oi3;
                                } catch (Throwable th) {
/* 64 */                            th = th;
/* 65 */                            obj2 = str3;
/* 248 */                           concurrentHashMap2.remove(createCachedContextRequest);
/* 257 */                           if (((lio0IOO101oI) concurrentHashMap.remove(createCachedContextRequest)) == null) {
/* 267 */                               Log.w("CacheCreationProcessor", "Future not found in map for request with prefix: ".concat(String.valueOf(obj2)));
                                    }
/* 270 */                           throw th;
                                }
                            }
/* 244 */                   lio0ioo101oi2.I000OOo1O(e);
/* 247 */                   throw e;
                        }
/* 73 */                lIoii1l01l0i.I00000oOI(obj);
/* 78 */                Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 80 */                i1O0O0O i1o0o0o = this.I00ilI0I1;
/* 82 */                str = i1o0o0o.I00000oIO;
/* 84 */                concurrentHashMap2.put(createCachedContextRequest, i1o0o0o);
/* 89 */                lio0ioo101oi = new lio0IOO101oI();
/* 96 */                if (concurrentHashMap.putIfAbsent(createCachedContextRequest, lio0ioo101oi) != null) {
/* 437 */                   throw new GenAiException("Cache creation already in progress for prefix: ".concat(String.valueOf(str)), (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                        }
/* 106 */               iiIOIO1II00000oOI = iOi1II01i0.I00000oOI(ii0110, null, new O1iOlO(lio0ioo101oi, iOoil1iiIilo, 19), 3);
/* 114 */               OiI0lII1i oiI0lII1i = new OiI0lII1i(10);
/* 117 */               oiI0lII1i.I00iiI = lio0ioo101oi;
/* 119 */               VarHandle.storeStoreFence();
/* 122 */               iiIOIO1II00000oOI.I00iiI(oiI0lII1i);
                        try {
/* 125 */                   this.I00iio = str;
/* 127 */                   this.I00iOIl = lio0ioo101oi;
/* 129 */                   this.I00iiI = iiIOIO1II00000oOI;
/* 131 */                   this.I00iiO = 1;
/* 133 */                   objI00IoiI = o0oo0i.I00IoiI(createCachedContextRequest, null, this);
/* 137 */                   if (objI00IoiI != obj2) {
                            }
/* 243 */                   return obj2;
                        } catch (GenAiException e3) {
/* 236 */                   e = e3;
/* 240 */                   lio0ioo101oi2 = lio0ioo101oi;
                        } catch (Throwable th2) {
/* 234 */                   th = th2;
/* 238 */                   obj2 = str;
/* 248 */                   concurrentHashMap2.remove(createCachedContextRequest);
/* 257 */                   if (((lio0IOO101oI) concurrentHashMap.remove(createCachedContextRequest)) == null) {
                            }
/* 270 */                   throw th;
                        }
/* 141 */               ((Boolean) objI00IoiI).getClass();
/* 144 */               this.I00iio = str;
/* 146 */               this.I00iOIl = lio0ioo101oi;
/* 148 */               this.I00iiI = null;
/* 151 */               this.I00iiO = 2;
/* 153 */               objI00o0iI0io1 = iiIOIO1II00000oOI.I00o0iI0io1(this);
/* 157 */               if (objI00o0iI0io1 != obj2) {
/* 161 */                   str2 = str;
/* 168 */                   if (((Boolean) objI00o0iI0io1).booleanValue()) {
                            }
                        }
/* 243 */               return obj2;
                    } catch (Throwable th3) {
/* 41 */                th = th3;
                    }
                }
            }
