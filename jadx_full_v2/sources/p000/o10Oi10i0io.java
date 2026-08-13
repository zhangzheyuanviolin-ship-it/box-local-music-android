            package p000;

            import android.graphics.Bitmap;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.common.StreamingCallback;
            import com.google.mlkit.genai.prompt.Candidate;
            import com.google.mlkit.genai.prompt.Content;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.prompt.GenerateContentResponse;
            import com.google.mlkit.genai.prompt.ImagePart;
            import com.google.mlkit.genai.prompt.Part;
            import com.google.mlkit.genai.prompt.PromptPrefix;
            import com.google.mlkit.genai.prompt.SystemInstruction;
            import com.google.mlkit.genai.prompt.TextPart;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            
            public final class o10Oi10i0io {
                public static final o10Oi10i0io I00000oIO = new o10Oi10i0io();

                public static final String I00000oIO(String str, l0i0Ol1 l0i0ol1) {
/* 5 */             String string = l0i0ol1.I00000oIO().toString();
/* 13 */            if (string.length() == 0) {
/* 15 */                return str;
                    }
/* 38 */            return IIl001iO0Io.I00100o1O0lo(new StringBuilder(string.length() + str.length() + 146 + 1), str, "\nContext:\nDo NOT generate unsafe content.\nIf contents are safe, you MUST output ONLY in the following JSON schema without any spaces or newlines:\n", string, "\n");
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v3, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
                public static final GenerateContentResponse I00000oOI(l0i10Il l0i10il) {
                    ?? arrayList;
/* 10 */            List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(l0i10il.I00000oIO, new OiOIlO1OII0(18));
/* 18 */            HashSet hashSet = new HashSet();
/* 23 */            ArrayList arrayList2 = new ArrayList();
/* 34 */            for (Object obj : listI00Ol1ll1) {
/* 49 */                if (hashSet.add(((l0OOIlOO11) obj).I00000oIO)) {
/* 51 */                    arrayList2.add(obj);
                        }
                    }
/* 63 */            ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 66 */            Iterator it = arrayList2.iterator();
                    while (true) {
/* 74 */                int i = -100;
/* 78 */                if (!it.hasNext()) {
                            break;
                        }
/* 84 */                l0OOIlOO11 l0ooiloo11 = (l0OOIlOO11) it.next();
/* 86 */                String str = l0ooiloo11.I00000oIO;
/* 88 */                int i2 = l0ooiloo11.I0000Il00O;
/* 90 */                if (i2 == 0) {
/* 97 */                    i = 0;
                        } else if (i2 == 1) {
/* 95 */                    i = 1;
                        }
/* 106 */               arrayList3.add(Candidate.Companion.zza(str, Integer.valueOf(i)));
                    }
/* 110 */           lOI1lll1l10 loi1lll1l10 = l0i10il.I0000O;
/* 112 */           if (loi1lll1l10 != null) {
/* 120 */               arrayList = new ArrayList(IOOi1I.I0000O(loi1lll1l10, 10));
/* 123 */               lO1loOl0O0O lo1lool0o0oListIterator = loi1lll1l10.listIterator(0);
/* 131 */               while (lo1lool0o0oListIterator.hasNext()) {
/* 137 */                   l0OOIlOO11 l0ooiloo112 = (l0OOIlOO11) lo1lool0o0oListIterator.next();
/* 139 */                   String str2 = l0ooiloo112.I00000oIO;
/* 141 */                   int i3 = l0ooiloo112.I0000Il00O;
/* 160 */                   arrayList.add(Candidate.Companion.zza(str2, Integer.valueOf(i3 != 0 ? i3 != 1 ? -100 : 1 : 0)));
                        }
                    } else {
/* 164 */               arrayList = Il01100l.I00iOIl;
                    }
/* 166 */           return GenerateContentResponse.Companion.zzb(arrayList3, arrayList);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v0, types: [int] */
                /* JADX WARN: Type inference failed for: r14v4 */
                /* JADX WARN: Type inference failed for: r14v5, types: [int] */
                /* JADX WARN: Type inference failed for: r14v8 */
                public static final l0OlI0ioiIli I0000Il00O(i1O0ll11O0ll i1o0ll11o0ll, StreamingCallback streamingCallback, l0OI0O11o l0oi0o11o) throws GenAiException {
                    String textString;
                    String textString2;
                    boolean z;
                    i11I1Ili i11i1ili;
                    boolean z2;
                    ?? r14;
/* 5 */             boolean z3 = i1o0ll11o0ll.I0000Il00O;
/* 7 */             GenerateContentRequest generateContentRequest = i1o0ll11o0ll.I00000oIO;
/* 11 */            ArrayList arrayList = new ArrayList();
/* 14 */            PromptPrefix zzg = generateContentRequest.getZzg();
/* 20 */            if (zzg == null || (textString = zzg.getTextString()) == null) {
/* 18 */                textString = "";
                    }
/* 29 */            O0IOli0o0 o0IOli0o0 = i1o0ll11o0ll.I00000oOI;
/* 42 */            l0i0Ol1 l0i0ol1I00000oIO = o0IOli0o0 != null ? o0ol0Oo.I00000oIO(o0IOli0o0).I00000oIO() : null;
/* 43 */            SystemInstruction zzi = generateContentRequest.getZzi();
/* 47 */            if (zzi == null || (textString2 = zzi.getTextString()) == null) {
/* 18 */                textString2 = "";
                    }
/* 60 */            int i = 2;
/* 61 */            if (textString2.length() > 0) {
/* 67 */                arrayList.add(l0O00I.I00000oIO(2, textString2));
                    }
/* 74 */            Iterator<Content> it = generateContentRequest.getContents().iterator();
/* 78 */            boolean z4 = false;
/* 79 */            int length = 0;
/* 84 */            while (it.hasNext()) {
/* 104 */               for (Part part : it.next().getParts()) {
/* 114 */                   if (part instanceof TextPart) {
/* 126 */                       length += ((TextPart) part).getTextString().length();
                            }
                        }
                    }
/* 128 */           List<Content> contents = generateContentRequest.getContents();
/* 136 */           if ((contents instanceof Collection) && contents.isEmpty()) {
/* 147 */               z = false;
                    } else {
/* 149 */               Iterator it2 = contents.iterator();
/* 157 */               loop6: while (it2.hasNext()) {
/* 165 */                   List<Part> parts = ((Content) it2.next()).getParts();
/* 173 */                   if (!(parts instanceof Collection) || !parts.isEmpty()) {
/* 185 */                       Iterator it3 = parts.iterator();
/* 193 */                       while (it3.hasNext()) {
/* 203 */                           if (((Part) it3.next()) instanceof TextPart) {
/* 205 */                               z = true;
                                        break loop6;
                                    }
                                }
                            }
                        }
/* 147 */               z = false;
                    }
/* 218 */           if (textString2.length() + textString.length() + length > 32000) {
/* 1638 */              throw new GenAiException("Input text length exceeds the limit. Please check the countTokens API.", (Throwable) null, 12);
                    }
/* 224 */           Iterator<Content> it4 = generateContentRequest.getContents().iterator();
/* 228 */           TextPart textPart = null;
/* 233 */           while (it4.hasNext()) {
/* 253 */               for (Part part2 : it4.next().getParts()) {
/* 261 */                   int i2 = i;
/* 265 */                   if (part2 instanceof TextPart) {
/* 268 */                       textPart = (TextPart) part2;
                            }
/* 270 */                   i = i2;
                        }
                    }
/* 273 */           int i3 = i;
/* 275 */           if (!z && textString.length() > 0 && l0oi0o11o == null) {
/* 289 */               arrayList.add(l0O00I.I00000oIO(0, textString));
                    }
/* 296 */           Iterator<Content> it5 = generateContentRequest.getContents().iterator();
/* 300 */           boolean z5 = true;
/* 305 */           while (it5.hasNext()) {
/* 325 */               for (Part part3 : it5.next().getParts()) {
/* 335 */                   if (part3 instanceof TextPart) {
/* 340 */                       String textString3 = ((TextPart) part3).getTextString();
/* 344 */                       if (z5 && l0oi0o11o == null) {
/* 352 */                           textString3 = textString.concat(String.valueOf(textString3));
/* 356 */                           z5 = z4 ? 1 : 0;
                                }
/* 357 */                       if (part3 == textPart && l0i0ol1I00000oIO != null && z3) {
/* 363 */                           textString3 = I00000oIO(textString3, l0i0ol1I00000oIO);
                                }
/* 371 */                       arrayList.add(l0O00I.I00000oIO(z4 ? 1 : 0, textString3));
                            } else {
/* 377 */                       if (part3 instanceof ImagePart) {
/* 379 */                           ImagePart imagePart = (ImagePart) part3;
/* 381 */                           Bitmap bitmap = imagePart.getBitmap();
/* 389 */                           Bitmap.Config config = imagePart.getBitmap().getConfig();
/* 393 */                           if (config == null) {
/* 395 */                               config = Bitmap.Config.ARGB_8888;
                                    }
/* 397 */                           Bitmap bitmapCopy = bitmap.copy(config, z4);
/* 401 */                           int width = bitmapCopy.getWidth();
/* 405 */                           int height = bitmapCopy.getHeight();
/* 409 */                           int iMin = Math.min(width, height);
/* 415 */                           if (iMin > 768) {
                                        float f = iMin;
                                        float f2 = width;
/* 422 */                               float f3 = 768.0f / f;
/* 427 */                               r14 = 0;
/* 428 */                               Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCopy, (int) (f2 * f3), (int) (height * f3), false);
/* 432 */                               if (bitmapCreateScaledBitmap != bitmapCopy) {
/* 434 */                                   bitmapCopy.recycle();
                                        }
/* 437 */                               bitmapCopy = bitmapCreateScaledBitmap;
                                    } else {
/* 439 */                               r14 = 0;
                                    }
/* 447 */                           arrayList.add(new l0O00I(r14, null, bitmapCopy, 1));
                                    z2 = r14;
                                } else {
/* 451 */                           z2 = z4 ? 1 : 0;
                                }
/* 452 */                       z4 = z2;
                            }
                        }
                    }
/* 455 */           ?? r142 = z4;
/* 456 */           if (textPart == null) {
/* 458 */               if (l0i0ol1I00000oIO == null) {
/* 474 */                   l0i0ol1I00000oIO = null;
                        } else if (z3) {
/* 470 */                   arrayList.add(l0O00I.I00000oIO(r142, I00000oIO("", l0i0ol1I00000oIO)));
                        }
                    }
/* 475 */           if (streamingCallback != null) {
/* 481 */               i11i1ili = new i11I1Ili(13);
/* 484 */               i11i1ili.I00iiI = streamingCallback;
/* 486 */               VarHandle.storeStoreFence();
                    } else {
/* 490 */               i11i1ili = null;
                    }
/* 500 */           lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 504 */           lOI1lll1l10.I000o00OoI0I(lOl10OOloi.I00ilI0I1);
/* 539 */           short s = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (0 | 1)) | 2)) | 8)) | 16)) | 128)) | 256)) | 512)) | 64)) | 32)) | 1024)) | 2048)) | 4)) | 4096);
/* 540 */           l1IO00lII l1io00lii = l1IO00lII.I00000oOI;
/* 542 */           if (l1io00lii == null) {
/* 839 */               IOOlIIilOl0.I000II("Null tools");
/* 836 */               return null;
                    }
/* 544 */           if (l0i0ol1I00000oIO == null) {
/* 547 */               l0i0ol1I00000oIO = null;
                    }
/* 552 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(IOOi0Ool1i.I00iIi0i1o(arrayList));
/* 556 */           float zza = generateContentRequest.getZza();
/* 565 */           int zzc = generateContentRequest.getZzc();
/* 574 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I2 = lOI1lll1l10.I000o00OoI0I(Il01100l.I00iOIl);
/* 581 */           int zze = generateContentRequest.getZze();
/* 594 */           int zzd = generateContentRequest.getZzd();
/* 601 */           int zzb = generateContentRequest.getZzb();
/* 608 */           boolean zzj = generateContentRequest.getZzj();
/* 614 */           short s2 = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (s | 1)) | 2)) | 8)) | 16)) | 128)) | 256)) | 32)) | 1024)) | 4096);
/* 615 */           if (i11i1ili == null) {
/* 618 */               i11i1ili = null;
                    }
/* 624 */           l0OI0O11o l0oi0o11o2 = l0oi0o11o != null ? l0oi0o11o : null;
/* 627 */           if (s2 == 8191 && loi1lll1l10I000o00OoI0I != null && loi1lll1l10I000o00OoI0I2 != null) {
/* 635 */               l0OlI0ioiIli l0oli0ioiili = new l0OlI0ioiIli();
/* 638 */               l0oli0ioiili.I00000oIO = loi1lll1l10I000o00OoI0I;
/* 640 */               l0oli0ioiili.I00000oOI = zza;
/* 642 */               l0oli0ioiili.I0000Il00O = zzc;
/* 646 */               l0oli0ioiili.I0000O = 1.0f;
/* 648 */               l0oli0ioiili.I0000oI00 = loi1lll1l10I000o00OoI0I2;
/* 651 */               l0oli0ioiili.I0001Ioi1lo = 1;
/* 653 */               l0oli0ioiili.I000II = zze;
/* 655 */               l0oli0ioiili.I000O01llI0 = zzd;
/* 657 */               l0oli0ioiili.I000OOo1O = i11i1ili;
/* 659 */               l0oli0ioiili.I000OiO = true;
/* 663 */               l0oli0ioiili.I000iOII = i3;
/* 665 */               l0oli0ioiili.I000l1 = i3;
/* 667 */               l0oli0ioiili.I000lI = zzb;
/* 671 */               l0oli0ioiili.I000o00OoI0I = ilOoio1o.I00000oIO;
/* 673 */               l0oli0ioiili.I000oI1ioi = l0oi0o11o2;
/* 675 */               l0oli0ioiili.I00100l0 = l0i0ol1I00000oIO;
/* 677 */               l0oli0ioiili.I00100o1O0lo = zzj;
/* 679 */               l0oli0ioiili.I0010I0i = l1io00lii;
/* 681 */               VarHandle.storeStoreFence();
/* 684 */               return l0oli0ioiili;
                    }
/* 687 */           StringBuilder sb = new StringBuilder();
/* 690 */           if (loi1lll1l10I000o00OoI0I == null) {
/* 694 */               sb.append(" messages");
                    }
/* 699 */           if ((s2 & 1) == 0) {
/* 703 */               sb.append(" temperature");
                    }
/* 708 */           if ((s2 & 2) == 0) {
/* 712 */               sb.append(" topK");
                    }
/* 717 */           if ((s2 & 4) == 0) {
/* 721 */               sb.append(" topP");
                    }
/* 724 */           if (loi1lll1l10I000o00OoI0I2 == null) {
/* 728 */               sb.append(" stopTokensList");
                    }
/* 733 */           if ((s2 & 8) == 0) {
/* 737 */               sb.append(" targetReplyLengthMin");
                    }
/* 742 */           if ((s2 & 16) == 0) {
/* 746 */               sb.append(" targetReplyLengthMax");
                    }
/* 751 */           if ((s2 & 32) == 0) {
/* 755 */               sb.append(" numSamples");
                    }
/* 760 */           if ((s2 & 64) == 0) {
/* 764 */               sb.append(" shouldApplySafetyFilter");
                    }
/* 769 */           if ((s2 & 128) == 0) {
/* 773 */               sb.append(" preferredImageWidth");
                    }
/* 778 */           if ((s2 & 256) == 0) {
/* 782 */               sb.append(" preferredImageHeight");
                    }
/* 787 */           if ((s2 & 512) == 0) {
/* 791 */               sb.append(" numSoftTokens");
                    }
/* 796 */           if ((s2 & 1024) == 0) {
/* 800 */               sb.append(" rngSeed");
                    }
/* 805 */           if ((s2 & 2048) == 0) {
/* 809 */               sb.append(" overrideRequestKind");
                    }
/* 814 */           if ((s2 & 4096) == 0) {
/* 818 */               sb.append(" enableThinking");
                    }
/* 831 */           I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 834 */           return null;
                }
            }
