            package p000;

            import android.graphics.Bitmap;
            import android.os.Bundle;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class l0OlI0ioiIli {
                public lOI1lll1l10 I00000oIO;
                public float I00000oOI;
                public int I0000Il00O;
                public float I0000O;
                public lOI1lll1l10 I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public i11I1Ili I000OOo1O;
                public boolean I000OiO;
                public int I000iOII;
                public int I000l1;
                public int I000lI;
                public ilOoio1o I000o00OoI0I;
                public l0OI0O11o I000oI1ioi;
                public l0i0Ol1 I00100l0;
                public boolean I00100o1O0lo;
                public l1IO00lII I0010I0i;

                public final iiloi0IlI I00000oIO() {
                    iilIIi1 iiliii1;
                    boolean z;
                    il1o1o0111Oi il1o1o0111oi;
/* 5 */             lOI1lll1l10 loi1lll1l10 = this.I0010I0i.I00000oIO;
/* 7 */             Parcelable.Creator<iiloi0IlI> creator = iiloi0IlI.CREATOR;
/* 19 */            lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 23 */            lOI1lll1l10.I000o00OoI0I(lOl10OOloi.I00ilI0I1);
/* 37 */            short s = (short) (((short) (((short) (((short) (((short) (((short) (((short) (0 | 64)) | 128)) | 1024)) | 256)) | 512)) | 2048)) | 4096);
/* 38 */            l0OI0O11o l0oi0o11o = this.I000oI1ioi;
/* 40 */            boolean z2 = true;
/* 43 */            if (l0oi0o11o != null) {
/* 45 */                ParcelFileDescriptor parcelFileDescriptor = l0oi0o11o.I00000oOI;
/* 49 */                ll0OlOllOl.I00000oOI("Cache file should not be null", parcelFileDescriptor);
/* 52 */                long statSize = parcelFileDescriptor.getStatSize();
/* 56 */                long statSize2 = parcelFileDescriptor.getStatSize();
/* 65 */                if (statSize > 209715200) {
/* 186 */                   I000II.I000iOII(ll0Oo10I10.I00000oIO("Cache file should be less than %s bytes: %s", 209715200, Long.valueOf(statSize2)));
/* 42 */                    return null;
                        }
/* 67 */                lOI1lll1l10 loi1lll1l102 = l0oi0o11o.I00000oIO;
/* 80 */                ll0OlOllOl.I00000oIO("Only single message is supported for now.", loi1lll1l102.size() <= 1);
/* 85 */                ArrayList arrayList = new ArrayList();
/* 88 */                int size = loi1lll1l102.size();
/* 93 */                for (int i = 0; i < size; i++) {
/* 99 */                    l0O00I l0o00i = (l0O00I) loi1lll1l102.get(i);
/* 101 */                   int i2 = l0o00i.I0000O;
/* 103 */                   if (i2 != 0) {
/* 156 */                       I000II.I000iOII(Oi010OO0.I00100l0(i2, "Only TEXT type is supported for now. Received type: ", new StringBuilder(String.valueOf(i2).length() + 52)));
/* 42 */                        return null;
                            }
/* 105 */                   int i3 = l0o00i.I00000oIO;
/* 107 */                   String str = l0o00i.I00000oOI;
/* 109 */                   str.getClass();
/* 129 */                   arrayList.add(new iiio1OOIi(i3, str, null, 0, null, false, null, null));
                        }
/* 162 */               iiliii1 = new iilIIi1(arrayList, parcelFileDescriptor);
                    } else {
/* 190 */               iiliii1 = null;
                    }
/* 191 */           l0i0Ol1 l0i0ol1 = this.I00100l0;
/* 200 */           iiooOolI1 iiooooli1I00000oOI = l0i0ol1 != null ? l0i0ol1.I00000oOI() : null;
/* 201 */           i11I1Ili i11i1ili = this.I000OOo1O;
/* 211 */           l0ll0iOO l0ll0ioo = i11i1ili != null ? new l0ll0iOO(this, i11i1ili) : null;
/* 214 */           Bundle bundle = new Bundle();
/* 217 */           lO1loOl0O0O lo1lool0o0o2 = lOI1lll1l10.I00iiI;
/* 222 */           lO1l0Oi lo1l0oi = new lO1l0Oi(4, (byte) 0);
/* 227 */           new ArrayList();
/* 230 */           lOI1lll1l10 loi1lll1l103 = this.I00000oIO;
/* 232 */           int size2 = loi1lll1l103.size();
/* 236 */           int i4 = 0;
/* 237 */           while (i4 < size2) {
/* 243 */               l0O00I l0o00i2 = (l0O00I) loi1lll1l103.get(i4);
/* 245 */               boolean z3 = z2;
/* 247 */               int i5 = l0o00i2.I0000O;
/* 249 */               int i6 = l0o00i2.I00000oIO;
/* 251 */               if (i5 != 0) {
/* 253 */                   Bitmap bitmap = l0o00i2.I0000Il00O;
/* 260 */                   Bitmap bitmapAsShared = bitmap == null ? null : bitmap.asShared();
/* 266 */                   bitmapAsShared.getClass();
/* 290 */                   lo1l0oi.I000O01llI0(new iiio1OOIi(i6, null, bitmapAsShared, 1, null, false, null, null));
                        } else {
/* 296 */                   String str2 = l0o00i2.I00000oOI;
/* 298 */                   str2.getClass();
/* 322 */                   lo1l0oi.I000O01llI0(new iiio1OOIi(i6, str2, null, 0, null, false, null, null));
                        }
/* 325 */               i4++;
/* 327 */               z2 = z3;
                    }
/* 337 */           if (!bundle.hasFileDescriptors()) {
/* 340 */               bundle = null;
                    }
/* 345 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(lo1l0oi.I000l1());
/* 349 */           float f = this.I00000oOI;
/* 354 */           int i7 = this.I0000Il00O;
/* 359 */           float f2 = this.I0000O;
/* 366 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I2 = lOI1lll1l10.I000o00OoI0I(this.I0000oI00);
/* 370 */           int i8 = this.I0001Ioi1lo;
/* 374 */           int i9 = this.I000II;
/* 379 */           boolean z4 = this.I000OiO;
/* 384 */           int i10 = this.I000O01llI0;
/* 388 */           short s2 = (short) (((short) (((short) (((short) (((short) (((short) (((short) (s | 1)) | 2)) | 2048)) | 4)) | 8)) | 16)) | 32);
/* 391 */           int i11 = this.I000iOII;
/* 398 */           iiooOolI1 iiooooli1 = iiooooli1I00000oOI;
/* 400 */           int i12 = this.I000l1;
/* 408 */           iilIIi1 iiliii12 = iiliii1;
/* 410 */           int i13 = this.I000lI;
/* 419 */           Bundle bundle2 = bundle;
/* 422 */           il0llOOOOIO il0llooooio = new il0llOOOOIO(false);
/* 428 */           boolean z5 = this.I00100o1O0lo;
/* 432 */           short s3 = (short) (((short) (((short) (((short) (((short) (((short) (s2 | 64)) | 128)) | 1024)) | 256)) | 512)) | 4096);
/* 437 */           if (loi1lll1l10.isEmpty()) {
/* 439 */               z = z5;
/* 441 */               il1o1o0111oi = null;
                    } else {
/* 445 */               z = z5;
/* 448 */               ll0iOo11011i.I00000oOI(4, "initialCapacity");
/* 451 */               Object[] objArr = new Object[4];
/* 457 */               if (loi1lll1l10.size() > 0) {
/* 706 */                   loi1lll1l10.get(0).getClass();
/* 709 */                   OIiilo1Ool0o.I00000oIO();
/* 700 */                   return null;
                        }
/* 466 */               il1o1o0111oi = new il1o1o0111Oi(lOI1lll1l10.I000oI1ioi(0, objArr));
                    }
/* 471 */           if (s3 == 8191 && loi1lll1l10I000o00OoI0I != null && loi1lll1l10I000o00OoI0I2 != null) {
/* 480 */               iiloi0IlI iiloi0ili = new iiloi0IlI();
/* 483 */               iiloi0ili.I00iOIl = loi1lll1l10I000o00OoI0I;
/* 485 */               iiloi0ili.I00iiI = f;
/* 487 */               iiloi0ili.I00iiO = i7;
/* 489 */               iiloi0ili.I00lli11 = f2;
/* 491 */               iiloi0ili.I00iio = loi1lll1l10I000o00OoI0I2;
/* 493 */               iiloi0ili.I00ilI0I1 = i8;
/* 495 */               iiloi0ili.I00ilO0 = i9;
/* 497 */               iiloi0ili.I00io1l = l0ll0ioo;
/* 499 */               iiloi0ili.I00ioIO = z4;
/* 501 */               iiloi0ili.I00l0I0l0lO1 = i10;
/* 504 */               iiloi0ili.I00ol1 = null;
/* 506 */               iiloi0ili.I00l0OO0IO = i11;
/* 508 */               iiloi0ili.I00li1OI = i12;
/* 510 */               iiloi0ili.I00lll10 = null;
/* 514 */               iiloi0ili.I00o0iI0io1 = bundle2;
/* 518 */               iiloi0ili.I00o0l1o1o0 = i13;
/* 520 */               iiloi0ili.I00o101lO = il0llooooio;
/* 523 */               iiloi0ili.I00oI0i = 0;
/* 527 */               iiloi0ili.I00oII = iiliii12;
/* 529 */               iiloi0ili.I00ll1 = 0;
/* 533 */               iiloi0ili.I00oIiI10 = iiooooli1;
/* 537 */               iiloi0ili.I00oO101o = z;
/* 539 */               iiloi0ili.I00oOio10iI1 = il1o1o0111oi;
/* 541 */               VarHandle.storeStoreFence();
/* 544 */               return iiloi0ili;
                    }
/* 547 */           StringBuilder sb = new StringBuilder();
/* 550 */           if (loi1lll1l10I000o00OoI0I == null) {
/* 554 */               sb.append(" messages");
                    }
/* 559 */           if ((s3 & 1) == 0) {
/* 563 */               sb.append(" temperature");
                    }
/* 568 */           if ((s3 & 2) == 0) {
/* 572 */               sb.append(" topK");
                    }
/* 575 */           if (loi1lll1l10I000o00OoI0I2 == null) {
/* 579 */               sb.append(" stopTokensList");
                    }
/* 584 */           if ((s3 & 4) == 0) {
/* 588 */               sb.append(" targetReplyLengthMin");
                    }
/* 593 */           if ((s3 & 8) == 0) {
/* 597 */               sb.append(" targetReplyLengthMax");
                    }
/* 602 */           if ((s3 & 16) == 0) {
/* 606 */               sb.append(" applySafetyFilter");
                    }
/* 611 */           if ((s3 & 32) == 0) {
/* 615 */               sb.append(" numSamples");
                    }
/* 620 */           if ((s3 & 64) == 0) {
/* 624 */               sb.append(" preferredImageWidth");
                    }
/* 629 */           if ((s3 & 128) == 0) {
/* 633 */               sb.append(" preferredImageHeight");
                    }
/* 638 */           if ((s3 & 256) == 0) {
/* 642 */               sb.append(" rngSeed");
                    }
/* 647 */           if ((s3 & 512) == 0) {
/* 651 */               sb.append(" overrideRequestKind");
                    }
/* 656 */           if ((s3 & 1024) == 0) {
/* 660 */               sb.append(" numSoftTokens");
                    }
/* 665 */           if ((s3 & 2048) == 0) {
/* 669 */               sb.append(" topP");
                    }
/* 674 */           if ((s3 & 4096) == 0) {
/* 678 */               sb.append(" enableThinking");
                    }
/* 691 */           I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 694 */           return null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 176 */               return true;
                    }
/* 7 */             if (!(obj instanceof l0OlI0ioiIli)) {
/* 178 */               return false;
                    }
/* 9 */             l0OlI0ioiIli l0oli0ioiili = (l0OlI0ioiIli) obj;
/* 19 */            if (!this.I00000oIO.equals(l0oli0ioiili.I00000oIO) || Float.floatToIntBits(this.I00000oOI) != Float.floatToIntBits(l0oli0ioiili.I00000oOI) || this.I0000Il00O != l0oli0ioiili.I0000Il00O || Float.floatToIntBits(this.I0000O) != Float.floatToIntBits(l0oli0ioiili.I0000O) || !this.I0000oI00.equals(l0oli0ioiili.I0000oI00) || this.I0001Ioi1lo != l0oli0ioiili.I0001Ioi1lo || this.I000II != l0oli0ioiili.I000II || this.I000O01llI0 != l0oli0ioiili.I000O01llI0) {
/* 178 */               return false;
                    }
/* 83 */            i11I1Ili i11i1ili = this.I000OOo1O;
/* 85 */            i11I1Ili i11i1ili2 = l0oli0ioiili.I000OOo1O;
/* 87 */            if (i11i1ili == null) {
/* 89 */                if (i11i1ili2 != null) {
/* 178 */                   return false;
                        }
                    } else if (i11i1ili != i11i1ili2) {
/* 178 */               return false;
                    }
/* 99 */            if (this.I000OiO != l0oli0ioiili.I000OiO || this.I000iOII != l0oli0ioiili.I000iOII || this.I000l1 != l0oli0ioiili.I000l1 || this.I000lI != l0oli0ioiili.I000lI || !this.I000o00OoI0I.equals(l0oli0ioiili.I000o00OoI0I)) {
/* 178 */               return false;
                    }
/* 129 */           l0OI0O11o l0oi0o11o = this.I000oI1ioi;
/* 131 */           l0OI0O11o l0oi0o11o2 = l0oli0ioiili.I000oI1ioi;
/* 133 */           if (l0oi0o11o == null) {
/* 135 */               if (l0oi0o11o2 != null) {
/* 178 */                   return false;
                        }
                    } else if (!l0oi0o11o.equals(l0oi0o11o2)) {
/* 178 */               return false;
                    }
/* 144 */           l0i0Ol1 l0i0ol1 = this.I00100l0;
/* 146 */           l0i0Ol1 l0i0ol12 = l0oli0ioiili.I00100l0;
/* 148 */           if (l0i0ol1 == null) {
/* 150 */               if (l0i0ol12 != null) {
/* 178 */                   return false;
                        }
                    } else if (!l0i0ol1.equals(l0i0ol12)) {
/* 178 */               return false;
                    }
                    return this.I00100o1O0lo == l0oli0ioiili.I00100o1O0lo && this.I0010I0i.equals(l0oli0ioiili.I0010I0i);
                }

                public final int hashCode() {
/* 38 */            int iHashCode = ((((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.I00000oOI)) * 1000003) ^ this.I0000Il00O) * 1000003) ^ Float.floatToIntBits(this.I0000O)) * 1000003) ^ this.I0000oI00.hashCode();
/* 39 */            i11I1Ili i11i1ili = this.I000OOo1O;
/* 93 */            int iHashCode2 = ((((((((((((((((iHashCode * 1000003) ^ this.I0001Ioi1lo) * 1000003) ^ this.I000II) * 1000003) ^ this.I000O01llI0) * 1000003) ^ (i11i1ili == null ? 0 : i11i1ili.hashCode())) * 1000003) ^ (true != this.I000OiO ? 1237 : 1231)) * 1000003) ^ this.I000iOII) * 1000003) ^ this.I000l1) * (-429739981)) ^ this.I000lI) * 1000003;
/* 94 */            l0OI0O11o l0oi0o11o = this.I000oI1ioi;
/* 113 */           int iHashCode3 = (((iHashCode2 ^ 1001110) * (-721379959)) ^ (l0oi0o11o == null ? 0 : l0oi0o11o.hashCode())) * 1000003;
/* 114 */           l0i0Ol1 l0i0ol1 = this.I00100l0;
/* 138 */           return this.I0010I0i.hashCode() ^ ((((iHashCode3 ^ (l0i0ol1 != null ? l0i0ol1.hashCode() : 0)) * 1000003) ^ (true != this.I00100o1O0lo ? 1237 : 1231)) * 1000003);
                }

                public final String toString() {
/* 5 */             String string = this.I00000oIO.toString();
/* 9 */             int length = string.length();
/* 13 */            float f = this.I00000oOI;
/* 17 */            String string2 = this.I0000oI00.toString();
/* 23 */            String strValueOf = String.valueOf(this.I000OOo1O);
/* 29 */            String strValueOf2 = String.valueOf(this.I000oI1ioi);
/* 35 */            String strValueOf3 = String.valueOf(this.I00100l0);
/* 41 */            String string3 = this.I0010I0i.toString();
/* 49 */            int length2 = String.valueOf(f).length();
/* 53 */            int i = this.I0000Il00O;
/* 59 */            int length3 = String.valueOf(i).length();
/* 63 */            float f2 = this.I0000O;
/* 69 */            int length4 = String.valueOf(f2).length();
/* 73 */            int length5 = string2.length();
/* 77 */            int i2 = this.I0001Ioi1lo;
/* 83 */            int length6 = String.valueOf(i2).length();
/* 89 */            int i3 = this.I000II;
/* 95 */            int length7 = String.valueOf(i3).length();
/* 101 */           int i4 = this.I000O01llI0;
/* 107 */           int length8 = String.valueOf(i4).length();
/* 111 */           int length9 = strValueOf.length();
/* 117 */           boolean z = this.I000OiO;
/* 123 */           int length10 = String.valueOf(z).length();
/* 129 */           int i5 = this.I000iOII;
/* 135 */           int length11 = String.valueOf(i5).length();
/* 141 */           int i6 = this.I000l1;
/* 147 */           int length12 = String.valueOf(i6).length();
/* 153 */           int i7 = this.I000lI;
/* 159 */           int length13 = String.valueOf(i7).length();
/* 163 */           int length14 = strValueOf2.length();
/* 167 */           int length15 = strValueOf3.length();
/* 171 */           boolean z2 = this.I00100o1O0lo;
/* 257 */           StringBuilder sb = new StringBuilder(length + 34 + length2 + 7 + length3 + 7 + length4 + 17 + length5 + 23 + length6 + 23 + length7 + 13 + length8 + 20 + length9 + 26 + length10 + 22 + length11 + 23 + length12 + 87 + length13 + 90 + length14 + 20 + length15 + 17 + String.valueOf(z2).length() + 8 + string3.length() + 1);
/* 262 */           sb.append("LlmRequest{messages=");
/* 265 */           sb.append(string);
/* 270 */           sb.append(", temperature=");
/* 273 */           sb.append(f);
/* 278 */           sb.append(", topK=");
/* 281 */           sb.append(i);
/* 286 */           sb.append(", topP=");
/* 289 */           sb.append(f2);
/* 294 */           sb.append(", stopTokensList=");
/* 297 */           sb.append(string2);
/* 302 */           sb.append(", targetReplyLengthMin=");
/* 305 */           sb.append(i2);
/* 312 */           IIlIOloOOO.I001l0I00(sb, ", targetReplyLengthMax=", i3, ", numSamples=", i4);
/* 317 */           sb.append(", streamingCallback=");
/* 320 */           sb.append(strValueOf);
/* 325 */           sb.append(", shouldApplySafetyFilter=");
/* 328 */           sb.append(z);
/* 335 */           IIlIOloOOO.I001l0I00(sb, ", preferredImageWidth=", i5, ", preferredImageHeight=", i6);
/* 340 */           sb.append(", numSoftTokens=0, loraFile=null, drafterLoraFile=null, sessionStateFile=null, rngSeed=");
/* 343 */           sb.append(i7);
/* 348 */           sb.append(", userProperties=UserProperties{isMinorUser=false}, overrideRequestKind=0, llmPrefixParam=");
/* 351 */           sb.append(strValueOf2);
/* 356 */           sb.append(", llmResponseSchema=");
/* 361 */           sb.append(strValueOf3);
/* 366 */           sb.append(", enableThinking=");
/* 371 */           sb.append(z2);
/* 380 */           return IIlIOloOOO.I0010I0i(sb, ", tools=", string3, "}");
                }
            }
