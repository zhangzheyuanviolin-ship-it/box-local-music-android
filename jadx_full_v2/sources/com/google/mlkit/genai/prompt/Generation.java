            package com.google.mlkit.genai.prompt;

            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ExecutorService;
            import kotlin.Metadata;
            import p000.IOOi1I;
            import p000.IOiOol0;
            import p000.Il11ooO1o;
            import p000.O0l1iloO;
            import p000.O1o01ii1o;
            import p000.OllO00oiil;
            import p000.i1Ilio0i0;
            import p000.i1IoO0OlII;
            import p000.i1O01I1oi00l;
            import p000.i1O0iloI;
            import p000.iOIio1oOOi1I;
            import p000.iOIl01;
            import p000.iOl0ilO1;
            import p000.il001oo1;
            import p000.iolOOiI;
            import p000.l1I0oI;
            import p000.lOOlOoll;
            import p000.o0O0IIll1OIl;
            import p000.o0OO0i;
            import p000.o0iOli;
            import p000.o0lo1I;
            import p000.o0oi0ioiO;
            import p000.o0oi1IOOoI;
            import p000.o0oloIl1oIo;
            import p000.o1I0I0O;
            
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/google/mlkit/genai/prompt/Generation;", "", "<init>", "()V", "getClient", "Lcom/google/mlkit/genai/prompt/GenerativeModel;", "options", "Lcom/google/mlkit/genai/prompt/GenerationConfig;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 339 */   public final class Generation {
                public static final Generation INSTANCE = new Generation();

                private Generation() {
                }

                public final GenerativeModel getClient(GenerationConfig options) {
/* 7 */             int iI00111O = l1I0oI.I00111O(options, o0oi1IOOoI.I00iOIl);
/* 11 */            ExecutorService zza = options.getZza();
/* 17 */            i1O0iloI i1o0iloi = i1O0iloI.I00iOIl;
/* 22 */            i1IoO0OlII i1ioo0olii = new i1IoO0OlII(zza, iI00111O, new o0oloIl1oIo(i1o0iloi));
/* 29 */            int iI00111O2 = l1I0oI.I00111O(options, o0oi1IOOoI.I00iiI);
/* 33 */            ExecutorService zza2 = options.getZza();
/* 39 */            o0O0IIll1OIl o0o0iill1oil = new o0O0IIll1OIl();
/* 42 */            iOIio1oOOi1I ioiio1oooi1i = iOIio1oOOi1I.GENERATION_MODE_REGENERATIVE;
/* 46 */            iOIl01 ioil01 = new iOIl01();
/* 49 */            ioil01.I00000oIO = ioiio1oooi1i;
/* 51 */            VarHandle.storeStoreFence();
/* 54 */            o0o0iill1oil.I00000oIO = ioil01;
/* 60 */            o0o0iill1oil.I00000oOI = iOl0ilO1.I00000oOI();
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            o0OO0i o0oo0i = new o0OO0i(zza2, iI00111O2, o0o0iill1oil);
/* 73 */            o0oo0i.I00io1l = new ConcurrentHashMap();
/* 80 */            o0oo0i.I00ioIO = new ConcurrentHashMap();
/* 91 */            il001oo1.I00000oIO(new Il11ooO1o(o0oo0i.I00iOIl.I00iOIl));
/* 94 */            VarHandle.storeStoreFence();
/* 101 */           int iI00111O3 = l1I0oI.I00111O(options, o0oi1IOOoI.I00iiO);
/* 105 */           ExecutorService zza3 = options.getZza();
/* 111 */           i1O0iloI i1o0iloi2 = i1O0iloI.I00iiI;
/* 116 */           i1O01I1oi00l i1o01i1oi00l = new i1O01I1oi00l(iI00111O3, zza3, new o0oloIl1oIo(i1o0iloi2));
/* 136 */           i1IoO0OlII i1ioo0olii2 = new i1IoO0OlII(options.getZza(), l1I0oI.I00111O(options, o0oi1IOOoI.I00iio), new o0oloIl1oIo(i1o0iloi));
/* 156 */           i1O01I1oi00l i1o01i1oi00l2 = new i1O01I1oi00l(l1I0oI.I00111O(options, o0oi1IOOoI.I00ilI0I1), options.getZza(), new o0oloIl1oIo(i1o0iloi2));
/* 159 */           o1I0I0O o1i0i0o = new o1I0I0O();
/* 162 */           o1i0i0o.I00000oIO = i1ioo0olii;
/* 164 */           o1i0i0o.I00000oOI = o0oo0i;
/* 166 */           o1i0i0o.I0000Il00O = i1o01i1oi00l;
/* 168 */           o1i0i0o.I0000O = i1ioo0olii2;
/* 170 */           o1i0i0o.I0000oI00 = i1o01i1oi00l2;
/* 172 */           ExecutorService zza4 = options.getZza();
/* 176 */           if (zza4 == null) {
/* 180 */               zza4 = new O1o01ii1o();
                    }
/* 183 */           o1i0i0o.I0001Ioi1lo = zza4;
/* 194 */           o1i0i0o.I000II = il001oo1.I00000oIO(new Il11ooO1o(zza4));
/* 213 */           List listI000O01llI0 = IOOi1I.I000O01llI0(o0oo0i, i1o01i1oi00l, i1ioo0olii2, i1o01i1oi00l2);
/* 217 */           o0oi0ioiO o0oi0ioio = new o0oi0ioiO();
/* 220 */           o0oi0ioio.I00000oIO = i1ioo0olii;
/* 222 */           o0oi0ioio.I00000oOI = listI000O01llI0;
/* 229 */           o0oi0ioio.I0000Il00O = new LinkedHashMap();
/* 231 */           VarHandle.storeStoreFence();
/* 234 */           o1i0i0o.I000O01llI0 = o0oi0ioio;
/* 236 */           iolOOiI iolooii = o0lo1I.I00000oOI;
/* 238 */           o0lo1I o0lo1i = o0lo1I.I0000Il00O;
/* 240 */           if (o0lo1i == null) {
                        synchronized (iolooii) {
/* 243 */                   o0lo1i = o0lo1I.I0000Il00O;
/* 245 */                   if (o0lo1i == null) {
/* 255 */                       IOiOol0 iOiOol0 = new IOiOol0(zza4, ".mlkit_genai_prompt_explicit_prefix_cache", iolOOiI.I00l0OO0IO);
/* 258 */                       o0lo1i = new o0lo1I();
/* 261 */                       o0lo1i.I00000oIO = iOiOol0;
/* 263 */                       VarHandle.storeStoreFence();
/* 266 */                       o0lo1I.I0000Il00O = o0lo1i;
                            }
                        }
                    }
/* 275 */           o1i0i0o.I000OOo1O = o0lo1i;
/* 277 */           lOOlOoll loolooll = i1Ilio0i0.I00000oOI;
/* 279 */           i1Ilio0i0 i1ilio0i0 = i1Ilio0i0.I0000Il00O;
/* 281 */           if (i1ilio0i0 == null) {
                        synchronized (loolooll) {
/* 284 */                   i1ilio0i0 = i1Ilio0i0.I0000Il00O;
/* 286 */                   if (i1ilio0i0 == null) {
/* 296 */                       IOiOol0 iOiOol02 = new IOiOol0(zza4, ".mlkit_prefix_cache", o0iOli.I00ilO0);
/* 299 */                       i1ilio0i0 = new i1Ilio0i0();
/* 302 */                       i1ilio0i0.I00000oIO = iOiOol02;
/* 304 */                       VarHandle.storeStoreFence();
/* 307 */                       i1Ilio0i0.I0000Il00O = i1ilio0i0;
                            }
                        }
                    }
/* 316 */           o1i0i0o.I000OiO = i1ilio0i0;
/* 322 */           O0l1iloO o0l1iloO = new O0l1iloO(13);
/* 325 */           o0l1iloO.I00iiI = o1i0i0o;
/* 327 */           VarHandle.storeStoreFence();
/* 335 */           o1i0i0o.I000iOII = new OllO00oiil(o0l1iloO);
/* 337 */           VarHandle.storeStoreFence();
/* 437 */           return o1i0i0o;
                }

/* 340 */       public final GenerativeModel getClient() {
/* 341 */           return getClient(GenerationConfigKt.generationConfig(zza.zza));
                }
            }
