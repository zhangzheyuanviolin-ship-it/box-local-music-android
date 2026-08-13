            package p000;

            import com.google.mlkit.genai.prompt.Candidate;
            import com.google.mlkit.genai.prompt.Content;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.prompt.GenerateContentResponse;
            import com.google.mlkit.genai.prompt.ImagePart;
            import com.google.mlkit.genai.prompt.Part;
            import com.google.mlkit.genai.prompt.PromptPrefix;
            import com.google.mlkit.genai.prompt.TextPart;
            import java.lang.invoke.VarHandle;
            import java.time.Duration;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class o0oloIl1oIo implements iOi1l1i1O {
                public final i1O0iloI I00000oIO;
                public final iOIl01 I00000oOI;
                public final iOiooiO I0000Il00O;

                public o0oloIl1oIo(i1O0iloI i1o0iloi) {
/* 4 */             this.I00000oIO = i1o0iloi;
/* 8 */             iOIl01 ioil01 = new iOIl01();
/* 13 */            ioil01.I00000oIO = iOIio1oOOi1I.GENERATION_MODE_REGENERATIVE;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            this.I00000oOI = ioil01;
/* 24 */            this.I0000Il00O = iOl0ilO1.I00000oOI();
                }

                public static final iO0O00 I000OiO(i1O0iloI i1o0iloi, o0olIo1 o0olio1, boolean z) {
/* 1 */             i1O0iloI i1o0iloi2 = i1O0iloI.I00iOIl;
/* 3 */             o0olIo1 o0olio12 = o0olIo1.I00iOIl;
/* 5 */             int iOrdinal = i1o0iloi.ordinal();
/* 13 */            if (iOrdinal == 0) {
/* 59 */                int iOrdinal2 = o0olio1.ordinal();
/* 63 */                if (iOrdinal2 == 0) {
/* 94 */                    return iO0O00.SAPI_PROMPT_CREATE;
                        }
/* 65 */                if (iOrdinal2 == 1) {
                            return z ? iO0O00.SAPI_PROMPT_STRUCTURED_OUTPUT_INFERENCE : iO0O00.SAPI_PROMPT_INFERENCE;
                        }
/* 67 */                if (iOrdinal2 == 2) {
                            return z ? iO0O00.SAPI_PROMPT_STRUCTURED_OUTPUT_COUNT_TOKENS : iO0O00.SAPI_PROMPT_COUNT_TOKENS;
                        }
/* 69 */                if (iOrdinal2 == 3) {
/* 71 */                    return iO0O00.SAPI_PROMPT_CLOSE;
                        }
/* 74 */                I000II.I00000oIO();
/* 9 */                 return null;
                    }
/* 15 */            if (iOrdinal != 1) {
/* 55 */                I000II.I00000oIO();
/* 9 */                 return null;
                    }
/* 17 */            int iOrdinal3 = o0olio1.ordinal();
/* 21 */            if (iOrdinal3 == 0) {
/* 52 */                return iO0O00.SAPI_PROMPT_INFERENCE_WITH_CACHE_CREATE;
                    }
/* 23 */            if (iOrdinal3 == 1) {
                        return z ? iO0O00.SAPI_PROMPT_STRUCTURED_OUTPUT_INFERENCE_WITH_CACHE_INFERENCE : iO0O00.SAPI_PROMPT_INFERENCE_WITH_CACHE_INFERENCE;
                    }
/* 25 */            if (iOrdinal3 == 2) {
                        return z ? iO0O00.SAPI_PROMPT_STRUCTURED_OUTPUT_COUNT_TOKENS : iO0O00.SAPI_PROMPT_COUNT_TOKENS;
                    }
/* 27 */            if (iOrdinal3 == 3) {
/* 29 */                return iO0O00.SAPI_PROMPT_INFERENCE_WITH_CACHE_CLOSE;
                    }
/* 32 */            I000II.I00000oIO();
/* 9 */             return null;
                }

                @Override
                public final void I00000oIO(int i, int i2) throws Throwable {
/* 2 */             I0000O(null, i, i2);
                }

                @Override
                public final void I00000oOI(IOiOol0 iOiOol0, Object obj, Object obj2) throws Throwable {
                    Integer numValueOf;
                    String textString;
/* 7 */             i1O0ll11O0ll i1o0ll11o0ll = (i1O0ll11O0ll) obj;
/* 11 */            GenerateContentResponse generateContentResponse = (GenerateContentResponse) obj2;
/* 13 */            GenerateContentRequest generateContentRequest = i1o0ll11o0ll.I00000oIO;
/* 17 */            ArrayList arrayList = new ArrayList();
/* 24 */            Iterator<Content> it = generateContentRequest.getContents().iterator();
/* 33 */            while (it.hasNext()) {
/* 53 */                for (Part part : it.next().getParts()) {
/* 63 */                    if (part instanceof ImagePart) {
/* 65 */                        ImagePart imagePart = (ImagePart) part;
/* 85 */                        Long lValueOf = Long.valueOf(imagePart.getBitmap().getHeight() * imagePart.getBitmap().getWidth());
/* 91 */                        iOIOii0OI00O ioioii0oi00o = new iOIOii0OI00O();
/* 96 */                        ioioii0oi00o.I00000oIO = iOIO10i01Oo.MODALITY_TYPE_IMAGE;
/* 98 */                        ioioii0oi00o.I00000oOI = lValueOf;
/* 100 */                       ioioii0oi00o.I0000Il00O = null;
/* 102 */                       VarHandle.storeStoreFence();
/* 105 */                       arrayList.add(ioioii0oi00o);
                            }
                        }
                    }
/* 114 */           Long lValueOf2 = Long.valueOf(I000OOo1O(generateContentRequest));
/* 118 */           PromptPrefix zzg = generateContentRequest.getZzg();
/* 136 */           int length = (zzg == null || (textString = zzg.getTextString()) == null) ? 0 : textString.length();
/* 141 */           Iterator<Content> it2 = generateContentRequest.getContents().iterator();
/* 145 */           int length2 = 0;
/* 150 */           while (it2.hasNext()) {
/* 170 */               for (Part part2 : it2.next().getParts()) {
/* 180 */                   if (part2 instanceof TextPart) {
/* 192 */                       length2 += ((TextPart) part2).getTextString().length();
                            }
                        }
                    }
/* 194 */           i1O0iloI i1o0iloi = i1O0iloI.I00iOIl;
/* 196 */           o0olIo1 o0olio1 = o0olIo1.I00iOIl;
/* 198 */           i1O0iloI i1o0iloi2 = this.I00000oIO;
/* 200 */           int iOrdinal = i1o0iloi2.ordinal();
/* 205 */           if (iOrdinal != 0 && iOrdinal != 1) {
/* 210 */               I000II.I00000oIO();
/* 213 */               return;
                    }
/* 215 */           Integer numValueOf2 = Integer.valueOf(length2 + length);
/* 219 */           Integer numValueOf3 = Integer.valueOf(length);
/* 225 */           iOO11o0o11o1 ioo11o0o11o1 = new iOO11o0o11o1();
/* 228 */           ioo11o0o11o1.I00000oIO = numValueOf2;
/* 230 */           ioo11o0o11o1.I00000oOI = numValueOf3;
/* 232 */           VarHandle.storeStoreFence();
/* 237 */           iOIOii0OI00O ioioii0oi00o2 = new iOIOii0OI00O();
/* 242 */           ioioii0oi00o2.I00000oIO = iOIO10i01Oo.MODALITY_TYPE_TEXT;
/* 244 */           ioioii0oi00o2.I00000oOI = lValueOf2;
/* 246 */           ioioii0oi00o2.I0000Il00O = ioo11o0o11o1;
/* 248 */           VarHandle.storeStoreFence();
/* 251 */           arrayList.add(ioioii0oi00o2);
/* 258 */           I0Oi111ii i0Oi111ii = new I0Oi111ii(13);
/* 265 */           Float fValueOf = Float.valueOf(generateContentRequest.getZza());
/* 273 */           Integer numValueOf4 = Integer.valueOf(generateContentRequest.getZzb());
/* 281 */           Integer numValueOf5 = Integer.valueOf(generateContentRequest.getZzc());
/* 289 */           Integer numValueOf6 = Integer.valueOf(generateContentRequest.getZzd());
/* 297 */           Integer numValueOf7 = Integer.valueOf(generateContentRequest.getZze());
/* 301 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(arrayList);
/* 307 */           iOIilIo ioiilio = new iOIilIo();
/* 310 */           ioiilio.I00000oIO = fValueOf;
/* 312 */           ioiilio.I00000oOI = numValueOf4;
/* 314 */           ioiilio.I0000Il00O = numValueOf5;
/* 316 */           ioiilio.I0000O = numValueOf6;
/* 318 */           ioiilio.I0000oI00 = numValueOf7;
/* 320 */           ioiilio.I0001Ioi1lo = loi1lll1l10I000o00OoI0I;
/* 322 */           VarHandle.storeStoreFence();
/* 333 */           iOiOol0.I00ilI0I1 = Integer.valueOf(I000OOo1O(generateContentRequest));
/* 341 */           Iterator<T> it3 = generateContentResponse.getCandidates().iterator();
/* 349 */           if (it3.hasNext()) {
/* 359 */               String zza = ((Candidate) it3.next()).getZza();
/* 371 */               numValueOf = Integer.valueOf(zza != null ? zza.length() : 0);
/* 379 */               while (it3.hasNext()) {
/* 387 */                   String zza2 = ((Candidate) it3.next()).getZza();
/* 399 */                   Integer numValueOf8 = Integer.valueOf(zza2 != null ? zza2.length() : 0);
/* 407 */                   if (numValueOf.compareTo(numValueOf8) < 0) {
/* 409 */                       numValueOf = numValueOf8;
                            }
                        }
                    } else {
/* 351 */               numValueOf = null;
                    }
/* 423 */           iOiOol0.I00ilO0 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0);
/* 425 */           iOIli0 ioili0I00Iooi00oi = iOiOol0.I00Iooi00oi();
/* 431 */           iOIiOil ioiioil = new iOIiOil();
/* 436 */           ioiioil.I00000oIO = this.I00000oOI;
/* 438 */           ioiioil.I00000oOI = ioiilio;
/* 440 */           ioiioil.I0000Il00O = ioili0I00Iooi00oi;
/* 442 */           VarHandle.storeStoreFence();
/* 445 */           i0Oi111ii.I00iio = ioiioil;
/* 464 */           this.I0000Il00O.I00000oIO(OoIOol.I000OOo1O(i0Oi111ii), I000OiO(i1o0iloi2, o0olIo1.I00iiI, i1o0ll11o0ll.I00000oOI != null));
                }

                @Override
                public final void I0000Il00O(IOiOol0 iOiOol0, Object obj, int i, Duration duration) throws Throwable {
/* 1 */             i1O0ll11O0ll i1o0ll11o0ll = (i1O0ll11O0ll) obj;
/* 3 */             if (duration != null) {
/* 19 */                iOiOol0.I00io1l = Long.valueOf(duration.toMillis() & Long.MAX_VALUE);
                    }
/* 25 */            I0Oi111ii i0Oi111ii = new I0Oi111ii(13);
/* 28 */            Integer numValueOf = Integer.valueOf(i);
/* 42 */            iOiOol0.I00ilI0I1 = Integer.valueOf(I000OOo1O(i1o0ll11o0ll.I00000oIO));
/* 44 */            iOIli0 ioili0I00Iooi00oi = iOiOol0.I00Iooi00oi();
/* 50 */            iOIOoO0 ioiooo0 = new iOIOoO0();
/* 55 */            ioiooo0.I00000oIO = this.I00000oOI;
/* 57 */            ioiooo0.I00000oOI = ioili0I00Iooi00oi;
/* 59 */            ioiooo0.I0000Il00O = numValueOf;
/* 61 */            VarHandle.storeStoreFence();
/* 64 */            i0Oi111ii.I00io1l = ioiooo0;
/* 87 */            this.I0000Il00O.I00000oIO(OoIOol.I000OOo1O(i0Oi111ii), I000OiO(this.I00000oIO, o0olIo1.I00iiO, i1o0ll11o0ll.I00000oOI != null));
                }

                @Override
                public final void I0000oI00(int i, int i2) throws Throwable {
/* 2 */             I0001Ioi1lo(null, i, i2);
                }

                @Override
                public final void I0000O(i1O0ll11O0ll i1o0ll11o0ll, int i, int i2) throws Throwable {
/* 5 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(13);
/* 8 */             Integer numValueOf = Integer.valueOf(i);
/* 12 */            iO0Io0 io0io0Zzk = iOi1l1i1O.zzk(i2);
/* 18 */            iOIli0 ioili0 = new iOIli0();
/* 21 */            ioili0.I00000oIO = numValueOf;
/* 23 */            ioili0.I00000oOI = io0io0Zzk;
/* 26 */            ioili0.I0000Il00O = null;
/* 28 */            ioili0.I0000O = null;
/* 30 */            ioili0.I0000oI00 = null;
/* 32 */            ioili0.I0001Ioi1lo = null;
/* 34 */            ioili0.I000II = null;
/* 36 */            VarHandle.storeStoreFence();
/* 41 */            iOIiOil ioiioil = new iOIiOil();
/* 46 */            ioiioil.I00000oIO = this.I00000oOI;
/* 48 */            ioiioil.I00000oOI = null;
/* 50 */            ioiioil.I0000Il00O = ioili0;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            i0Oi111ii.I00iio = ioiioil;
/* 80 */            this.I0000Il00O.I00000oIO(OoIOol.I000OOo1O(i0Oi111ii), I000OiO(this.I00000oIO, o0olIo1.I00iiI, (i1o0ll11o0ll != null ? i1o0ll11o0ll.I00000oOI : null) != null));
                }

                @Override
                public final void I0001Ioi1lo(i1O0ll11O0ll i1o0ll11o0ll, int i, int i2) throws Throwable {
/* 5 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(13);
/* 8 */             Integer numValueOf = Integer.valueOf(i);
/* 12 */            iO0Io0 io0io0Zzk = iOi1l1i1O.zzk(i2);
/* 18 */            iOIli0 ioili0 = new iOIli0();
/* 21 */            ioili0.I00000oIO = numValueOf;
/* 23 */            ioili0.I00000oOI = io0io0Zzk;
/* 26 */            ioili0.I0000Il00O = null;
/* 28 */            ioili0.I0000O = null;
/* 30 */            ioili0.I0000oI00 = null;
/* 32 */            ioili0.I0001Ioi1lo = null;
/* 34 */            ioili0.I000II = null;
/* 36 */            VarHandle.storeStoreFence();
/* 41 */            iOIOoO0 ioiooo0 = new iOIOoO0();
/* 46 */            ioiooo0.I00000oIO = this.I00000oOI;
/* 48 */            ioiooo0.I00000oOI = ioili0;
/* 50 */            ioiooo0.I0000Il00O = null;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            i0Oi111ii.I00io1l = ioiooo0;
/* 80 */            this.I0000Il00O.I00000oIO(OoIOol.I000OOo1O(i0Oi111ii), I000OiO(this.I00000oIO, o0olIo1.I00iiO, (i1o0ll11o0ll != null ? i1o0ll11o0ll.I00000oOI : null) != null));
                }

                public final int I000OOo1O(GenerateContentRequest generateContentRequest) {
                    String textString;
/* 1 */             PromptPrefix zzg = generateContentRequest.getZzg();
/* 19 */            int length = (zzg == null || (textString = zzg.getTextString()) == null) ? 0 : textString.length();
/* 24 */            Iterator<Content> it = generateContentRequest.getContents().iterator();
/* 28 */            int length2 = 0;
/* 33 */            while (it.hasNext()) {
/* 53 */                for (Part part : it.next().getParts()) {
/* 63 */                    if (part instanceof TextPart) {
/* 75 */                        length2 += ((TextPart) part).getTextString().length();
                            }
                        }
                    }
/* 77 */            i1O0iloI i1o0iloi = i1O0iloI.I00iOIl;
/* 79 */            o0olIo1 o0olio1 = o0olIo1.I00iOIl;
/* 83 */            int iOrdinal = this.I00000oIO.ordinal();
/* 87 */            if (iOrdinal == 0 || iOrdinal == 1) {
/* 97 */                return length + length2;
                    }
/* 93 */            I000II.I00000oIO();
/* 5 */             return 0;
                }

                @Override
                public final void zza() throws Throwable {
/* 5 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(13);
/* 10 */            iOIi0li1l ioii0li1l = new iOIi0li1l();
/* 15 */            ioii0li1l.I00000oIO = this.I00000oOI;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            i0Oi111ii.I00ilI0I1 = ioii0li1l;
/* 37 */            this.I0000Il00O.I00000oIO(OoIOol.I000OOo1O(i0Oi111ii), I000OiO(this.I00000oIO, o0olIo1.I00iOIl, false));
                }

                @Override
                public final void zzc() throws Throwable {
/* 5 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(13);
/* 10 */            iOIOloiliO ioioloilio = new iOIOloiliO();
/* 15 */            ioioloilio.I00000oIO = this.I00000oOI;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            i0Oi111ii.I00ilO0 = ioioloilio;
/* 37 */            this.I0000Il00O.I00000oIO(OoIOol.I000OOo1O(i0Oi111ii), I000OiO(this.I00000oIO, o0olIo1.I00iio, false));
                }
            }
