            package p000;

            import android.content.Context;
            import android.os.ParcelFileDescriptor;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.common.StreamingCallback;
            import com.google.mlkit.genai.common.internal.GenAiUtils;
            import com.google.mlkit.genai.prompt.Caches;
            import com.google.mlkit.genai.prompt.Candidate;
            import com.google.mlkit.genai.prompt.Content;
            import com.google.mlkit.genai.prompt.CountTokensResponse;
            import com.google.mlkit.genai.prompt.CreateCachedContextRequest;
            import com.google.mlkit.genai.prompt.CreateCachedContextRequestKt;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.prompt.GenerateContentResponse;
            import com.google.mlkit.genai.prompt.GenerateTypedContentRequest;
            import com.google.mlkit.genai.prompt.GenerateTypedContentResponse;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import com.google.mlkit.genai.prompt.Part;
            import com.google.mlkit.genai.prompt.PromptPrefix;
            import com.google.mlkit.genai.prompt.TextPart;
            import com.google.mlkit.genai.prompt.TypedCandidate;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ExecutorService;
            import java.util.regex.Pattern;
            
/* 312 */   public final class o1I0I0O implements GenerativeModel {
                public static final OllO00oiil I000l1 = new OllO00oiil(I1lOO0Ii00.I00o0l1o1o0);
                public i1IoO0OlII I00000oIO;
                public o0OO0i I00000oOI;
                public i1O01I1oi00l I0000Il00O;
                public i1IoO0OlII I0000O;
                public i1O01I1oi00l I0000oI00;
                public ExecutorService I0001Ioi1lo;
                public IIOlO1ii I000II;
                public o0oi0ioiO I000O01llI0;
                public o0lo1I I000OOo1O;
                public i1Ilio0i0 I000OiO;
                public OllO00oiil I000iOII;

                public static final int I0000Il00O(String str) {
                    String str2;
                    Integer numI000lI;
/* 12 */            O1OlOOioiI o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(Pattern.compile("nano-v(\\d+)").matcher(str), 0, str);
/* 16 */            if (o1OlOOioiII00000oIO == null || (str2 = (String) ((O1OlO1II) o1OlOOioiII00000oIO.I00000oIO()).get(1)) == null || (numI000lI = OlOolloIIOl0.I000lI(10, str2)) == null) {
/* 11 */                return 0;
                    }
/* 41 */            return numI000lI.intValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) throws Throwable {
                    o110l0oI0 o110l0oi0;
/* 3 */             if (iOoilo instanceof o110l0oI0) {
/* 6 */                 o110l0oi0 = (o110l0oI0) iOoilo;
/* 8 */                 int i = o110l0oi0.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o110l0oi0.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o110l0oi0 = new o110l0oI0(this, iOoilo);
                        }
                    }
/* 25 */            Object num = o110l0oi0.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o110l0oi0.I00iiO;
/* 33 */            if (i2 == 0) {
/* 48 */                lIoii1l01l0i.I00000oOI(num);
/* 51 */                o110l0oi0.I00iiO = 1;
/* 53 */                i1O01I1oi00l i1o01i1oi00l = this.I0000Il00O;
/* 78 */                num = O0000Ioio00.I0000O(this.I000O01llI0.I0000Il00O.get(i1o01i1oi00l), Boolean.TRUE) ? new Integer(0) : i1O01I1oi00l.I00OOll1(i1o01i1oi00l, o110l0oi0);
/* 83 */                if (num == ii0111o) {
/* 168 */                   return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 46 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(num);
                    }
/* 95 */            return Boolean.valueOf(((Number) num).intValue() == 3);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o111001 o111001Var;
/* 3 */             if (iOoil1iiIilo instanceof o111001) {
/* 6 */                 o111001Var = (o111001) iOoil1iiIilo;
/* 8 */                 int i = o111001Var.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o111001Var.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o111001Var = new o111001(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object num = o111001Var.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o111001Var.I00iiO;
/* 33 */            if (i2 == 0) {
/* 48 */                lIoii1l01l0i.I00000oOI(num);
/* 51 */                o111001Var.I00iiO = 1;
/* 53 */                o0oi0ioiO o0oi0ioio = this.I000O01llI0;
/* 55 */                i1IoO0OlII i1ioo0olii = this.I0000O;
/* 78 */                num = O0000Ioio00.I0000O(o0oi0ioio.I0000Il00O.get(i1ioo0olii), Boolean.TRUE) ? new Integer(0) : iOil1lO10l.I00IOO(i1ioo0olii, o111001Var);
/* 83 */                if (num == ii0111o) {
/* 168 */                   return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 46 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(num);
                    }
/* 95 */            return Boolean.valueOf(((Number) num).intValue() == 3);
                }

                /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
                
                    if (p000.iOil1lO10l.I00IioO0OiOi(r0, r3) != r11) goto L46;
                 */
                /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[Catch: GenAiException -> 0x00a9, TryCatch #0 {GenAiException -> 0x00a9, blocks: (B:14:0x0033, B:18:0x003f, B:38:0x0097, B:40:0x009f, B:19:0x0043, B:33:0x007b, B:35:0x008b, B:36:0x0091, B:20:0x0047, B:28:0x006a, B:30:0x0072, B:23:0x004e, B:25:0x005e, B:26:0x0064), top: B:48:0x0029 }] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[Catch: GenAiException -> 0x00a9, TryCatch #0 {GenAiException -> 0x00a9, blocks: (B:14:0x0033, B:18:0x003f, B:38:0x0097, B:40:0x009f, B:19:0x0043, B:33:0x007b, B:35:0x008b, B:36:0x0091, B:20:0x0047, B:28:0x006a, B:30:0x0072, B:23:0x004e, B:25:0x005e, B:26:0x0064), top: B:48:0x0029 }] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: GenAiException -> 0x00a9, PHI: r10
                  0x0097: PHI (r10v20 java.lang.Object) = (r10v18 java.lang.Object), (r10v1 java.lang.Object) binds: [B:37:0x0095, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {GenAiException -> 0x00a9, blocks: (B:14:0x0033, B:18:0x003f, B:38:0x0097, B:40:0x009f, B:19:0x0043, B:33:0x007b, B:35:0x008b, B:36:0x0091, B:20:0x0047, B:28:0x006a, B:30:0x0072, B:23:0x004e, B:25:0x005e, B:26:0x0064), top: B:48:0x0029 }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: GenAiException -> 0x00a9, TRY_LEAVE, TryCatch #0 {GenAiException -> 0x00a9, blocks: (B:14:0x0033, B:18:0x003f, B:38:0x0097, B:40:0x009f, B:19:0x0043, B:33:0x007b, B:35:0x008b, B:36:0x0091, B:20:0x0047, B:28:0x006a, B:30:0x0072, B:23:0x004e, B:25:0x005e, B:26:0x0064), top: B:48:0x0029 }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(IOoilo iOoilo) throws Throwable {
                    o11olIl1 o11olil1;
/* 1 */             i1O01I1oi00l i1o01i1oi00l = this.I0000Il00O;
/* 3 */             o0oi0ioiO o0oi0ioio = this.I000O01llI0;
/* 5 */             o0OO0i o0oo0i = this.I00000oOI;
/* 9 */             if (iOoilo instanceof o11olIl1) {
/* 12 */                o11olil1 = (o11olIl1) iOoilo;
/* 14 */                int i = o11olil1.I00iiO;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    o11olil1.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    o11olil1 = new o11olIl1(this, iOoilo);
                        }
                    }
/* 31 */            Object num = o11olil1.I00iOIl;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = o11olil1.I00iiO;
                    try {
                    } catch (GenAiException e) {
/* 175 */               Log.w("GenerativeModel", "Failed to prepare inference engine for prefix caching", e);
                    }
/* 42 */            if (i2 == 0) {
/* 76 */                lIoii1l01l0i.I00000oOI(num);
/* 79 */                o11olil1.I00iiO = 1;
/* 101 */               num = O0000Ioio00.I0000O(o0oi0ioio.I0000Il00O.get(o0oo0i), Boolean.TRUE) ? new Integer(0) : o0OO0i.I00OOll1(o0oo0i, o11olil1);
/* 105 */               if (num != ii0111o) {
                        }
/* 169 */               return ii0111o;
                    }
/* 44 */            if (i2 != 1) {
/* 46 */                if (i2 == 2) {
/* 68 */                    lIoii1l01l0i.I00000oOI(num);
/* 124 */                   o11olil1.I00iiO = 3;
/* 146 */                   num = !O0000Ioio00.I0000O(o0oi0ioio.I0000Il00O.get(i1o01i1oi00l), Boolean.TRUE) ? new Integer(0) : i1O01I1oi00l.I00OOll1(i1o01i1oi00l, o11olil1);
/* 150 */                   if (num != ii0111o) {
/* 158 */                       if (((Number) num).intValue() != 0) {
                                }
/* 178 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 169 */                   return ii0111o;
                        }
/* 48 */                if (i2 == 3) {
/* 64 */                    lIoii1l01l0i.I00000oOI(num);
/* 158 */                   if (((Number) num).intValue() != 0) {
/* 160 */                       o11olil1.I00iiO = 4;
                            }
/* 178 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 50 */                if (i2 == 4) {
/* 52 */                    lIoii1l01l0i.I00000oOI(num);
/* 178 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 59 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 62 */                return null;
                    }
/* 72 */            lIoii1l01l0i.I00000oOI(num);
/* 113 */           if (((Number) num).intValue() != 0) {
/* 115 */               o11olil1.I00iiO = 2;
/* 121 */               if (iOil1lO10l.I00IioO0OiOi(o0oo0i, o11olil1) == ii0111o) {
                        }
/* 169 */               return ii0111o;
                    }
/* 124 */           o11olil1.I00iiO = 3;
/* 146 */           if (!O0000Ioio00.I0000O(o0oi0ioio.I0000Il00O.get(i1o01i1oi00l), Boolean.TRUE)) {
                    }
/* 150 */           if (num != ii0111o) {
                    }
/* 169 */           return ii0111o;
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
                
                    if (r15 == r2) goto L43;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
                
                    if (r15 == r2) goto L43;
                 */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(GenerateContentRequest generateContentRequest, O0IOli0o0 o0IOli0o0, boolean z, IOoil1iiIilo iOoil1iiIilo) {
                    o11I00o10I0i o11i00o10i0i;
                    String zzh;
                    Object objI001l0I00;
                    boolean z2;
                    GenerateContentRequest generateContentRequest2;
                    String str;
                    o0loO110 o0loo110;
/* 1 */             i1IoO0OlII i1ioo0olii = this.I00000oIO;
/* 5 */             if (iOoil1iiIilo instanceof o11I00o10I0i) {
/* 8 */                 o11i00o10i0i = (o11I00o10I0i) iOoil1iiIilo;
/* 10 */                int i = o11i00o10i0i.I00ilO0;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    o11i00o10i0i.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    o11i00o10i0i = new o11I00o10I0i(this, iOoil1iiIilo);
                        }
                    }
/* 27 */            Object objI00Io1lO = o11i00o10i0i.I00iio;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = o11i00o10i0i.I00ilO0;
/* 33 */            o10Oi10i0io o10oi10i0io = o10Oi10i0io.I00000oIO;
/* 40 */            if (i2 == 0) {
/* 108 */               lIoii1l01l0i.I00000oOI(objI00Io1lO);
/* 111 */               zzh = generateContentRequest.getZzh();
/* 115 */               if (zzh == null) {
/* 117 */                   zzh = "";
                        }
/* 123 */               if (zzh.length() > 0) {
/* 125 */                   o11i00o10i0i.I00iOIl = generateContentRequest;
/* 127 */                   o11i00o10i0i.I00iiI = o0IOli0o0;
/* 129 */                   o11i00o10i0i.I00io1l = zzh;
/* 131 */                   o11i00o10i0i.I00iiO = z;
/* 133 */                   o11i00o10i0i.I00ilO0 = 1;
/* 135 */                   objI001l0I00 = iOil1lO10l.I001l0I00(i1ioo0olii, o11i00o10i0i);
/* 139 */                   if (objI001l0I00 != ii0111o) {
                            }
                        } else {
/* 249 */                   i1O0ll11O0ll i1o0ll11o0ll = new i1O0ll11O0ll(generateContentRequest, o0IOli0o0, z);
/* 252 */                   o11i00o10i0i.I00iOIl = o10oi10i0io;
/* 254 */                   o11i00o10i0i.I00iiI = null;
/* 256 */                   o11i00o10i0i.I00io1l = null;
/* 258 */                   o11i00o10i0i.I00ilO0 = 4;
/* 260 */                   objI00Io1lO = iOil1lO10l.I00Io1lO(i1ioo0olii, i1o0ll11o0ll, o11i00o10i0i);
                        }
/* 1182 */              return ii0111o;
                    }
/* 42 */            if (i2 == 1) {
/* 90 */                z = o11i00o10i0i.I00iiO;
/* 92 */                String str2 = o11i00o10i0i.I00io1l;
/* 94 */                o0IOli0o0 = o11i00o10i0i.I00iiI;
/* 98 */                GenerateContentRequest generateContentRequest3 = (GenerateContentRequest) o11i00o10i0i.I00iOIl;
/* 100 */               lIoii1l01l0i.I00000oOI(objI00Io1lO);
/* 104 */               zzh = str2;
/* 105 */               generateContentRequest = generateContentRequest3;
/* 106 */               objI001l0I00 = objI00Io1lO;
                    } else {
/* 44 */                if (i2 != 2) {
/* 46 */                    if (i2 == 3) {
/* 69 */                        o10oi10i0io = (o10Oi10i0io) o11i00o10i0i.I00iOIl;
/* 71 */                        lIoii1l01l0i.I00000oOI(objI00Io1lO);
/* 219 */                       o10oi10i0io.getClass();
/* 226 */                       return new CountTokensResponse(((ilOl1l) objI00Io1lO).I00000oIO);
                            }
/* 48 */                    if (i2 != 4) {
/* 62 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                        return null;
                            }
/* 53 */                    o10oi10i0io = (o10Oi10i0io) o11i00o10i0i.I00iOIl;
/* 55 */                    lIoii1l01l0i.I00000oOI(objI00Io1lO);
/* 268 */                   o10oi10i0io.getClass();
/* 275 */                   return new CountTokensResponse(((ilOl1l) objI00Io1lO).I00000oIO);
                        }
/* 76 */                z2 = o11i00o10i0i.I00iiO;
/* 78 */                str = o11i00o10i0i.I00io1l;
/* 80 */                o0IOli0o0 = o11i00o10i0i.I00iiI;
/* 84 */                generateContentRequest2 = (GenerateContentRequest) o11i00o10i0i.I00iOIl;
/* 86 */                lIoii1l01l0i.I00000oOI(objI00Io1lO);
/* 172 */               o0loo110 = (o0loO110) objI00Io1lO;
/* 174 */               if (o0loo110 == null) {
/* 176 */                   GenerateContentRequest.Builder builderZza = generateContentRequest2.zza(null, null);
/* 187 */                   builderZza.setPromptPrefix(new PromptPrefix(o0loo110.I0000Il00O));
/* 190 */                   builderZza.setCachedContextName(null);
/* 199 */                   i1O0ll11O0ll i1o0ll11o0ll2 = new i1O0ll11O0ll(builderZza.build(), o0IOli0o0, z2);
/* 202 */                   o11i00o10i0i.I00iOIl = o10oi10i0io;
/* 204 */                   o11i00o10i0i.I00iiI = null;
/* 206 */                   o11i00o10i0i.I00io1l = null;
/* 208 */                   o11i00o10i0i.I00ilO0 = 3;
/* 210 */                   objI00Io1lO = iOil1lO10l.I00Io1lO(i1ioo0olii, i1o0ll11o0ll2, o11i00o10i0i);
                        } else {
/* 242 */                   Log.w("GenerativeModel", "Cached context not found for name: ".concat(String.valueOf(str)));
/* 245 */                   generateContentRequest = generateContentRequest2;
/* 246 */                   z = z2;
/* 249 */                   i1O0ll11O0ll i1o0ll11o0ll3 = new i1O0ll11O0ll(generateContentRequest, o0IOli0o0, z);
/* 252 */                   o11i00o10i0i.I00iOIl = o10oi10i0io;
/* 254 */                   o11i00o10i0i.I00iiI = null;
/* 256 */                   o11i00o10i0i.I00io1l = null;
/* 258 */                   o11i00o10i0i.I00ilO0 = 4;
/* 260 */                   objI00Io1lO = iOil1lO10l.I00Io1lO(i1ioo0olii, i1o0ll11o0ll3, o11i00o10i0i);
                        }
                    }
/* 145 */           o0lo1I o0lo1i = this.I000OOo1O;
/* 147 */           Context contextI0010I0i = l1I0oI.I0010I0i();
/* 151 */           o11i00o10i0i.I00iOIl = generateContentRequest;
/* 153 */           o11i00o10i0i.I00iiI = o0IOli0o0;
/* 155 */           o11i00o10i0i.I00io1l = zzh;
/* 157 */           o11i00o10i0i.I00iiO = z;
/* 159 */           o11i00o10i0i.I00ilO0 = 2;
/* 161 */           Object objI00000oIO = o0lo1I.I00000oIO(o0lo1i, contextI0010I0i, zzh, (String) objI001l0I00, o11i00o10i0i);
/* 165 */           if (objI00000oIO != ii0111o) {
/* 167 */               String str3 = zzh;
/* 168 */               objI00Io1lO = objI00000oIO;
/* 169 */               z2 = z;
/* 170 */               generateContentRequest2 = generateContentRequest;
/* 171 */               str = str3;
/* 172 */               o0loo110 = (o0loO110) objI00Io1lO;
/* 174 */               if (o0loo110 == null) {
                        }
                    }
/* 1182 */          return ii0111o;
                }

                /* JADX WARN: Removed duplicated region for block: B:51:0x00e0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0135  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0151 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0152 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(GenerateContentRequest generateContentRequest, StreamingCallback streamingCallback, O0IOli0o0 o0IOli0o0, boolean z, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o11OOollIoI1 o11ooollioi1;
                    String textString;
                    String str;
                    O0IOli0o0 o0IOli0o02;
                    int i;
                    String str2;
                    StreamingCallback streamingCallback2;
                    String str3;
                    GenerateContentRequest generateContentRequest2;
                    boolean z2;
                    O0IOli0o0 o0IOli0o03;
                    GenerateContentRequest generateContentRequest3;
                    StreamingCallback streamingCallback3;
                    boolean z3;
                    Object objI00IoiI;
                    GenerateContentResponse generateContentResponse;
/* 3 */             if (iOoil1iiIilo instanceof o11OOollIoI1) {
/* 6 */                 o11ooollioi1 = (o11OOollIoI1) iOoil1iiIilo;
/* 8 */                 int i2 = o11ooollioi1.I00ilO0;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    o11ooollioi1.I00ilO0 = i2 - Integer.MIN_VALUE;
                        } else {
/* 23 */                    o11ooollioi1 = new o11OOollIoI1(this, iOoil1iiIilo);
                        }
                    }
/* 19 */            o11OOollIoI1 o11ooollioi12 = o11ooollioi1;
/* 27 */            Object objI00000oIO = o11ooollioi12.I00iio;
/* 29 */            Object obj = Ii0111o.I00iOIl;
/* 31 */            int i3 = o11ooollioi12.I00ilO0;
/* 39 */            if (i3 == 0) {
/* 121 */               lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 124 */               PromptPrefix zzg = generateContentRequest.getZzg();
/* 130 */               if (zzg == null || (textString = zzg.getTextString()) == null) {
/* 128 */                   textString = "";
                        }
/* 139 */               String zzh = generateContentRequest.getZzh();
/* 128 */               str = zzh != null ? zzh : "";
/* 151 */               if (textString.length() > 0) {
/* 153 */                   o11ooollioi12.I00io1l = generateContentRequest;
/* 155 */                   o11ooollioi12.I00iOIl = streamingCallback;
/* 157 */                   o11ooollioi12.I00iiI = o0IOli0o0;
/* 159 */                   o11ooollioi12.I00ioIO = textString;
/* 161 */                   o11ooollioi12.I00l0I0l0lO1 = str;
/* 163 */                   o11ooollioi12.I00iiO = z;
/* 165 */                   o11ooollioi12.I00ilO0 = 1;
/* 167 */                   Object objI00000oIO2 = I00000oIO(o11ooollioi12);
/* 171 */                   if (objI00000oIO2 != obj) {
/* 176 */                       o0IOli0o02 = o0IOli0o0;
/* 177 */                       i = 2;
/* 178 */                       str2 = textString;
/* 179 */                       objI00000oIO = objI00000oIO2;
                            }
                        }
/* 231 */               o0IOli0o02 = o0IOli0o0;
/* 228 */               streamingCallback2 = streamingCallback;
/* 229 */               str3 = str;
/* 237 */               if (str3.length() <= 0) {
/* 239 */                   o11ooollioi12.I00io1l = generateContentRequest;
/* 241 */                   o11ooollioi12.I00iOIl = streamingCallback2;
/* 243 */                   o11ooollioi12.I00iiI = o0IOli0o02;
/* 245 */                   o11ooollioi12.I00ioIO = str3;
/* 247 */                   o11ooollioi12.I00l0I0l0lO1 = null;
/* 249 */                   o11ooollioi12.I00iiO = z;
/* 251 */                   o11ooollioi12.I00ilO0 = 3;
/* 253 */                   objI00000oIO = I00000oIO(o11ooollioi12);
/* 257 */                   if (objI00000oIO != obj) {
/* 260 */                       generateContentRequest3 = generateContentRequest;
/* 261 */                       streamingCallback3 = streamingCallback2;
/* 262 */                       z3 = z;
/* 81 */                        String str4 = str3;
/* 271 */                       if (((Boolean) objI00000oIO).booleanValue()) {
                                }
                            }
                        }
/* 303 */               boolean z4 = z;
/* 304 */               generateContentRequest2 = generateContentRequest;
/* 305 */               z2 = z4;
/* 306 */               o0IOli0o03 = o0IOli0o02;
/* 313 */               if (o0IOli0o03 != null) {
                        }
/* 317 */               i1O0ll11O0ll i1o0ll11o0ll = new i1O0ll11O0ll(generateContentRequest2, o0IOli0o03, z2);
/* 320 */               o11ooollioi12.I00io1l = null;
/* 322 */               o11ooollioi12.I00iOIl = null;
/* 324 */               o11ooollioi12.I00iiI = null;
/* 326 */               o11ooollioi12.I00ioIO = null;
/* 328 */               o11ooollioi12.I00l0I0l0lO1 = null;
/* 330 */               o11ooollioi12.I00ilO0 = 5;
/* 332 */               objI00IoiI = i1ioo0olii.I00IoiI(i1o0ll11o0ll, streamingCallback2, o11ooollioi12);
/* 336 */               if (objI00IoiI != obj) {
                        }
                    } else if (i3 == 1) {
/* 97 */                z = o11ooollioi12.I00iiO;
/* 99 */                String str5 = o11ooollioi12.I00l0I0l0lO1;
/* 101 */               String str6 = o11ooollioi12.I00ioIO;
/* 103 */               O0IOli0o0 o0IOli0o04 = o11ooollioi12.I00iiI;
/* 105 */               StreamingCallback streamingCallback4 = o11ooollioi12.I00iOIl;
/* 107 */               GenerateContentRequest generateContentRequest4 = o11ooollioi12.I00io1l;
/* 109 */               lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 113 */               str = str5;
/* 114 */               generateContentRequest = generateContentRequest4;
/* 115 */               o0IOli0o02 = o0IOli0o04;
/* 116 */               i = 2;
/* 117 */               str2 = str6;
/* 118 */               streamingCallback = streamingCallback4;
                    } else {
/* 43 */                if (i3 != 2) {
/* 45 */                    if (i3 != 3) {
/* 47 */                        if (i3 == 4) {
/* 61 */                            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 64 */                            return objI00000oIO;
                                }
/* 49 */                        if (i3 == 5) {
/* 51 */                            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 54 */                            return objI00000oIO;
                                }
/* 57 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 38 */                        return null;
                            }
/* 65 */                    boolean z5 = o11ooollioi12.I00iiO;
/* 67 */                    str3 = o11ooollioi12.I00ioIO;
/* 69 */                    O0IOli0o0 o0IOli0o05 = o11ooollioi12.I00iiI;
/* 71 */                    StreamingCallback streamingCallback5 = o11ooollioi12.I00iOIl;
/* 73 */                    generateContentRequest3 = o11ooollioi12.I00io1l;
/* 75 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 78 */                    z3 = z5;
/* 79 */                    o0IOli0o02 = o0IOli0o05;
/* 80 */                    streamingCallback3 = streamingCallback5;
/* 81 */                    String str42 = str3;
/* 271 */                   if (((Boolean) objI00000oIO).booleanValue()) {
/* 302 */                       throw new GenAiException("Prefix Caching feature is not available.", (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                            }
/* 273 */                   o11ooollioi12.I00io1l = null;
/* 275 */                   o11ooollioi12.I00iOIl = null;
/* 277 */                   o11ooollioi12.I00iiI = null;
/* 279 */                   o11ooollioi12.I00ioIO = null;
/* 281 */                   o11ooollioi12.I00ilO0 = 4;
/* 285 */                   Object objI000O01llI0 = I000O01llI0(generateContentRequest3, streamingCallback3, str42, o0IOli0o02, z3, o11ooollioi12);
                            return objI000O01llI0 == obj ? obj : objI000O01llI0;
                        }
/* 84 */                z2 = o11ooollioi12.I00iiO;
/* 86 */                o0IOli0o03 = o11ooollioi12.I00iiI;
/* 88 */                streamingCallback2 = o11ooollioi12.I00iOIl;
/* 90 */                generateContentRequest2 = o11ooollioi12.I00io1l;
/* 92 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 218 */               generateContentResponse = (GenerateContentResponse) objI00000oIO;
/* 220 */               if (generateContentResponse != null) {
/* 225 */                   return generateContentResponse;
                        }
/* 313 */               i1IoO0OlII i1ioo0olii = o0IOli0o03 != null ? this.I0000O : this.I00000oIO;
/* 317 */               i1O0ll11O0ll i1o0ll11o0ll2 = new i1O0ll11O0ll(generateContentRequest2, o0IOli0o03, z2);
/* 320 */               o11ooollioi12.I00io1l = null;
/* 322 */               o11ooollioi12.I00iOIl = null;
/* 324 */               o11ooollioi12.I00iiI = null;
/* 326 */               o11ooollioi12.I00ioIO = null;
/* 328 */               o11ooollioi12.I00l0I0l0lO1 = null;
/* 330 */               o11ooollioi12.I00ilO0 = 5;
/* 332 */               objI00IoiI = i1ioo0olii.I00IoiI(i1o0ll11o0ll2, streamingCallback2, o11ooollioi12);
/* 336 */               if (objI00IoiI != obj) {
/* 399 */                   return objI00IoiI;
                        }
                    }
/* 119 */           boolean z6 = z;
/* 187 */           if (((Boolean) objI00000oIO).booleanValue()) {
/* 189 */               o11ooollioi12.I00io1l = generateContentRequest;
/* 191 */               o11ooollioi12.I00iOIl = streamingCallback;
/* 193 */               o11ooollioi12.I00iiI = o0IOli0o02;
/* 195 */               o11ooollioi12.I00ioIO = null;
/* 197 */               o11ooollioi12.I00l0I0l0lO1 = null;
/* 199 */               o11ooollioi12.I00iiO = z6;
/* 201 */               o11ooollioi12.I00ilO0 = i;
/* 204 */               GenerateContentRequest generateContentRequest5 = generateContentRequest;
/* 205 */               StreamingCallback streamingCallback6 = streamingCallback;
/* 206 */               objI00000oIO = I000II(generateContentRequest5, streamingCallback6, str2, o0IOli0o02, z6, o11ooollioi12);
/* 210 */               generateContentRequest2 = generateContentRequest5;
/* 211 */               streamingCallback2 = streamingCallback6;
/* 212 */               if (objI00000oIO != obj) {
/* 216 */                   o0IOli0o03 = o0IOli0o02;
/* 217 */                   z2 = z6;
/* 218 */                   generateContentResponse = (GenerateContentResponse) objI00000oIO;
/* 220 */                   if (generateContentResponse != null) {
                            }
/* 313 */                   if (o0IOli0o03 != null) {
                            }
/* 317 */                   i1O0ll11O0ll i1o0ll11o0ll22 = new i1O0ll11O0ll(generateContentRequest2, o0IOli0o03, z2);
/* 320 */                   o11ooollioi12.I00io1l = null;
/* 322 */                   o11ooollioi12.I00iOIl = null;
/* 324 */                   o11ooollioi12.I00iiI = null;
/* 326 */                   o11ooollioi12.I00ioIO = null;
/* 328 */                   o11ooollioi12.I00l0I0l0lO1 = null;
/* 330 */                   o11ooollioi12.I00ilO0 = 5;
/* 332 */                   objI00IoiI = i1ioo0olii.I00IoiI(i1o0ll11o0ll22, streamingCallback2, o11ooollioi12);
/* 336 */                   if (objI00IoiI != obj) {
                            }
                        }
                    }
/* 227 */           z = z6;
/* 228 */           streamingCallback2 = streamingCallback;
/* 229 */           str3 = str;
/* 237 */           if (str3.length() <= 0) {
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:168:0x0455, code lost:
                
                    if (r0 != r6) goto L169;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x02be, code lost:
                
                    if (r0 == r6) goto L171;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:113:0x02f2 A[Catch: GenAiException -> 0x02eb, TRY_LEAVE, TryCatch #13 {GenAiException -> 0x02eb, blocks: (B:107:0x02e3, B:108:0x02ea, B:113:0x02f2), top: B:198:0x0261 }] */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0356  */
                /* JADX WARN: Removed duplicated region for block: B:135:0x0365  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x036f  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x03bd  */
                /* JADX WARN: Removed duplicated region for block: B:155:0x03e9 A[Catch: GenAiException -> 0x03c2, TRY_LEAVE, TryCatch #4 {GenAiException -> 0x03c2, blocks: (B:144:0x03b9, B:147:0x03bf, B:151:0x03c6, B:150:0x03c4, B:155:0x03e9, B:142:0x039c), top: B:182:0x039c }] */
                /* JADX WARN: Removed duplicated region for block: B:160:0x0411  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x0414  */
                /* JADX WARN: Removed duplicated region for block: B:163:0x0418  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x0437  */
                /* JADX WARN: Removed duplicated region for block: B:178:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:182:0x039c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:203:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x01b0  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
                /* JADX WARN: Type inference failed for: r17v13, types: [i1Ii1ooOII0] */
                /* JADX WARN: Type inference failed for: r17v17, types: [I10i01i0Iilo, IlliIl1l11O] */
                /* JADX WARN: Type inference failed for: r1v0, types: [o1I0I0O] */
                /* JADX WARN: Type inference failed for: r7v0, types: [int] */
                /* JADX WARN: Type inference failed for: r8v45 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(GenerateContentRequest generateContentRequest, StreamingCallback streamingCallback, String str, O0IOli0o0 o0IOli0o0, boolean z, IOoilo iOoilo) throws Throwable {
                    o11ii01lOO o11ii01loo;
                    i1Ilio0i0 i1ilio0i0;
                    String str2;
                    String str3;
                    String str4;
                    GenerateContentRequest generateContentRequest2;
                    StreamingCallback streamingCallback2;
                    String str5;
                    String str6;
                    i1Ii1ooOII0 i1ii1oooii0;
                    boolean z2;
                    i1Ilio0i0 i1ilio0i02;
                    String str7;
                    int i;
                    i1Ii1ooOII0 i1ii1oooii02;
                    boolean z3;
                    String str8;
                    String str9;
                    O0IOli0o0 o0IOli0o02;
                    i1Ii1ooOII0 i1ii1oooii03;
                    boolean z4;
                    i1Ilio0i0 i1ilio0i03;
                    String str10;
                    int i2;
                    o1I0I0O o1i0i0o;
                    int i3;
                    boolean z5;
                    i1Ii1ooOII0 i1ii1oooii04;
                    O0IOli0o0 o0IOli0o03;
                    String str11;
                    i1Ii1ooOII0 i1ii1oooii05;
                    boolean z6;
                    i1Ilio0i0 i1ilio0i04;
                    String str12;
                    i1Ii1ooOII0 i1ii1oooii06;
                    boolean z7;
                    i1Ilio0i0 i1ilio0i05;
                    String str13;
                    i1Ilio0i0 i1ilio0i06;
                    String str14;
                    i1Ilio0i0 i1ilio0i07;
                    ParcelFileDescriptor parcelFileDescriptor;
                    i1Ilio0i0 i1ilio0i08;
                    i1Ilio0i0 i1ilio0i09;
                    i1Ilio0i0 i1ilio0i010;
                    i1Ilio0i0 i1ilio0i011;
                    i1Ii1ooOII0 i1ii1oooii07;
                    GenerateContentRequest generateContentRequest3;
                    Object objI001l0I00;
                    StreamingCallback streamingCallback3;
                    boolean z8;
                    String str15;
                    O0IOli0o0 o0IOli0o04;
                    Object objI00000oIO;
                    GenerateContentRequest generateContentRequest4;
                    StreamingCallback streamingCallback4;
                    boolean z9;
                    i1Ii1ooOII0 i1ii1oooii08;
                    int i4;
                    i1Ii1ooOII0 i1ii1oooii09;
                    GenerateContentRequest generateContentRequest5;
                    String str16;
                    boolean z10;
                    i1Ilio0i0 i1ilio0i012;
                    String str17;
                    boolean z11;
                    i1Ii1ooOII0 i1ii1oooii010;
                    String str18;
                    i1Ilio0i0 i1ilio0i013;
                    String str19;
                    i1Ilio0i0 i1ilio0i014;
                    String str20;
                    ?? i10i01i0Iilo;
                    GenerateContentRequest generateContentRequest6;
                    boolean z12;
                    i1Ii1ooOII0 i1ii1oooii011;
                    String str21;
                    i1Ilio0i0 i1ilio0i015;
                    ParcelFileDescriptor parcelFileDescriptor2;
                    i1Ilio0i0 i1ilio0i016;
                    String str22;
                    i1Ilio0i0 i1ilio0i017;
                    String str23;
                    i1Ii1ooOII0 i1ii1oooii012;
                    boolean z13;
                    i1Ilio0i0 i1ilio0i018;
                    int i5;
                    ?? r8;
/* 1 */             ?? r1 = this;
/* 5 */             i1Ilio0i0 i1ilio0i019 = r1.I000OiO;
/* 13 */            if (!(iOoilo instanceof o11ii01lOO) || (r8 = (i5 = (o11ii01loo = (o11ii01lOO) iOoilo).I00ioIO) & Integer.MIN_VALUE) == 0) {
/* 32 */                o11ii01loo = new o11ii01lOO(r1, iOoilo);
                    } else {
/* 27 */                o11ii01loo.I00ioIO = i5 - Integer.MIN_VALUE;
                    }
/* 35 */            Object objI00000oIO2 = o11ii01loo.I00ilO0;
/* 37 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 39 */            ?? r7 = o11ii01loo.I00ioIO;
/* 43 */            O0IOli0o0 o0IOli0o05 = null;
                    try {
                        try {
                        } catch (GenAiException e) {
/* 185 */                   e = e;
/* 186 */                   i1ilio0i0 = i1ilio0i019;
/* 9 */                     str2 = "Failed to open cache for prefix: ";
/* 41 */                    str3 = "GenerativeModel";
                            z3 = r7;
                            i1ii1oooii02 = r8;
                        }
                        switch (r7) {
                            case 0:
/* 358 */                       lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 361 */                       generateContentRequest3 = generateContentRequest;
/* 363 */                       o11ii01loo.I00iOIl = generateContentRequest3;
/* 367 */                       o11ii01loo.I00iiI = streamingCallback;
/* 371 */                       o11ii01loo.I00l0I0l0lO1 = str;
/* 375 */                       o11ii01loo.I00iiO = o0IOli0o0;
/* 379 */                       o11ii01loo.I00iio = z;
/* 382 */                       o11ii01loo.I00ioIO = 1;
/* 386 */                       objI001l0I00 = iOil1lO10l.I001l0I00(r1.I00000oIO, o11ii01loo);
/* 390 */                       if (objI001l0I00 == ii0111o) {
/* 1119 */                          return ii0111o;
                                }
/* 396 */                       streamingCallback3 = streamingCallback;
/* 397 */                       z8 = z;
/* 401 */                       str15 = str;
/* 402 */                       o0IOli0o04 = o0IOli0o0;
/* 404 */                       str9 = (String) objI001l0I00;
/* 406 */                       Context contextI0010I0i = l1I0oI.I0010I0i();
/* 410 */                       o11ii01loo.I00iOIl = generateContentRequest3;
/* 412 */                       o11ii01loo.I00iiI = streamingCallback3;
/* 414 */                       o11ii01loo.I00l0I0l0lO1 = str15;
/* 416 */                       o11ii01loo.I00iiO = o0IOli0o04;
/* 418 */                       o11ii01loo.I00l0OO0IO = str9;
/* 420 */                       o11ii01loo.I00iio = z8;
/* 423 */                       o11ii01loo.I00ioIO = 2;
/* 425 */                       objI00000oIO = i1Ilio0i0.I00000oIO(i1ilio0i019, contextI0010I0i, str15, str9, o11ii01loo);
/* 429 */                       if (objI00000oIO != ii0111o) {
/* 435 */                           generateContentRequest4 = generateContentRequest3;
/* 436 */                           objI00000oIO2 = objI00000oIO;
/* 438 */                           String str24 = str15;
/* 440 */                           o0IOli0o02 = o0IOli0o04;
/* 441 */                           streamingCallback4 = streamingCallback3;
/* 442 */                           str7 = str24;
                                    z9 = z8;
/* 444 */                           i1ii1oooii08 = (i1Ii1ooOII0) objI00000oIO2;
/* 446 */                           i4 = 0;
/* 447 */                           if (i1ii1oooii08 != null) {
/* 449 */                               o11ii01loo.I00iOIl = generateContentRequest4;
/* 451 */                               o11ii01loo.I00iiI = streamingCallback4;
/* 453 */                               o11ii01loo.I00l0I0l0lO1 = str7;
/* 455 */                               o11ii01loo.I00iiO = o0IOli0o02;
/* 457 */                               o11ii01loo.I00l0OO0IO = str9;
/* 460 */                               o11ii01loo.I00li1OI = null;
/* 462 */                               o11ii01loo.I00iio = z9;
/* 464 */                               o11ii01loo.I00ilI0I1 = 0;
/* 467 */                               o11ii01loo.I00ioIO = 3;
/* 469 */                               Object objI000OOo1O = r1.I000OOo1O(o11ii01loo);
/* 473 */                               if (objI000OOo1O != ii0111o) {
/* 475 */                                   StreamingCallback streamingCallback5 = streamingCallback4;
/* 477 */                                   i1ii1oooii09 = i1ii1oooii08;
/* 478 */                                   objI00000oIO2 = objI000OOo1O;
/* 479 */                                   o0IOli0o05 = o0IOli0o02;
/* 480 */                                   generateContentRequest5 = generateContentRequest4;
/* 481 */                                   streamingCallback2 = streamingCallback5;
/* 483 */                                   String str25 = str9;
/* 485 */                                   str5 = str7;
/* 486 */                                   str16 = str25;
                                            z10 = z9;
/* 494 */                                   if (((Boolean) objI00000oIO2).booleanValue()) {
/* 855 */                                       i1ilio0i04 = i1ilio0i019;
/* 9 */                                         str11 = "Failed to open cache for prefix: ";
/* 41 */                                        str3 = "GenerativeModel";
/* 863 */                                       String str26 = str5;
/* 864 */                                       str9 = str16;
/* 865 */                                       str7 = str26;
/* 866 */                                       i = i4;
/* 867 */                                       generateContentRequest2 = generateContentRequest5;
                                                z6 = z10;
                                                i1ii1oooii05 = i1ii1oooii09;
/* 712 */                                       o0IOli0o02 = o0IOli0o05;
                                                i1ilio0i03 = i1ilio0i04;
                                                z4 = z6;
                                                i1ii1oooii03 = i1ii1oooii05;
                                                str8 = str11;
/* 878 */                                       if (i1ii1oooii03 != null) {
                                                }
                                            } else {
                                                try {
/* 496 */                                           Context contextI0010I0i2 = l1I0oI.I0010I0i();
/* 500 */                                           o11ii01loo.I00iOIl = generateContentRequest5;
/* 502 */                                           o11ii01loo.I00iiI = streamingCallback2;
/* 504 */                                           o11ii01loo.I00l0I0l0lO1 = str5;
/* 506 */                                           o11ii01loo.I00iiO = o0IOli0o05;
/* 508 */                                           o11ii01loo.I00l0OO0IO = str16;
/* 510 */                                           o11ii01loo.I00li1OI = i1ii1oooii09;
/* 512 */                                           o11ii01loo.I00iio = z10;
/* 514 */                                           o11ii01loo.I00ilI0I1 = i4;
/* 519 */                                           o11ii01loo.I00ioIO = 4;
/* 525 */                                           if (str5.length() == 0) {
/* 527 */                                               z11 = z10;
/* 529 */                                               i1ii1oooii010 = i1ii1oooii09;
/* 531 */                                               objI00000oIO2 = null;
                                                    } else {
/* 547 */                                               String str27 = str16;
                                                        try {
/* 549 */                                                   ?? i1ii1oooii013 = new i1Ii1ooOII0(System.currentTimeMillis(), i1Ilio0i0.I0000Il00O(str5, str16), ll1i1lil01I1.I00000oIO(), str27);
/* 552 */                                                   str16 = str27;
/* 554 */                                                   IOiOol0 iOiOol0 = i1ilio0i019.I00000oIO;
/* 556 */                                                   z11 = z10;
                                                            try {
/* 560 */                                                       i1ii1oooii010 = i1ii1oooii09;
                                                            } catch (GenAiException e2) {
/* 809 */                                                       e = e2;
/* 810 */                                                       i1ilio0i012 = i1ilio0i019;
/* 9 */                                                         str17 = "Failed to open cache for prefix: ";
/* 832 */                                                       i1ii1oooii010 = i1ii1oooii09;
                                                                i1ilio0i014 = i1ilio0i012;
                                                                str19 = str17;
/* 41 */                                                        str3 = "GenerativeModel";
                                                                i1ilio0i013 = i1ilio0i014;
                                                                str18 = str19;
/* 835 */                                                       z3 = z11;
/* 837 */                                                       i1ii1oooii02 = i1ii1oooii010;
/* 839 */                                                       generateContentRequest2 = generateContentRequest5;
/* 840 */                                                       str6 = str16;
                                                                i1ilio0i0 = i1ilio0i013;
                                                                str2 = str18;
/* 851 */                                                       Log.w(str3, "Failed to create cache for prefix: ".concat(String.valueOf(str5)), e);
                                                                i1ilio0i02 = i1ilio0i0;
                                                                z2 = z3;
                                                                i1ii1oooii0 = i1ii1oooii02;
                                                                str4 = str2;
/* 791 */                                                       str7 = str5;
/* 792 */                                                       i = 1;
                                                                i1ilio0i05 = i1ilio0i02;
                                                                z7 = z2;
                                                                i1ii1oooii06 = i1ii1oooii0;
                                                                str12 = str4;
/* 711 */                                                       str9 = str6;
                                                                i1ilio0i04 = i1ilio0i05;
                                                                z6 = z7;
                                                                i1ii1oooii05 = i1ii1oooii06;
                                                                str11 = str12;
/* 712 */                                                       o0IOli0o02 = o0IOli0o05;
                                                                i1ilio0i03 = i1ilio0i04;
                                                                z4 = z6;
                                                                i1ii1oooii03 = i1ii1oooii05;
                                                                str8 = str11;
/* 878 */                                                       if (i1ii1oooii03 != null) {
                                                                }
                                                            }
                                                            try {
/* 564 */                                                       OoOi1I011O ooOi1I011O = new OoOi1I011O(18);
/* 567 */                                                       VarHandle.storeStoreFence();
/* 574 */                                                       Ii00l101O ii00l101O = ((IIOlO1ii) iOiOol0.I00ioIO).I00iiI;
/* 576 */                                                       str20 = i1ii1oooii013;
/* 590 */                                                       i10i01i0Iilo = new I10i01i0Iilo(str20, iOiOol0, contextI0010I0i2, ooOi1I011O, null, 7);
/* 595 */                                                       objI00000oIO2 = iOi1II01i0.I0000oI00(ii00l101O, i10i01i0Iilo, o11ii01loo);
                                                            } catch (GenAiException e3) {
/* 804 */                                                       e = e3;
/* 805 */                                                       i1ilio0i014 = i1ilio0i019;
/* 9 */                                                         str19 = "Failed to open cache for prefix: ";
/* 41 */                                                        str3 = "GenerativeModel";
                                                                i1ilio0i013 = i1ilio0i014;
                                                                str18 = str19;
/* 835 */                                                       z3 = z11;
/* 837 */                                                       i1ii1oooii02 = i1ii1oooii010;
/* 839 */                                                       generateContentRequest2 = generateContentRequest5;
/* 840 */                                                       str6 = str16;
                                                                i1ilio0i0 = i1ilio0i013;
                                                                str2 = str18;
/* 851 */                                                       Log.w(str3, "Failed to create cache for prefix: ".concat(String.valueOf(str5)), e);
                                                                i1ilio0i02 = i1ilio0i0;
                                                                z2 = z3;
                                                                i1ii1oooii0 = i1ii1oooii02;
                                                                str4 = str2;
/* 791 */                                                       str7 = str5;
/* 792 */                                                       i = 1;
                                                                i1ilio0i05 = i1ilio0i02;
                                                                z7 = z2;
                                                                i1ii1oooii06 = i1ii1oooii0;
                                                                str12 = str4;
/* 711 */                                                       str9 = str6;
                                                                i1ilio0i04 = i1ilio0i05;
                                                                z6 = z7;
                                                                i1ii1oooii05 = i1ii1oooii06;
                                                                str11 = str12;
/* 712 */                                                       o0IOli0o02 = o0IOli0o05;
                                                                i1ilio0i03 = i1ilio0i04;
                                                                z4 = z6;
                                                                i1ii1oooii03 = i1ii1oooii05;
                                                                str8 = str11;
/* 878 */                                                       if (i1ii1oooii03 != null) {
                                                                }
                                                            }
                                                        } catch (GenAiException e4) {
/* 814 */                                                   e = e4;
/* 815 */                                                   i1ilio0i013 = i1ilio0i019;
/* 9 */                                                     str18 = "Failed to open cache for prefix: ";
/* 818 */                                                   z11 = z10;
/* 820 */                                                   i1ii1oooii010 = i1ii1oooii09;
/* 41 */                                                    str3 = "GenerativeModel";
/* 823 */                                                   str16 = str27;
/* 835 */                                                   z3 = z11;
/* 837 */                                                   i1ii1oooii02 = i1ii1oooii010;
/* 839 */                                                   generateContentRequest2 = generateContentRequest5;
/* 840 */                                                   str6 = str16;
                                                            i1ilio0i0 = i1ilio0i013;
                                                            str2 = str18;
/* 851 */                                                   Log.w(str3, "Failed to create cache for prefix: ".concat(String.valueOf(str5)), e);
                                                            i1ilio0i02 = i1ilio0i0;
                                                            z2 = z3;
                                                            i1ii1oooii0 = i1ii1oooii02;
                                                            str4 = str2;
/* 791 */                                                   str7 = str5;
/* 792 */                                                   i = 1;
                                                            i1ilio0i05 = i1ilio0i02;
                                                            z7 = z2;
                                                            i1ii1oooii06 = i1ii1oooii0;
                                                            str12 = str4;
/* 711 */                                                   str9 = str6;
                                                            i1ilio0i04 = i1ilio0i05;
                                                            z6 = z7;
                                                            i1ii1oooii05 = i1ii1oooii06;
                                                            str11 = str12;
/* 712 */                                                   o0IOli0o02 = o0IOli0o05;
                                                            i1ilio0i03 = i1ilio0i04;
                                                            z4 = z6;
                                                            i1ii1oooii03 = i1ii1oooii05;
                                                            str8 = str11;
/* 878 */                                                   if (i1ii1oooii03 != null) {
                                                            }
                                                        }
                                                    }
                                                } catch (GenAiException e5) {
/* 826 */                                           e = e5;
/* 827 */                                           i1ilio0i012 = i1ilio0i019;
/* 9 */                                             str17 = "Failed to open cache for prefix: ";
/* 830 */                                           z11 = z10;
                                                }
/* 599 */                                       if (objI00000oIO2 != ii0111o) {
/* 601 */                                           String str28 = str16;
/* 602 */                                           generateContentRequest6 = generateContentRequest5;
/* 603 */                                           str6 = str28;
/* 604 */                                           z12 = z11;
/* 606 */                                           i1ii1oooii011 = i1ii1oooii010;
                                                    try {
/* 608 */                                               parcelFileDescriptor2 = (ParcelFileDescriptor) objI00000oIO2;
                                                        try {
                                                        } catch (GenAiException e6) {
/* 748 */                                                   e = e6;
                                                            i1ilio0i015 = r1;
                                                            str21 = i10i01i0Iilo;
                                                        }
                                                    } catch (GenAiException e7) {
/* 797 */                                               e = e7;
/* 798 */                                               i1ilio0i015 = i1ilio0i019;
/* 9 */                                                 str21 = "Failed to open cache for prefix: ";
/* 41 */                                                str3 = "GenerativeModel";
                                                    }
/* 610 */                                           if (parcelFileDescriptor2 == null) {
                                                        try {
/* 612 */                                                   o0OO0i o0oo0i = r1.I00000oOI;
/* 9 */                                                     String str29 = "Failed to open cache for prefix: ";
                                                            try {
/* 616 */                                                       PromptPrefix zzg = generateContentRequest6.getZzg();
/* 620 */                                                       if (zzg == null) {
/* 747 */                                                           throw new IllegalArgumentException("Prompt prefix is not set.");
                                                                }
/* 626 */                                                       CreateCachedContextRequest createCachedContextRequest = CreateCachedContextRequestKt.createCachedContextRequest(zzg.getTextString(), zzg);
/* 632 */                                                       i1ilio0i017 = i1ilio0i019;
/* 41 */                                                        str20 = "GenerativeModel";
                                                                try {
/* 638 */                                                           i1O0O0O i1o0o0o = new i1O0O0O(str5, parcelFileDescriptor2, null, 4);
/* 641 */                                                           o11ii01loo.I00iOIl = generateContentRequest6;
/* 643 */                                                           o11ii01loo.I00iiI = streamingCallback2;
/* 645 */                                                           o11ii01loo.I00l0I0l0lO1 = str5;
/* 647 */                                                           o11ii01loo.I00iiO = o0IOli0o05;
/* 649 */                                                           o11ii01loo.I00l0OO0IO = str6;
/* 651 */                                                           o11ii01loo.I00li1OI = i1ii1oooii011;
/* 653 */                                                           o11ii01loo.I00iio = z12;
/* 655 */                                                           o11ii01loo.I00ilI0I1 = i4;
/* 658 */                                                           o11ii01loo.I00ioIO = 5;
/* 670 */                                                           if (il001oo1.I0000Il00O(new o0OIO0il(i1o0o0o, o0oo0i, createCachedContextRequest, null), o11ii01loo) != ii0111o) {
/* 672 */                                                               i = i4;
/* 673 */                                                               generateContentRequest2 = generateContentRequest6;
                                                                        z13 = z12;
                                                                        i1ii1oooii012 = i1ii1oooii011;
                                                                        str23 = str29;
                                                                        try {
/* 674 */                                                                   Context contextI0010I0i3 = l1I0oI.I0010I0i();
/* 678 */                                                                   o11ii01loo.I00iOIl = generateContentRequest2;
/* 680 */                                                                   o11ii01loo.I00iiI = streamingCallback2;
/* 682 */                                                                   o11ii01loo.I00l0I0l0lO1 = str5;
/* 684 */                                                                   o11ii01loo.I00iiO = o0IOli0o05;
/* 686 */                                                                   o11ii01loo.I00l0OO0IO = str6;
/* 688 */                                                                   o11ii01loo.I00li1OI = i1ii1oooii012;
/* 690 */                                                                   o11ii01loo.I00iio = z13;
/* 692 */                                                                   o11ii01loo.I00ilI0I1 = i;
/* 695 */                                                                   o11ii01loo.I00ioIO = 6;
/* 697 */                                                                   i1ilio0i018 = i1ilio0i017;
                                                                            try {
/* 699 */                                                                       objI00000oIO2 = i1Ilio0i0.I00000oIO(i1ilio0i018, contextI0010I0i3, str5, str6, o11ii01loo);
                                                                                i1ilio0i018 = i1ilio0i018;
                                                                                z13 = z13;
                                                                                i1ii1oooii012 = i1ii1oooii012;
                                                                                str23 = str23;
                                                                                break;
                                                                            } catch (GenAiException e8) {
/* 715 */                                                                       e = e8;
/* 716 */                                                                       str3 = str20;
                                                                                i1ilio0i0 = i1ilio0i018;
                                                                                z3 = z13;
                                                                                i1ii1oooii02 = i1ii1oooii012;
                                                                                str2 = str23;
/* 851 */                                                                       Log.w(str3, "Failed to create cache for prefix: ".concat(String.valueOf(str5)), e);
                                                                                i1ilio0i02 = i1ilio0i0;
                                                                                z2 = z3;
                                                                                i1ii1oooii0 = i1ii1oooii02;
                                                                                str4 = str2;
/* 791 */                                                                       str7 = str5;
/* 792 */                                                                       i = 1;
                                                                                i1ilio0i05 = i1ilio0i02;
                                                                                z7 = z2;
                                                                                i1ii1oooii06 = i1ii1oooii0;
                                                                                str12 = str4;
/* 711 */                                                                       str9 = str6;
                                                                                i1ilio0i04 = i1ilio0i05;
                                                                                z6 = z7;
                                                                                i1ii1oooii05 = i1ii1oooii06;
                                                                                str11 = str12;
/* 712 */                                                                       o0IOli0o02 = o0IOli0o05;
                                                                                i1ilio0i03 = i1ilio0i04;
                                                                                z4 = z6;
                                                                                i1ii1oooii03 = i1ii1oooii05;
                                                                                str8 = str11;
/* 878 */                                                                       if (i1ii1oooii03 != null) {
                                                                                }
                                                                            }
                                                                        } catch (GenAiException e9) {
/* 720 */                                                                   e = e9;
/* 721 */                                                                   i1ilio0i018 = i1ilio0i017;
/* 716 */                                                                   str3 = str20;
                                                                            i1ilio0i0 = i1ilio0i018;
                                                                            z3 = z13;
                                                                            i1ii1oooii02 = i1ii1oooii012;
                                                                            str2 = str23;
/* 851 */                                                                   Log.w(str3, "Failed to create cache for prefix: ".concat(String.valueOf(str5)), e);
                                                                            i1ilio0i02 = i1ilio0i0;
                                                                            z2 = z3;
                                                                            i1ii1oooii0 = i1ii1oooii02;
                                                                            str4 = str2;
/* 791 */                                                                   str7 = str5;
/* 792 */                                                                   i = 1;
                                                                            i1ilio0i05 = i1ilio0i02;
                                                                            z7 = z2;
                                                                            i1ii1oooii06 = i1ii1oooii0;
                                                                            str12 = str4;
/* 711 */                                                                   str9 = str6;
                                                                            i1ilio0i04 = i1ilio0i05;
                                                                            z6 = z7;
                                                                            i1ii1oooii05 = i1ii1oooii06;
                                                                            str11 = str12;
/* 712 */                                                                   o0IOli0o02 = o0IOli0o05;
                                                                            i1ilio0i03 = i1ilio0i04;
                                                                            z4 = z6;
                                                                            i1ii1oooii03 = i1ii1oooii05;
                                                                            str8 = str11;
/* 878 */                                                                   if (i1ii1oooii03 != null) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (GenAiException e10) {
/* 728 */                                                           e = e10;
/* 729 */                                                           i1ilio0i015 = i1ilio0i017;
                                                                    str21 = str29;
/* 724 */                                                           str3 = str20;
/* 273 */                                                           generateContentRequest2 = generateContentRequest6;
                                                                    i1ilio0i0 = i1ilio0i015;
                                                                    z3 = z12;
                                                                    i1ii1oooii02 = i1ii1oooii011;
                                                                    str2 = str21;
/* 851 */                                                           Log.w(str3, "Failed to create cache for prefix: ".concat(String.valueOf(str5)), e);
                                                                    i1ilio0i02 = i1ilio0i0;
                                                                    z2 = z3;
                                                                    i1ii1oooii0 = i1ii1oooii02;
                                                                    str4 = str2;
/* 791 */                                                           str7 = str5;
/* 792 */                                                           i = 1;
                                                                    i1ilio0i05 = i1ilio0i02;
                                                                    z7 = z2;
                                                                    i1ii1oooii06 = i1ii1oooii0;
                                                                    str12 = str4;
/* 711 */                                                           str9 = str6;
                                                                    i1ilio0i04 = i1ilio0i05;
                                                                    z6 = z7;
                                                                    i1ii1oooii05 = i1ii1oooii06;
                                                                    str11 = str12;
/* 712 */                                                           o0IOli0o02 = o0IOli0o05;
                                                                    i1ilio0i03 = i1ilio0i04;
                                                                    z4 = z6;
                                                                    i1ii1oooii03 = i1ii1oooii05;
                                                                    str8 = str11;
/* 878 */                                                           if (i1ii1oooii03 != null) {
                                                                    }
                                                                }
                                                            } catch (GenAiException e11) {
/* 732 */                                                       e = e11;
/* 733 */                                                       i1ilio0i016 = i1ilio0i019;
                                                                str22 = str29;
/* 41 */                                                        str20 = "GenerativeModel";
                                                                i1ilio0i015 = i1ilio0i016;
                                                                str21 = str22;
/* 724 */                                                       str3 = str20;
/* 273 */                                                       generateContentRequest2 = generateContentRequest6;
                                                                i1ilio0i0 = i1ilio0i015;
                                                                z3 = z12;
                                                                i1ii1oooii02 = i1ii1oooii011;
                                                                str2 = str21;
/* 851 */                                                       Log.w(str3, "Failed to create cache for prefix: ".concat(String.valueOf(str5)), e);
                                                                i1ilio0i02 = i1ilio0i0;
                                                                z2 = z3;
                                                                i1ii1oooii0 = i1ii1oooii02;
                                                                str4 = str2;
/* 791 */                                                       str7 = str5;
/* 792 */                                                       i = 1;
                                                                i1ilio0i05 = i1ilio0i02;
                                                                z7 = z2;
                                                                i1ii1oooii06 = i1ii1oooii0;
                                                                str12 = str4;
/* 711 */                                                       str9 = str6;
                                                                i1ilio0i04 = i1ilio0i05;
                                                                z6 = z7;
                                                                i1ii1oooii05 = i1ii1oooii06;
                                                                str11 = str12;
/* 712 */                                                       o0IOli0o02 = o0IOli0o05;
                                                                i1ilio0i03 = i1ilio0i04;
                                                                z4 = z6;
                                                                i1ii1oooii03 = i1ii1oooii05;
                                                                str8 = str11;
/* 878 */                                                       if (i1ii1oooii03 != null) {
                                                                }
                                                            }
                                                        } catch (GenAiException e12) {
/* 750 */                                                   e = e12;
/* 751 */                                                   i1ilio0i016 = i1ilio0i019;
/* 9 */                                                     str22 = "Failed to open cache for prefix: ";
                                                        }
                                                    } else {
/* 755 */                                               i1ilio0i015 = i1ilio0i019;
/* 9 */                                                 str21 = "Failed to open cache for prefix: ";
/* 772 */                                               StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 59);
/* 775 */                                               sb.append("Failed to open file descriptor to create cache for prefix: ");
/* 778 */                                               sb.append(str5);
/* 781 */                                               String string = sb.toString();
/* 41 */                                                str3 = "GenerativeModel";
                                                        try {
/* 787 */                                                   Log.w(str3, string);
/* 790 */                                                   generateContentRequest2 = generateContentRequest6;
                                                            i1ilio0i02 = i1ilio0i015;
                                                            z2 = z12;
                                                            i1ii1oooii0 = i1ii1oooii011;
                                                            str4 = str21;
                                                        } catch (GenAiException e13) {
/* 794 */                                                   e = e13;
/* 273 */                                                   generateContentRequest2 = generateContentRequest6;
                                                            i1ilio0i0 = i1ilio0i015;
                                                            z3 = z12;
                                                            i1ii1oooii02 = i1ii1oooii011;
                                                            str2 = str21;
/* 851 */                                                   Log.w(str3, "Failed to create cache for prefix: ".concat(String.valueOf(str5)), e);
                                                            i1ilio0i02 = i1ilio0i0;
                                                            z2 = z3;
                                                            i1ii1oooii0 = i1ii1oooii02;
                                                            str4 = str2;
/* 791 */                                                   str7 = str5;
/* 792 */                                                   i = 1;
                                                            i1ilio0i05 = i1ilio0i02;
                                                            z7 = z2;
                                                            i1ii1oooii06 = i1ii1oooii0;
                                                            str12 = str4;
/* 711 */                                                   str9 = str6;
                                                            i1ilio0i04 = i1ilio0i05;
                                                            z6 = z7;
                                                            i1ii1oooii05 = i1ii1oooii06;
                                                            str11 = str12;
/* 712 */                                                   o0IOli0o02 = o0IOli0o05;
                                                            i1ilio0i03 = i1ilio0i04;
                                                            z4 = z6;
                                                            i1ii1oooii03 = i1ii1oooii05;
                                                            str8 = str11;
/* 878 */                                                   if (i1ii1oooii03 != null) {
                                                            }
                                                        }
/* 791 */                                               str7 = str5;
/* 792 */                                               i = 1;
                                                        i1ilio0i05 = i1ilio0i02;
                                                        z7 = z2;
                                                        i1ii1oooii06 = i1ii1oooii0;
                                                        str12 = str4;
/* 711 */                                               str9 = str6;
                                                        i1ilio0i04 = i1ilio0i05;
                                                        z6 = z7;
                                                        i1ii1oooii05 = i1ii1oooii06;
                                                        str11 = str12;
/* 712 */                                               o0IOli0o02 = o0IOli0o05;
                                                        i1ilio0i03 = i1ilio0i04;
                                                        z4 = z6;
                                                        i1ii1oooii03 = i1ii1oooii05;
                                                        str8 = str11;
/* 878 */                                               if (i1ii1oooii03 != null) {
/* 880 */                                                   o11ii01loo.I00iOIl = generateContentRequest2;
/* 882 */                                                   o11ii01loo.I00iiI = streamingCallback2;
/* 884 */                                                   o11ii01loo.I00l0I0l0lO1 = str7;
/* 886 */                                                   o11ii01loo.I00iiO = o0IOli0o02;
/* 888 */                                                   o11ii01loo.I00l0OO0IO = str9;
/* 890 */                                                   o11ii01loo.I00li1OI = i1ii1oooii03;
/* 892 */                                                   o11ii01loo.I00iio = z4;
/* 894 */                                                   o11ii01loo.I00ilI0I1 = i;
/* 897 */                                                   o11ii01loo.I00ioIO = 7;
/* 899 */                                                   o1i0i0o = this;
/* 901 */                                                   objI00000oIO2 = o1i0i0o.I00000oIO(o11ii01loo);
/* 905 */                                                   if (objI00000oIO2 != ii0111o) {
/* 907 */                                                       boolean z14 = z4;
/* 909 */                                                       i3 = i;
/* 910 */                                                       z5 = z14;
/* 912 */                                                       O0IOli0o0 o0IOli0o06 = o0IOli0o02;
/* 914 */                                                       i1ii1oooii04 = i1ii1oooii03;
/* 915 */                                                       o0IOli0o03 = o0IOli0o06;
                                                                i1ilio0i06 = i1ilio0i03;
                                                                str13 = str8;
/* 923 */                                                       if (((Boolean) objI00000oIO2).booleanValue()) {
/* 1042 */                                                          str10 = str7;
/* 1043 */                                                          i2 = i3;
                                                                    i1ilio0i08 = i1ilio0i06;
/* 1047 */                                                          if (i2 != 0) {
                                                                    }
                                                                } else {
                                                                    try {
/* 925 */                                                               Context contextI0010I0i4 = l1I0oI.I0010I0i();
/* 929 */                                                               o11ii01loo.I00iOIl = generateContentRequest2;
/* 931 */                                                               o11ii01loo.I00iiI = streamingCallback2;
/* 933 */                                                               o11ii01loo.I00l0I0l0lO1 = str7;
/* 935 */                                                               o11ii01loo.I00iiO = o0IOli0o03;
/* 937 */                                                               o11ii01loo.I00l0OO0IO = str9;
/* 940 */                                                               o11ii01loo.I00li1OI = null;
/* 942 */                                                               o11ii01loo.I00iio = z5;
/* 946 */                                                               o11ii01loo.I00ioIO = 8;
/* 948 */                                                               objI00000oIO2 = i1Ilio0i0.I00000oOI(i1ilio0i06, contextI0010I0i4, i1ii1oooii04, o11ii01loo);
                                                                        i1ilio0i07 = i1ilio0i06;
                                                                        str14 = str13;
                                                                    } catch (GenAiException e14) {
/* 963 */                                                               e = e14;
/* 1035 */                                                              str10 = str7;
                                                                        i1ilio0i010 = i1ilio0i06;
/* 1038 */                                                              Log.w(str3, "Inference failed with prefix cache, retry without cache.", e);
                                                                        i1ilio0i09 = i1ilio0i010;
/* 1033 */                                                              i2 = 1;
                                                                        i1ilio0i08 = i1ilio0i09;
/* 1047 */                                                              if (i2 != 0) {
                                                                        }
                                                                    }
/* 952 */                                                           if (objI00000oIO2 != ii0111o) {
/* 954 */                                                               parcelFileDescriptor = (ParcelFileDescriptor) objI00000oIO2;
/* 956 */                                                               if (parcelFileDescriptor == null) {
/* 965 */                                                                   i1O01I1oi00l i1o01i1oi00l = o0IOli0o03 != null ? o1i0i0o.I0000oI00 : o1i0i0o.I0000Il00O;
/* 969 */                                                                   i1O0ll11O0ll i1o0ll11o0ll = new i1O0ll11O0ll(generateContentRequest2, o0IOli0o03, z5);
/* 976 */                                                                   i1O0O0O i1o0o0o2 = new i1O0O0O(str7, null, parcelFileDescriptor, 2);
/* 979 */                                                                   o11ii01loo.I00iOIl = str7;
/* 981 */                                                                   o11ii01loo.I00iiI = str9;
/* 983 */                                                                   o11ii01loo.I00l0I0l0lO1 = null;
/* 985 */                                                                   o11ii01loo.I00iiO = null;
/* 987 */                                                                   o11ii01loo.I00l0OO0IO = null;
/* 991 */                                                                   o11ii01loo.I00ioIO = 9;
/* 993 */                                                                   Object objI00Ol00 = i1O01I1oi00l.I00Ol00(i1o01i1oi00l, i1o0ll11o0ll, i1o0o0o2, streamingCallback2, o11ii01loo);
/* 997 */                                                                   if (objI00Ol00 != ii0111o) {
/* 1001 */                                                                      return objI00Ol00;
                                                                            }
                                                                        } else {
/* 1014 */                                                                  StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 33);
/* 1019 */                                                                  sb2.append(str14);
/* 1022 */                                                                  sb2.append(str7);
/* 1029 */                                                                  Log.w(str3, sb2.toString());
/* 1032 */                                                                  str10 = str7;
                                                                            i1ilio0i09 = i1ilio0i07;
/* 1033 */                                                                  i2 = 1;
                                                                            i1ilio0i08 = i1ilio0i09;
/* 1047 */                                                                  if (i2 != 0) {
/* 1117 */                                                                      return null;
                                                                            }
/* 1049 */                                                                  Context contextI0010I0i5 = l1I0oI.I0010I0i();
/* 1054 */                                                                  o11ii01loo.I00iOIl = null;
/* 1056 */                                                                  o11ii01loo.I00iiI = null;
/* 1058 */                                                                  o11ii01loo.I00l0I0l0lO1 = null;
/* 1060 */                                                                  o11ii01loo.I00iiO = null;
/* 1062 */                                                                  o11ii01loo.I00l0OO0IO = null;
/* 1064 */                                                                  o11ii01loo.I00li1OI = null;
/* 1068 */                                                                  o11ii01loo.I00ioIO = 10;
/* 1070 */                                                                  objI00000oIO2 = i1Ilio0i0.I00000oIO(i1ilio0i08, contextI0010I0i5, str10, str9, o11ii01loo);
                                                                            i1ilio0i011 = i1ilio0i08;
/* 1074 */                                                                  if (objI00000oIO2 != ii0111o) {
/* 1076 */                                                                      i1ii1oooii07 = (i1Ii1ooOII0) objI00000oIO2;
/* 1078 */                                                                      if (i1ii1oooii07 != null) {
/* 1117 */                                                                          return null;
                                                                                }
/* 1080 */                                                                      Context contextI0010I0i6 = l1I0oI.I0010I0i();
/* 1086 */                                                                      o11ii01loo.I00ioIO = 11;
/* 1088 */                                                                      IOiOol0 iOiOol02 = i1ilio0i011.I00000oIO;
/* 1106 */                                                                      objI00000oIO2 = iOi1II01i0.I0000oI00(((IIOlO1ii) iOiOol02.I00ioIO).I00iiI, new i00Iooii0i(iOiOol02, (IOoil1iiIilo) null, contextI0010I0i6, i1ii1oooii07.zza()), o11ii01loo);
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
/* 1045 */                                                  str10 = str7;
/* 1046 */                                                  i2 = i;
                                                            i1ilio0i08 = i1ilio0i03;
/* 1047 */                                                  if (i2 != 0) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
/* 870 */                               i1ilio0i03 = i1ilio0i019;
/* 9 */                                 str8 = "Failed to open cache for prefix: ";
/* 41 */                                str3 = "GenerativeModel";
/* 874 */                               i = 0;
/* 875 */                               generateContentRequest2 = generateContentRequest4;
/* 876 */                               streamingCallback2 = streamingCallback4;
/* 877 */                               i1ii1oooii03 = i1ii1oooii08;
                                        z4 = z9;
/* 878 */                               if (i1ii1oooii03 != null) {
                                        }
                                    }
                                }
/* 1119 */                      return ii0111o;
                            case 1:
/* 333 */                       boolean z15 = o11ii01loo.I00iio;
/* 335 */                       o0IOli0o04 = o11ii01loo.I00iiO;
/* 337 */                       str15 = o11ii01loo.I00l0I0l0lO1;
/* 341 */                       streamingCallback3 = (StreamingCallback) o11ii01loo.I00iiI;
/* 345 */                       GenerateContentRequest generateContentRequest7 = (GenerateContentRequest) o11ii01loo.I00iOIl;
/* 347 */                       lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 350 */                       objI001l0I00 = objI00000oIO2;
/* 351 */                       generateContentRequest3 = generateContentRequest7;
                                z8 = z15;
/* 404 */                       str9 = (String) objI001l0I00;
/* 406 */                       Context contextI0010I0i7 = l1I0oI.I0010I0i();
/* 410 */                       o11ii01loo.I00iOIl = generateContentRequest3;
/* 412 */                       o11ii01loo.I00iiI = streamingCallback3;
/* 414 */                       o11ii01loo.I00l0I0l0lO1 = str15;
/* 416 */                       o11ii01loo.I00iiO = o0IOli0o04;
/* 418 */                       o11ii01loo.I00l0OO0IO = str9;
/* 420 */                       o11ii01loo.I00iio = z8;
/* 423 */                       o11ii01loo.I00ioIO = 2;
/* 425 */                       objI00000oIO = i1Ilio0i0.I00000oIO(i1ilio0i019, contextI0010I0i7, str15, str9, o11ii01loo);
/* 429 */                       if (objI00000oIO != ii0111o) {
                                }
/* 1119 */                      return ii0111o;
                            case 2:
/* 308 */                       boolean z16 = o11ii01loo.I00iio;
/* 310 */                       String str30 = o11ii01loo.I00l0OO0IO;
/* 312 */                       o0IOli0o02 = o11ii01loo.I00iiO;
/* 314 */                       str7 = o11ii01loo.I00l0I0l0lO1;
/* 318 */                       StreamingCallback streamingCallback6 = (StreamingCallback) o11ii01loo.I00iiI;
/* 322 */                       GenerateContentRequest generateContentRequest8 = (GenerateContentRequest) o11ii01loo.I00iOIl;
/* 324 */                       lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 327 */                       generateContentRequest4 = generateContentRequest8;
/* 328 */                       str9 = str30;
/* 329 */                       streamingCallback4 = streamingCallback6;
                                z9 = z16;
/* 444 */                       i1ii1oooii08 = (i1Ii1ooOII0) objI00000oIO2;
/* 446 */                       i4 = 0;
/* 447 */                       if (i1ii1oooii08 != null) {
                                }
                                break;
                            case 3:
/* 276 */                       int i6 = o11ii01loo.I00ilI0I1;
/* 278 */                       boolean z17 = o11ii01loo.I00iio;
/* 280 */                       i1Ii1ooOII0 i1ii1oooii014 = o11ii01loo.I00li1OI;
/* 282 */                       str16 = o11ii01loo.I00l0OO0IO;
/* 284 */                       o0IOli0o05 = o11ii01loo.I00iiO;
/* 286 */                       str5 = o11ii01loo.I00l0I0l0lO1;
/* 290 */                       streamingCallback2 = (StreamingCallback) o11ii01loo.I00iiI;
/* 294 */                       GenerateContentRequest generateContentRequest9 = (GenerateContentRequest) o11ii01loo.I00iOIl;
/* 296 */                       lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 301 */                       i4 = i6;
/* 302 */                       z10 = z17;
/* 303 */                       i1ii1oooii09 = i1ii1oooii014;
/* 304 */                       generateContentRequest5 = generateContentRequest9;
/* 494 */                       if (((Boolean) objI00000oIO2).booleanValue()) {
                                }
                                break;
                            case 4:
/* 223 */                       int i7 = o11ii01loo.I00ilI0I1;
/* 225 */                       boolean z18 = o11ii01loo.I00iio;
/* 227 */                       i1Ii1ooOII0 i1ii1oooii015 = o11ii01loo.I00li1OI;
/* 229 */                       String str31 = o11ii01loo.I00l0OO0IO;
/* 231 */                       O0IOli0o0 o0IOli0o07 = o11ii01loo.I00iiO;
/* 233 */                       String str32 = o11ii01loo.I00l0I0l0lO1;
/* 237 */                       StreamingCallback streamingCallback7 = (StreamingCallback) o11ii01loo.I00iiI;
/* 241 */                       generateContentRequest6 = (GenerateContentRequest) o11ii01loo.I00iOIl;
                                try {
/* 243 */                           lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 248 */                           i4 = i7;
/* 249 */                           z12 = z18;
/* 250 */                           str6 = str31;
/* 251 */                           str5 = str32;
/* 255 */                           streamingCallback2 = streamingCallback7;
/* 256 */                           i1ii1oooii011 = i1ii1oooii015;
/* 257 */                           o0IOli0o05 = o0IOli0o07;
/* 608 */                           parcelFileDescriptor2 = (ParcelFileDescriptor) objI00000oIO2;
/* 610 */                           if (parcelFileDescriptor2 == null) {
                                    }
                                } catch (GenAiException e15) {
/* 261 */                           e = e15;
/* 263 */                           streamingCallback2 = streamingCallback7;
/* 264 */                           i1ii1oooii011 = i1ii1oooii015;
/* 265 */                           o0IOli0o05 = o0IOli0o07;
/* 266 */                           i1ilio0i015 = i1ilio0i019;
/* 9 */                             str21 = "Failed to open cache for prefix: ";
/* 269 */                           z12 = z18;
/* 41 */                            str3 = "GenerativeModel";
/* 271 */                           str6 = str31;
/* 272 */                           str5 = str32;
/* 273 */                           generateContentRequest2 = generateContentRequest6;
                                    i1ilio0i0 = i1ilio0i015;
                                    z3 = z12;
                                    i1ii1oooii02 = i1ii1oooii011;
                                    str2 = str21;
/* 851 */                           Log.w(str3, "Failed to create cache for prefix: ".concat(String.valueOf(str5)), e);
                                    i1ilio0i02 = i1ilio0i0;
                                    z2 = z3;
                                    i1ii1oooii0 = i1ii1oooii02;
                                    str4 = str2;
/* 791 */                           str7 = str5;
/* 792 */                           i = 1;
                                    i1ilio0i05 = i1ilio0i02;
                                    z7 = z2;
                                    i1ii1oooii06 = i1ii1oooii0;
                                    str12 = str4;
/* 711 */                           str9 = str6;
                                    i1ilio0i04 = i1ilio0i05;
                                    z6 = z7;
                                    i1ii1oooii05 = i1ii1oooii06;
                                    str11 = str12;
/* 712 */                           o0IOli0o02 = o0IOli0o05;
                                    i1ilio0i03 = i1ilio0i04;
                                    z4 = z6;
                                    i1ii1oooii03 = i1ii1oooii05;
                                    str8 = str11;
/* 878 */                           if (i1ii1oooii03 != null) {
                                    }
                                }
                                break;
                            case 5:
/* 192 */                       i = o11ii01loo.I00ilI0I1;
/* 194 */                       boolean z19 = o11ii01loo.I00iio;
/* 196 */                       i1Ii1ooOII0 i1ii1oooii016 = o11ii01loo.I00li1OI;
/* 198 */                       str6 = o11ii01loo.I00l0OO0IO;
/* 200 */                       o0IOli0o05 = o11ii01loo.I00iiO;
/* 202 */                       str5 = o11ii01loo.I00l0I0l0lO1;
/* 206 */                       streamingCallback2 = (StreamingCallback) o11ii01loo.I00iiI;
/* 210 */                       generateContentRequest2 = (GenerateContentRequest) o11ii01loo.I00iOIl;
/* 212 */                       lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 215 */                       i1ilio0i017 = i1ilio0i019;
/* 9 */                         str23 = "Failed to open cache for prefix: ";
/* 41 */                        str20 = "GenerativeModel";
                                z13 = z19;
                                i1ii1oooii012 = i1ii1oooii016;
/* 674 */                       Context contextI0010I0i32 = l1I0oI.I0010I0i();
/* 678 */                       o11ii01loo.I00iOIl = generateContentRequest2;
/* 680 */                       o11ii01loo.I00iiI = streamingCallback2;
/* 682 */                       o11ii01loo.I00l0I0l0lO1 = str5;
/* 684 */                       o11ii01loo.I00iiO = o0IOli0o05;
/* 686 */                       o11ii01loo.I00l0OO0IO = str6;
/* 688 */                       o11ii01loo.I00li1OI = i1ii1oooii012;
/* 690 */                       o11ii01loo.I00iio = z13;
/* 692 */                       o11ii01loo.I00ilI0I1 = i;
/* 695 */                       o11ii01loo.I00ioIO = 6;
/* 697 */                       i1ilio0i018 = i1ilio0i017;
/* 699 */                       objI00000oIO2 = i1Ilio0i0.I00000oIO(i1ilio0i018, contextI0010I0i32, str5, str6, o11ii01loo);
                                i1ilio0i018 = i1ilio0i018;
                                z13 = z13;
                                i1ii1oooii012 = i1ii1oooii012;
                                str23 = str23;
                                break;
                            case 6:
/* 155 */                       i = o11ii01loo.I00ilI0I1;
/* 157 */                       boolean z20 = o11ii01loo.I00iio;
/* 159 */                       i1Ii1ooOII0 i1ii1oooii017 = o11ii01loo.I00li1OI;
/* 161 */                       str6 = o11ii01loo.I00l0OO0IO;
/* 163 */                       o0IOli0o05 = o11ii01loo.I00iiO;
/* 165 */                       str5 = o11ii01loo.I00l0I0l0lO1;
/* 169 */                       streamingCallback2 = (StreamingCallback) o11ii01loo.I00iiI;
/* 173 */                       generateContentRequest2 = (GenerateContentRequest) o11ii01loo.I00iOIl;
/* 175 */                       lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 178 */                       i1ilio0i018 = i1ilio0i019;
/* 9 */                         str23 = "Failed to open cache for prefix: ";
/* 41 */                        str20 = "GenerativeModel";
                                z13 = z20;
                                i1ii1oooii012 = i1ii1oooii017;
/* 705 */                       i1ii1oooii06 = (i1Ii1ooOII0) objI00000oIO2;
/* 708 */                       str7 = str5;
/* 709 */                       str3 = str20;
                                i1ilio0i05 = i1ilio0i018;
                                z7 = z13;
                                str12 = str23;
/* 711 */                       str9 = str6;
                                i1ilio0i04 = i1ilio0i05;
                                z6 = z7;
                                i1ii1oooii05 = i1ii1oooii06;
                                str11 = str12;
/* 712 */                       o0IOli0o02 = o0IOli0o05;
                                i1ilio0i03 = i1ilio0i04;
                                z4 = z6;
                                i1ii1oooii03 = i1ii1oooii05;
                                str8 = str11;
/* 878 */                       if (i1ii1oooii03 != null) {
                                }
                                break;
                            case 7:
/* 117 */                       int i8 = o11ii01loo.I00ilI0I1;
/* 119 */                       boolean z21 = o11ii01loo.I00iio;
/* 121 */                       i1Ii1ooOII0 i1ii1oooii018 = o11ii01loo.I00li1OI;
/* 123 */                       str9 = o11ii01loo.I00l0OO0IO;
/* 125 */                       O0IOli0o0 o0IOli0o08 = o11ii01loo.I00iiO;
/* 127 */                       String str33 = o11ii01loo.I00l0I0l0lO1;
/* 131 */                       StreamingCallback streamingCallback8 = (StreamingCallback) o11ii01loo.I00iiI;
/* 135 */                       GenerateContentRequest generateContentRequest10 = (GenerateContentRequest) o11ii01loo.I00iOIl;
/* 137 */                       lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 141 */                       i3 = i8;
/* 142 */                       z5 = z21;
/* 9 */                         str13 = "Failed to open cache for prefix: ";
/* 145 */                       str7 = str33;
/* 146 */                       o1i0i0o = r1;
/* 147 */                       i1ilio0i06 = i1ilio0i019;
/* 148 */                       generateContentRequest2 = generateContentRequest10;
/* 41 */                        str3 = "GenerativeModel";
/* 150 */                       i1ii1oooii04 = i1ii1oooii018;
/* 151 */                       o0IOli0o03 = o0IOli0o08;
/* 152 */                       streamingCallback2 = streamingCallback8;
/* 923 */                       if (((Boolean) objI00000oIO2).booleanValue()) {
                                }
                                break;
                            case 8:
/* 82 */                        z5 = o11ii01loo.I00iio;
/* 84 */                        String str34 = o11ii01loo.I00l0OO0IO;
/* 86 */                        o0IOli0o03 = o11ii01loo.I00iiO;
/* 88 */                        String str35 = o11ii01loo.I00l0I0l0lO1;
/* 92 */                        streamingCallback2 = (StreamingCallback) o11ii01loo.I00iiI;
/* 96 */                        generateContentRequest2 = (GenerateContentRequest) o11ii01loo.I00iOIl;
                                try {
/* 98 */                            lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 9 */                             str14 = "Failed to open cache for prefix: ";
/* 103 */                           str7 = str35;
/* 104 */                           o1i0i0o = r1;
/* 105 */                           i1ilio0i07 = i1ilio0i019;
/* 106 */                           str9 = str34;
/* 41 */                            str3 = "GenerativeModel";
/* 954 */                           parcelFileDescriptor = (ParcelFileDescriptor) objI00000oIO2;
/* 956 */                           if (parcelFileDescriptor == null) {
                                    }
                                } catch (GenAiException e16) {
/* 110 */                           e = e16;
/* 111 */                           i1ilio0i010 = i1ilio0i019;
/* 41 */                            str3 = "GenerativeModel";
/* 113 */                           str10 = str35;
/* 114 */                           str9 = str34;
/* 1038 */                          Log.w(str3, "Inference failed with prefix cache, retry without cache.", e);
                                    i1ilio0i09 = i1ilio0i010;
/* 1033 */                          i2 = 1;
                                    i1ilio0i08 = i1ilio0i09;
/* 1047 */                          if (i2 != 0) {
                                    }
                                }
                                break;
                            case 9:
/* 66 */                        String str36 = (String) o11ii01loo.I00iiI;
/* 70 */                        str10 = (String) o11ii01loo.I00iOIl;
                                try {
/* 72 */                            lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 75 */                            return objI00000oIO2;
                                } catch (GenAiException e17) {
/* 76 */                            e = e17;
/* 77 */                            str9 = str36;
/* 78 */                            i1ilio0i010 = i1ilio0i019;
/* 41 */                            str3 = "GenerativeModel";
/* 1038 */                          Log.w(str3, "Inference failed with prefix cache, retry without cache.", e);
                                    i1ilio0i09 = i1ilio0i010;
/* 1033 */                          i2 = 1;
                                    i1ilio0i08 = i1ilio0i09;
/* 1047 */                          if (i2 != 0) {
                                    }
                                }
                                break;
                            case 10:
/* 58 */                        lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 61 */                        i1ilio0i011 = i1ilio0i019;
/* 1076 */                      i1ii1oooii07 = (i1Ii1ooOII0) objI00000oIO2;
/* 1078 */                      if (i1ii1oooii07 != null) {
                                }
                                break;
                            case 11:
/* 53 */                        lIoii1l01l0i.I00000oOI(objI00000oIO2);
/* 1114 */                      ((Boolean) objI00000oIO2).getClass();
/* 1117 */                      return null;
                            default:
/* 49 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 43 */                        return null;
                        }
                    } catch (GenAiException e18) {
/* 1123 */              Log.w("GenerativeModel", "Failed to get base model name, falling back to major processor", e18);
/* 1126 */              return null;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000O01llI0(GenerateContentRequest generateContentRequest, StreamingCallback streamingCallback, String str, O0IOli0o0 o0IOli0o0, boolean z, IOoilo iOoilo) throws Throwable {
                    o11iIlIo o11iilio;
                    String str2;
                    GenerateContentRequest generateContentRequest2;
                    O0IOli0o0 o0IOli0o02;
                    StreamingCallback streamingCallback2;
                    boolean z2;
                    o0loO110 o0loo110;
                    o0loO110 o0loo1102;
                    boolean z3;
                    O0IOli0o0 o0IOli0o03;
                    String str3;
                    StreamingCallback streamingCallback3;
                    GenerateContentRequest generateContentRequest3;
                    ParcelFileDescriptor parcelFileDescriptor;
/* 5 */             o0lo1I o0lo1i = this.I000OOo1O;
/* 9 */             if (iOoilo instanceof o11iIlIo) {
/* 12 */                o11iilio = (o11iIlIo) iOoilo;
/* 14 */                int i = o11iilio.I00ilO0;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    o11iilio.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    o11iilio = new o11iIlIo(this, iOoilo);
                        }
                    }
/* 31 */            Object objI00000oIO = o11iilio.I00iio;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = o11iilio.I00ilO0;
/* 41 */            int i3 = 2;
/* 43 */            ParcelFileDescriptor parcelFileDescriptor2 = null;
/* 43 */            Object[] objArr = 0;
/* 44 */            if (i2 == 0) {
/* 110 */               lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 115 */               o11iilio.I00io1l = generateContentRequest;
/* 119 */               o11iilio.I00iOIl = streamingCallback;
/* 121 */               str2 = str;
/* 123 */               o11iilio.I00ioIO = str2;
/* 127 */               o11iilio.I00iiI = o0IOli0o0;
/* 131 */               o11iilio.I00iiO = z;
/* 133 */               o11iilio.I00ilO0 = 1;
/* 137 */               Object objI001l0I00 = iOil1lO10l.I001l0I00(this.I00000oIO, o11iilio);
/* 141 */               if (objI001l0I00 != ii0111o) {
/* 145 */                   generateContentRequest2 = generateContentRequest;
/* 146 */                   objI00000oIO = objI001l0I00;
/* 147 */                   o0IOli0o02 = o0IOli0o0;
/* 148 */                   streamingCallback2 = streamingCallback;
/* 149 */                   z2 = z;
                        }
                    }
/* 46 */            if (i2 != 1) {
/* 48 */                if (i2 != 2) {
/* 50 */                    if (i2 != 3) {
/* 52 */                        if (i2 == 4) {
/* 54 */                            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 57 */                            return objI00000oIO;
                                }
/* 60 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 63 */                        return null;
                            }
/* 65 */                    z3 = o11iilio.I00iiO;
/* 67 */                    o0loo1102 = o11iilio.I00l0I0l0lO1;
/* 69 */                    o0IOli0o03 = o11iilio.I00iiI;
/* 71 */                    str3 = o11iilio.I00ioIO;
/* 73 */                    streamingCallback3 = o11iilio.I00iOIl;
/* 75 */                    generateContentRequest3 = o11iilio.I00io1l;
/* 77 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 240 */                   parcelFileDescriptor = (ParcelFileDescriptor) objI00000oIO;
/* 242 */                   if (parcelFileDescriptor != null) {
/* 298 */                       throw new GenAiException("Failed to open cached context for name: ".concat(String.valueOf(str3)), (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                            }
/* 249 */                   i1O01I1oi00l i1o01i1oi00l = o0IOli0o03 != null ? this.I0000oI00 : this.I0000Il00O;
/* 253 */                   i1O0ll11O0ll i1o0ll11o0ll = new i1O0ll11O0ll(generateContentRequest3, o0IOli0o03, z3);
/* 260 */                   i1O0O0O i1o0o0o = new i1O0O0O(o0loo1102.I0000Il00O, parcelFileDescriptor2, parcelFileDescriptor, i3);
/* 263 */                   o11iilio.I00io1l = null;
/* 265 */                   o11iilio.I00iOIl = null;
/* 267 */                   o11iilio.I00ioIO = null;
/* 269 */                   o11iilio.I00iiI = null;
/* 271 */                   o11iilio.I00l0I0l0lO1 = null;
/* 273 */                   o11iilio.I00ilO0 = 4;
/* 275 */                   Object objI00Ol00 = i1O01I1oi00l.I00Ol00(i1o01i1oi00l, i1o0ll11o0ll, i1o0o0o, streamingCallback3, o11iilio);
                            return objI00Ol00 == ii0111o ? ii0111o : objI00Ol00;
                        }
/* 82 */                z2 = o11iilio.I00iiO;
/* 84 */                o0IOli0o02 = o11iilio.I00iiI;
/* 86 */                str2 = o11iilio.I00ioIO;
/* 88 */                streamingCallback2 = o11iilio.I00iOIl;
/* 90 */                generateContentRequest2 = o11iilio.I00io1l;
/* 92 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 175 */               o0loo110 = (o0loO110) objI00000oIO;
/* 177 */               if (o0loo110 != null) {
/* 314 */                   throw new GenAiException("Cached context not found for name: ".concat(String.valueOf(str2)), (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                        }
/* 179 */               Context contextI0010I0i = l1I0oI.I0010I0i();
/* 183 */               o11iilio.I00io1l = generateContentRequest2;
/* 185 */               o11iilio.I00iOIl = streamingCallback2;
/* 187 */               o11iilio.I00ioIO = str2;
/* 189 */               o11iilio.I00iiI = o0IOli0o02;
/* 191 */               o11iilio.I00l0I0l0lO1 = o0loo110;
/* 193 */               o11iilio.I00iiO = z2;
/* 195 */               o11iilio.I00ilO0 = 3;
/* 197 */               IOiOol0 iOiOol0 = o0lo1i.I00000oIO;
/* 226 */               Object objI0000oI00 = iOi1II01i0.I0000oI00(((IIOlO1ii) iOiOol0.I00ioIO).I00iiI, new O1o1iI((Object) o0loo110, iOiOol0, contextI0010I0i, (IOoil1iiIilo) (objArr == true ? 1 : 0), 25), o11iilio);
/* 230 */               if (objI0000oI00 != ii0111o) {
/* 232 */                   boolean z4 = z2;
/* 233 */                   o0loo1102 = o0loo110;
/* 234 */                   objI00000oIO = objI0000oI00;
/* 235 */                   z3 = z4;
/* 236 */                   o0IOli0o03 = o0IOli0o02;
/* 237 */                   str3 = str2;
/* 238 */                   streamingCallback3 = streamingCallback2;
/* 239 */                   generateContentRequest3 = generateContentRequest2;
/* 240 */                   parcelFileDescriptor = (ParcelFileDescriptor) objI00000oIO;
/* 242 */                   if (parcelFileDescriptor != null) {
                            }
                        }
                    }
/* 96 */            z2 = o11iilio.I00iiO;
/* 98 */            o0IOli0o02 = o11iilio.I00iiI;
/* 100 */           str2 = o11iilio.I00ioIO;
/* 102 */           streamingCallback2 = o11iilio.I00iOIl;
/* 104 */           generateContentRequest2 = o11iilio.I00io1l;
/* 106 */           lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 153 */           Context contextI0010I0i2 = l1I0oI.I0010I0i();
/* 157 */           o11iilio.I00io1l = generateContentRequest2;
/* 159 */           o11iilio.I00iOIl = streamingCallback2;
/* 161 */           o11iilio.I00ioIO = str2;
/* 163 */           o11iilio.I00iiI = o0IOli0o02;
/* 165 */           o11iilio.I00iiO = z2;
/* 167 */           o11iilio.I00ilO0 = 2;
/* 169 */           objI00000oIO = o0lo1I.I00000oIO(o0lo1i, contextI0010I0i2, str2, (String) objI00000oIO, o11iilio);
/* 173 */           if (objI00000oIO != ii0111o) {
/* 175 */               o0loo110 = (o0loO110) objI00000oIO;
/* 177 */               if (o0loo110 != null) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000OOo1O(IOoilo iOoilo) throws Throwable {
                    o1101o1oo0 o1101o1oo0Var;
/* 3 */             if (iOoilo instanceof o1101o1oo0) {
/* 6 */                 o1101o1oo0Var = (o1101o1oo0) iOoilo;
/* 8 */                 int i = o1101o1oo0Var.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o1101o1oo0Var.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o1101o1oo0Var = new o1101o1oo0(this, iOoilo);
                        }
                    }
/* 25 */            Object num = o1101o1oo0Var.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o1101o1oo0Var.I00iiO;
/* 33 */            if (i2 == 0) {
/* 48 */                lIoii1l01l0i.I00000oOI(num);
/* 51 */                o1101o1oo0Var.I00iiO = 1;
/* 53 */                o0OO0i o0oo0i = this.I00000oOI;
/* 78 */                num = O0000Ioio00.I0000O(this.I000O01llI0.I0000Il00O.get(o0oo0i), Boolean.TRUE) ? new Integer(0) : o0OO0i.I00OOll1(o0oo0i, o1101o1oo0Var);
/* 83 */                if (num == ii0111o) {
/* 168 */                   return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 46 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(num);
                    }
/* 95 */            return Boolean.valueOf(((Number) num).intValue() == 3);
                }

                @Override
                public final Object checkStatus(IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             return o0oi0ioiO.I00000oIO(this.I000O01llI0, iOoil1iiIilo);
                }

                @Override
                public final Object clearImplicitCaches(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             i1Ilio0i0 i1ilio0i0 = this.I000OiO;
/* 3 */             Context contextI0010I0i = l1I0oI.I0010I0i();
/* 7 */             IOiOol0 iOiOol0 = i1ilio0i0.I00000oIO;
/* 22 */            Object objI0000oI00 = iOi1II01i0.I0000oI00(((IIOlO1ii) iOiOol0.I00ioIO).I00iiI, new o0OOoOO1i(iOiOol0, contextI0010I0i, null, 0), iOoil1iiIilo);
/* 26 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 28 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 30 */            if (objI0000oI00 != ii0111o) {
/* 33 */                objI0000oI00 = ooiIlOl1iI;
                    }
/* 34 */            if (objI0000oI00 != ii0111o) {
/* 37 */                objI0000oI00 = ooiIlOl1iI;
                    }
                    return objI0000oI00 == ii0111o ? objI0000oI00 : ooiIlOl1iI;
                }

                @Override
                public final void close() {
/* 3 */             this.I00000oOI.close();
/* 8 */             this.I0000Il00O.close();
/* 13 */            this.I00000oIO.close();
/* 18 */            this.I0000O.close();
/* 23 */            this.I0000oI00.close();
                }

                @Override
                public final Object countTokens(GenerateTypedContentRequest generateTypedContentRequest, IOoil1iiIilo iOoil1iiIilo) {
                    GenerateContentRequest zza;
/* 5 */             if (generateTypedContentRequest.getZzc()) {
/* 15 */                l0i0Ol1 l0i0ol1I00000oIO = o0ol0Oo.I00000oIO(generateTypedContentRequest.getZzb()).I00000oIO();
/* 19 */                zza = generateTypedContentRequest.getZza();
/* 27 */                Iterator<Content> it = zza.getContents().iterator();
/* 31 */                Object obj = null;
/* 36 */                while (it.hasNext()) {
/* 56 */                    for (Object obj2 : it.next().getParts()) {
/* 66 */                        if (obj2 instanceof TextPart) {
/* 68 */                            obj = obj2;
                                }
                            }
                        }
/* 70 */                if (obj != null) {
/* 97 */                    TextPart textPart = new TextPart(String.valueOf(((TextPart) obj).getTextString()).concat(o10Oi10i0io.I00000oIO("", l0i0ol1I00000oIO)));
/* 100 */                   List<Content> contents = zza.getContents();
/* 114 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(contents, 10));
/* 117 */                   Iterator<T> it2 = contents.iterator();
/* 125 */                   while (it2.hasNext()) {
/* 133 */                       List<Part> parts = ((Content) it2.next()).getParts();
/* 145 */                       ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(parts, 10));
/* 156 */                       for (Part part : parts) {
/* 164 */                           if (part == obj) {
/* 166 */                               part = textPart;
                                    }
/* 167 */                           arrayList2.add(part);
                                }
/* 173 */                       Content.Builder builder = Content.INSTANCE.builder();
/* 184 */                       Part[] partArr = (Part[]) arrayList2.toArray(new Part[0]);
/* 193 */                       builder.parts((Part[]) Arrays.copyOf(partArr, partArr.length));
/* 200 */                       arrayList.add(builder.build());
                            }
/* 206 */                   GenerateContentRequest.Builder builder2 = new GenerateContentRequest.Builder(arrayList);
/* 217 */                   builder2.setTemperature(Float.valueOf(zza.getZza()));
/* 228 */                   builder2.setSeed(Integer.valueOf(zza.getZzb()));
/* 239 */                   builder2.setTopK(Integer.valueOf(zza.getZzc()));
/* 250 */                   builder2.setCandidateCount(Integer.valueOf(zza.getZzd()));
/* 261 */                   builder2.setMaxOutputTokens(Integer.valueOf(zza.getZze()));
/* 268 */                   builder2.setPromptPrefix(zza.getZzg());
/* 275 */                   builder2.setCachedContextName(zza.getZzh());
/* 282 */                   builder2.setSystemInstruction(zza.getZzi());
/* 289 */                   builder2.setEnableThinking(zza.getZzj());
/* 292 */                   zza = builder2.build();
                        }
                    } else {
/* 297 */               zza = generateTypedContentRequest.getZza();
                    }
/* 309 */           return I0000oI00(zza, generateTypedContentRequest.getZzb(), generateTypedContentRequest.getZzc(), iOoil1iiIilo);
                }

                @Override
                public final IlOil1ii download() {
/* 27 */            return ilOl0O00Il0i.I00000oIO(new i00Iooii0i(this.I000II, new IliI1Ii1II(2, this.I000O01llI0, o0oi0ioiO.class, "downloadFeatures", "downloadFeatures(Lcom/google/mlkit/genai/common/DownloadCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10), (IOoil1iiIilo) null, 4));
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object generateContent(GenerateTypedContentRequest generateTypedContentRequest, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o11OIIoOIiI o11oiiooiii;
                    GenerateTypedContentRequest generateTypedContentRequest2;
                    GenerateTypedContentRequest generateTypedContentRequest3;
                    Integer zzb;
                    int i;
/* 7 */             if (iOoil1iiIilo instanceof o11OIIoOIiI) {
/* 10 */                o11oiiooiii = (o11OIIoOIiI) iOoil1iiIilo;
/* 12 */                int i2 = o11oiiooiii.I00iiO;
/* 18 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 21 */                    o11oiiooiii.I00iiO = i2 - Integer.MIN_VALUE;
                        } else {
/* 27 */                    o11oiiooiii = new o11OIIoOIiI(this, iOoil1iiIilo);
                        }
                    }
/* 23 */            o11OIIoOIiI o11oiiooiii2 = o11oiiooiii;
/* 31 */            Object objI0001Ioi1lo = o11oiiooiii2.I00iOIl;
/* 33 */            Object obj = Ii0111o.I00iOIl;
/* 35 */            int i3 = o11oiiooiii2.I00iiO;
/* 40 */            if (i3 == 0) {
/* 65 */                lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 70 */                o11oiiooiii2.I00iio = generateTypedContentRequest;
/* 72 */                o11oiiooiii2.I00iiO = 1;
/* 74 */                Object objI00000oOI = I00000oOI(o11oiiooiii2);
/* 78 */                if (objI00000oOI != obj) {
/* 80 */                    generateTypedContentRequest2 = generateTypedContentRequest;
/* 81 */                    objI0001Ioi1lo = objI00000oOI;
                        }
/* 900 */               return obj;
                    }
/* 42 */            if (i3 != 1) {
/* 44 */                if (i3 != 2) {
/* 54 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                    return null;
                        }
/* 46 */                generateTypedContentRequest3 = o11oiiooiii2.I00iio;
/* 48 */                lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 119 */               I1ii1o0 i1ii1o0 = i1O11ii1.I00000oIO;
/* 121 */               O0IOli0o0 zzb2 = generateTypedContentRequest3.getZzb();
/* 125 */               List<Candidate> candidates = ((GenerateContentResponse) objI0001Ioi1lo).getCandidates();
/* 139 */               ArrayList arrayList = new ArrayList(IOOi1I.I0000O(candidates, 10));
/* 150 */               for (Candidate candidate : candidates) {
/* 158 */                   I1ii1o0 i1ii1o02 = i1O11ii1.I00000oIO;
/* 160 */                   String zza = candidate.getZza();
/* 164 */                   Integer zzb3 = candidate.getZzb();
/* 172 */                   int i4 = GenAiException.ErrorCode.STRUCTURED_OUTPUT_RESPONSE_ERROR;
/* 184 */                   int i5 = (zzb3 != null && zzb3.intValue() == 1) ? GenAiException.ErrorCode.STRUCTURED_OUTPUT_MAX_TOKENS_ERROR : -105;
                            try {
/* 186 */                       I1ii1o0 i1ii1o03 = i1O11ii1.I00000oIO;
/* 199 */                       llII0l1O1l1 llii0l1o1l1 = (llII0l1O1l1) i1ii1o03.I00O0o1oo(zza, new o0IOi0io1iOo(llII0l1O1l1.class));
/* 203 */                       if (llii0l1o1l1 == null) {
/* 649 */                           Log.e("TypedResponseHelper", "Response element is null.");
/* 675 */                           StringBuilder sb = new StringBuilder(String.valueOf(zzb3).length() + 52 + String.valueOf(zza).length());
/* 680 */                           sb.append("Response element is null. FinishReason: ");
/* 683 */                           sb.append(zzb3);
/* 686 */                           sb.append(". Response: ");
/* 689 */                           sb.append(zza);
/* 699 */                           throw new GenAiException(sb.toString(), (Throwable) null, i5);
                                }
/* 207 */                       if (!(llii0l1o1l1 instanceof llIiii10)) {
/* 596 */                           Log.e("TypedResponseHelper", "Response is not a JSON object");
/* 622 */                           StringBuilder sb2 = new StringBuilder(String.valueOf(zzb3).length() + 57 + String.valueOf(zza).length());
/* 627 */                           sb2.append("Response is not a JSON object. FinishReason: ");
/* 630 */                           sb2.append(zzb3);
/* 633 */                           sb2.append(". Response: ");
/* 636 */                           sb2.append(zza);
/* 646 */                           throw new GenAiException(sb2.toString(), (Throwable) null, i5);
                                }
/* 216 */                       if (!i1O11ii1.I00000oIO(llii0l1o1l1, zzb2, false, null)) {
/* 494 */                           String strI000oI1ioi = zzb2.I000oI1ioi();
/* 510 */                           StringBuilder sb3 = new StringBuilder(String.valueOf(strI000oI1ioi).length() + 45);
/* 515 */                           sb3.append("JSON structure does not match expected type ");
/* 518 */                           sb3.append(strI000oI1ioi);
/* 523 */                           sb3.append(".");
/* 530 */                           Log.e("TypedResponseHelper", sb3.toString());
/* 535 */                           String strI000oI1ioi2 = zzb2.I000oI1ioi();
/* 571 */                           StringBuilder sb4 = new StringBuilder(String.valueOf(zzb3).length() + String.valueOf(strI000oI1ioi2).length() + 60 + 12 + String.valueOf(zza).length());
/* 574 */                           sb4.append("JSON structure does not match expected type ");
/* 577 */                           sb4.append(strI000oI1ioi2);
/* 580 */                           sb4.append(". FinishReason: ");
/* 583 */                           sb4.append(zzb3);
/* 593 */                           throw new GenAiException(IIl001iO0Io.I00100l0(sb4, ". Response: ", zza), (Throwable) null, i5);
                                }
/* 218 */                       Integer zzb4 = candidate.getZzb();
/* 222 */                       if (zzb4 != null && zzb4.intValue() == 1) {
/* 231 */                           i4 = GenAiException.ErrorCode.STRUCTURED_OUTPUT_MAX_TOKENS_ERROR;
                                }
                                try {
/* 245 */                           Object objI00O0o1oo = i1ii1o03.I00O0o1oo(zza, new o0IOi0io1iOo(((IOIO10iOi1) zzb2).I001l0I00()));
/* 249 */                           Integer zzb5 = candidate.getZzb();
/* 253 */                           if (((zzb5 != null && zzb5.intValue() == 0) || ((zzb = candidate.getZzb()) != null && zzb.intValue() == 1)) && objI00O0o1oo == null) {
/* 320 */                               String strI000oI1ioi3 = zzb2.I000oI1ioi();
/* 324 */                               Integer zzb6 = candidate.getZzb();
/* 360 */                               StringBuilder sb5 = new StringBuilder(String.valueOf(zzb6).length() + String.valueOf(strI000oI1ioi3).length() + 48 + 12 + String.valueOf(zza).length());
/* 365 */                               sb5.append("Deserialized object is null for ");
/* 368 */                               sb5.append(strI000oI1ioi3);
/* 371 */                               sb5.append(". FinishReason: ");
/* 374 */                               sb5.append(zzb6);
/* 384 */                               throw new GenAiException(IIl001iO0Io.I00100l0(sb5, ", Response: ", zza), (Throwable) null, i4);
                                    }
/* 277 */                           Integer zzb7 = candidate.getZzb();
/* 281 */                           if (zzb7 != null && zzb7.intValue() == 0) {
/* 290 */                               i = 0;
                                    } else {
/* 292 */                               i = -100;
/* 294 */                               if (zzb7 != null && zzb7.intValue() == 1) {
/* 303 */                                   i = 1;
                                        }
                                    }
/* 313 */                           arrayList.add(new TypedCandidate(objI00O0o1oo, Integer.valueOf(i), null));
                                } catch (Exception e) {
/* 386 */                           String strI000oI1ioi4 = zzb2.I000oI1ioi();
/* 390 */                           String message = e.getMessage();
/* 426 */                           Log.e("TypedResponseHelper", IIl001iO0Io.I00100o1O0lo(new StringBuilder(String.valueOf(strI000oI1ioi4).length() + 32 + String.valueOf(message).length()), "Failed to deserialize JSON to ", strI000oI1ioi4, ": ", message));
/* 431 */                           String strI000oI1ioi5 = zzb2.I000oI1ioi();
/* 435 */                           Integer zzb8 = candidate.getZzb();
/* 471 */                           StringBuilder sb6 = new StringBuilder(String.valueOf(zzb8).length() + String.valueOf(strI000oI1ioi5).length() + 46 + 12 + String.valueOf(zza).length());
/* 474 */                           sb6.append("Failed to deserialize JSON to ");
/* 477 */                           sb6.append(strI000oI1ioi5);
/* 480 */                           sb6.append(". FinishReason: ");
/* 483 */                           sb6.append(zzb8);
/* 493 */                           throw new GenAiException(IIl001iO0Io.I00100l0(sb6, ", Response: ", zza), e, i4);
                                }
                            } catch (llO11IolIO e2) {
/* 724 */                       StringBuilder sb7 = new StringBuilder(String.valueOf(zzb3).length() + 55 + String.valueOf(zza).length());
/* 729 */                       sb7.append("Failed to parse JSON syntax. FinishReason: ");
/* 732 */                       sb7.append(zzb3);
/* 735 */                       sb7.append(". Response: ");
/* 738 */                       sb7.append(zza);
/* 748 */                       throw new GenAiException(sb7.toString(), e2, i5);
                            }
                        }
/* 751 */               return new GenerateTypedContentResponse(arrayList, null);
                    }
/* 58 */            GenerateTypedContentRequest generateTypedContentRequest4 = o11oiiooiii2.I00iio;
/* 60 */            lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 63 */            generateTypedContentRequest2 = generateTypedContentRequest4;
/* 88 */            if (!((Boolean) objI0001Ioi1lo).booleanValue()) {
/* 764 */               throw new GenAiException("Structured output feature is not available.", (Throwable) null, GenAiException.ErrorCode.STRUCTURED_OUTPUT_REQUEST_ERROR);
                    }
/* 90 */            GenerateContentRequest zza2 = generateTypedContentRequest2.getZza();
/* 94 */            O0IOli0o0 zzb9 = generateTypedContentRequest2.getZzb();
/* 98 */            boolean zzc = generateTypedContentRequest2.getZzc();
/* 102 */           o11oiiooiii2.I00iio = generateTypedContentRequest2;
/* 104 */           o11oiiooiii2.I00iiO = 2;
/* 108 */           objI0001Ioi1lo = I0001Ioi1lo(zza2, null, zzb9, zzc, o11oiiooiii2);
/* 112 */           if (objI0001Ioi1lo != obj) {
/* 116 */               generateTypedContentRequest3 = generateTypedContentRequest2;
/* 119 */               I1ii1o0 i1ii1o04 = i1O11ii1.I00000oIO;
/* 121 */               O0IOli0o0 zzb22 = generateTypedContentRequest3.getZzb();
/* 125 */               List<Candidate> candidates2 = ((GenerateContentResponse) objI0001Ioi1lo).getCandidates();
/* 139 */               ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(candidates2, 10));
/* 150 */               while (r0.hasNext()) {
                        }
/* 751 */               return new GenerateTypedContentResponse(arrayList2, null);
                    }
/* 900 */           return obj;
                }

                @Override
                public final IlOil1ii generateContentStream(GenerateContentRequest generateContentRequest) {
/* 21 */            return ilOl0O00Il0i.I00000oIO(new o10IO0i(generateContentRequest, new o11i11l1oll(3, 0, o1I0I0O.class, this, "generateContentInternal", "generateContentInternal(Lcom/google/mlkit/genai/prompt/GenerateContentRequest;Lcom/google/mlkit/genai/common/StreamingCallback;Lkotlin/reflect/KClass;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"), null));
                }

                @Override
                public final Object getBaseModelName(IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             return iOil1lO10l.I001l0I00(this.I00000oIO, iOoil1iiIilo);
                }

                @Override
                public final Caches getCaches() {
/* 7 */             return (Caches) this.I000iOII.getValue();
                }

                @Override
                public final Object getTokenLimit(IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             return new Integer(8192);
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
                
                    if (r8 != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object isCachingFeatureAvailable(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o11lOIoiI1 o11loioii1;
/* 3 */             if (iOoil1iiIilo instanceof o11lOIoiI1) {
/* 6 */                 o11loioii1 = (o11lOIoiI1) iOoil1iiIilo;
/* 8 */                 int i = o11loioii1.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o11loioii1.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o11loioii1 = new o11lOIoiI1(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object objI00OOll1 = o11loioii1.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o11loioii1.I00iiO;
/* 31 */            boolean z = false;
/* 35 */            if (i2 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(objI00OOll1);
/* 59 */                i1O01I1oi00l i1o01i1oi00l = this.I0000Il00O;
/* 61 */                o11loioii1.I00iiO = 1;
/* 63 */                objI00OOll1 = i1O01I1oi00l.I00OOll1(i1o01i1oi00l, o11loioii1);
/* 67 */                if (objI00OOll1 != ii0111o) {
                        }
/* 168 */               return ii0111o;
                    }
/* 37 */            if (i2 != 1) {
/* 39 */                if (i2 != 2) {
/* 47 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 50 */                    return null;
                        }
/* 41 */                lIoii1l01l0i.I00000oOI(objI00OOll1);
/* 93 */                if (((Number) objI00OOll1).intValue() == 3) {
/* 95 */                    z = true;
                        }
/* 96 */                return Boolean.valueOf(z);
                    }
/* 52 */            lIoii1l01l0i.I00000oOI(objI00OOll1);
/* 75 */            if (((Number) objI00OOll1).intValue() == 3) {
/* 77 */                o0OO0i o0oo0i = this.I00000oOI;
/* 79 */                o11loioii1.I00iiO = 2;
/* 81 */                objI00OOll1 = o0OO0i.I00OOll1(o0oo0i, o11loioii1);
                    }
/* 96 */            return Boolean.valueOf(z);
                }

                @Override
                public final Object isStructuredOutputFeatureAvailable(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             return I00000oOI(iOoil1iiIilo);
                }

                /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
                
                    if (r8 != r1) goto L31;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object isSystemPromptAvailable(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o11loOlOiI o11looloii;
/* 3 */             if (iOoil1iiIilo instanceof o11loOlOiI) {
/* 6 */                 o11looloii = (o11loOlOiI) iOoil1iiIilo;
/* 8 */                 int i = o11looloii.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o11looloii.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o11looloii = new o11loOlOiI(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object objI00000oIO = o11looloii.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o11looloii.I00iiO;
/* 31 */            boolean z = false;
                    try {
                    } catch (Exception e) {
/* 123 */               Log.w("GenerativeModel", "Failed to get model name for capability check", e);
                    }
/* 35 */            if (i2 == 0) {
/* 58 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 61 */                o11looloii.I00iiO = 1;
/* 65 */                objI00000oIO = o0oi0ioiO.I00000oIO(this.I000O01llI0, o11looloii);
/* 69 */                if (objI00000oIO != ii0111o) {
                        }
/* 168 */               return ii0111o;
                    }
/* 37 */            if (i2 != 1) {
/* 39 */                if (i2 != 2) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                    return null;
                        }
/* 41 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 115 */               if (I0000Il00O((String) objI00000oIO) >= 3) {
/* 117 */                   z = true;
                        }
/* 126 */               return Boolean.valueOf(z);
                    }
/* 54 */            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 77 */            if (((Number) objI00000oIO).intValue() != 3) {
/* 79 */                return Boolean.FALSE;
                    }
/* 94 */            if (!GenAiUtils.isSystemPromptSupported(O1o0111OI00.I0000Il00O().I00000oOI())) {
/* 96 */                return Boolean.FALSE;
                    }
/* 99 */            o11looloii.I00iiO = 2;
/* 103 */           objI00000oIO = iOil1lO10l.I001l0I00(this.I00000oIO, o11looloii);
                }

                /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
                
                    if (r7 != r1) goto L31;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object isThinkingModeAvailable(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o11oIlol0I o11oilol0i;
/* 3 */             if (iOoil1iiIilo instanceof o11oIlol0I) {
/* 6 */                 o11oilol0i = (o11oIlol0I) iOoil1iiIilo;
/* 8 */                 int i = o11oilol0i.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o11oilol0i.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o11oilol0i = new o11oIlol0I(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object objI00000oIO = o11oilol0i.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o11oilol0i.I00iiO;
/* 31 */            boolean z = false;
                    try {
                    } catch (Exception e) {
/* 124 */               Log.w("GenerativeModel", "Failed to get model name for capability check", e);
                    }
/* 34 */            if (i2 == 0) {
/* 57 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 60 */                o11oilol0i.I00iiO = 1;
/* 64 */                objI00000oIO = o0oi0ioiO.I00000oIO(this.I000O01llI0, o11oilol0i);
/* 68 */                if (objI00000oIO != ii0111o) {
                        }
/* 168 */               return ii0111o;
                    }
/* 36 */            if (i2 != 1) {
/* 38 */                if (i2 != 2) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 40 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 116 */               if (I0000Il00O((String) objI00000oIO) >= 4) {
/* 118 */                   z = true;
                        }
/* 127 */               return Boolean.valueOf(z);
                    }
/* 53 */            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 77 */            if (((Number) objI00000oIO).intValue() != 3) {
/* 79 */                return Boolean.FALSE;
                    }
/* 94 */            if (!GenAiUtils.isThinkingModeSupported(O1o0111OI00.I0000Il00O().I00000oOI())) {
/* 96 */                return Boolean.FALSE;
                    }
/* 99 */            o11oilol0i.I00iiO = 2;
/* 103 */           objI00000oIO = iOil1lO10l.I001l0I00(this.I00000oIO, o11oilol0i);
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
                
                    if (p000.iOil1lO10l.I00IioO0OiOi(r5, r0) != r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object warmup(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o11oloiiII1O o11oloiiii1o;
/* 3 */             if (iOoil1iiIilo instanceof o11oloiiII1O) {
/* 6 */                 o11oloiiii1o = (o11oloiiII1O) iOoil1iiIilo;
/* 8 */                 int i = o11oloiiii1o.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o11oloiiii1o.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o11oloiiii1o = new o11oloiiII1O(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = o11oloiiii1o.I00iOIl;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = o11oloiiii1o.I00iiO;
/* 33 */            if (i2 == 0) {
/* 54 */                lIoii1l01l0i.I00000oOI(obj);
/* 57 */                o11oloiiii1o.I00iiO = 1;
/* 63 */                if (I0000O(o11oloiiii1o) != obj2) {
                        }
/* 168 */               return obj2;
                    }
/* 35 */            if (i2 != 1) {
/* 37 */                if (i2 == 2) {
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 76 */                    return OoiIlOl1iI.I00000oIO;
                        }
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 48 */                return null;
                    }
/* 50 */            lIoii1l01l0i.I00000oOI(obj);
/* 66 */            i1IoO0OlII i1ioo0olii = this.I00000oIO;
/* 68 */            o11oloiiii1o.I00iiO = 2;
                }

                @Override
                public final ListenableFuture zza(DownloadCallback downloadCallback) {
/* 5 */             OoIOol ooIOol = new OoIOol(18);
/* 8 */             ooIOol.I00iiI = this;
/* 10 */            ooIOol.I00iiO = downloadCallback;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            return iOiiloIII0O.I00000oIO(ooIOol);
                }

                @Override
                public final ListenableFuture zzb() {
/* 3 */             i1IoOl i1iool = new i1IoOl();
/* 6 */             i1iool.I00iOIl = this;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            return iOiiloIII0O.I00000oIO(i1iool);
                }

                @Override
                public final ListenableFuture zzc(GenerateContentRequest generateContentRequest) {
/* 11 */            return l10o1ollO.I00000oOI(this.I000II, new Ol110ii1I(this, generateContentRequest, (IOoil1iiIilo) null, 15));
                }

                @Override
                public final ListenableFuture zzd() {
/* 11 */            return l10o1ollO.I00000oOI(this.I000II, new O1iOlO(this, (IOoil1iiIilo) null, 20));
                }

                @Override
                public final ListenableFuture zze() {
/* 5 */             i0O1lIi1O0IO i0o1lii1o0io = new i0O1lIi1O0IO(14);
/* 8 */             i0o1lii1o0io.I00iiI = this;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            return iOiiloIII0O.I00000oIO(i0o1lii1o0io);
                }

                @Override
                public final ExecutorService zzf() {
/* 1 */             return this.I0001Ioi1lo;
                }

                @Override
/* 313 */       public final Object countTokens(GenerateContentRequest generateContentRequest, IOoil1iiIilo iOoil1iiIilo) {
/* 314 */           return I0000oI00(generateContentRequest, null, true, iOoil1iiIilo);
                }

                @Override
/* 765 */       public final Object generateContent(GenerateContentRequest generateContentRequest, IOoil1iiIilo iOoil1iiIilo) {
/* 766 */           return I0001Ioi1lo(generateContentRequest, null, null, true, iOoil1iiIilo);
                }

                @Override
/* 766 */       public final Object generateContent(GenerateContentRequest generateContentRequest, StreamingCallback streamingCallback, IOoil1iiIilo iOoil1iiIilo) {
/* 767 */           return I0001Ioi1lo(generateContentRequest, streamingCallback, null, true, iOoil1iiIilo);
                }
            }
