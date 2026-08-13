            package p000;

            import android.R;
            import android.os.Bundle;
            import android.os.CancellationSignal;
            import android.os.Handler;
            import android.text.TextUtils;
            import android.util.Log;
            import android.view.KeyEvent;
            import android.view.inputmethod.BaseInputConnection;
            import android.view.inputmethod.CompletionInfo;
            import android.view.inputmethod.CorrectionInfo;
            import android.view.inputmethod.DeleteGesture;
            import android.view.inputmethod.DeleteRangeGesture;
            import android.view.inputmethod.ExtractedText;
            import android.view.inputmethod.ExtractedTextRequest;
            import android.view.inputmethod.HandwritingGesture;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputContentInfo;
            import android.view.inputmethod.InsertGesture;
            import android.view.inputmethod.JoinOrSplitGesture;
            import android.view.inputmethod.PreviewableHandwritingGesture;
            import android.view.inputmethod.RemoveSpaceGesture;
            import android.view.inputmethod.SelectGesture;
            import android.view.inputmethod.SelectRangeGesture;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.concurrent.Executor;
            import java.util.function.IntConsumer;
            import java.util.regex.Pattern;
            
            public final class OOo010ill implements InputConnection {
                public O1OIll00i I00000oIO;
                public boolean I00000oOI;
                public O0oIlOolIO I0000Il00O;
                public Oo0IOoOi01 I0000O;
                public Oooii1o1 I0000oI00;
                public int I0001Ioi1lo;
                public Oo0OI01Il I000II;
                public int I000O01llI0;
                public boolean I000OOo1O;
                public ArrayList I000OiO;
                public boolean I000iOII;

                public final void I00000oIO(Iioi1O iioi1O) {
                    this.I0001Ioi1lo++;
                    try {
/* 9 */                 this.I000OiO.add(iioi1O);
                    } finally {
/* 17 */                I00000oOI();
                    }
                }

                public final boolean I00000oOI() {
/* 1 */             ArrayList arrayList = this.I000OiO;
                    int i = this.I0001Ioi1lo - 1;
/* 7 */             this.I0001Ioi1lo = i;
/* 9 */             if (i == 0 && !arrayList.isEmpty()) {
/* 30 */                ((O0oIo1) this.I00000oIO.I00iiI).I0000Il00O.invoke(new ArrayList(arrayList));
/* 33 */                arrayList.clear();
                    }
                    return this.I0001Ioi1lo > 0;
                }

                public final void I0000Il00O(int i) {
/* 7 */             sendKeyEvent(new KeyEvent(0, i));
/* 16 */            sendKeyEvent(new KeyEvent(1, i));
                }

                @Override
                public final boolean beginBatchEdit() {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (!z) {
/* 20 */                return z;
                    }
                    this.I0001Ioi1lo++;
/* 7 */             return true;
                }

                @Override
                public final boolean clearMetaKeyStates(int i) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (z) {
/* 5 */                 return false;
                    }
/* 29 */            return z;
                }

                @Override
                public final void closeConnection() {
/* 3 */             this.I000OiO.clear();
/* 7 */             this.I0001Ioi1lo = 0;
/* 9 */             this.I000iOII = false;
/* 17 */            ArrayList arrayList = ((O0oIo1) this.I00000oIO.I00iiI).I000OiO;
/* 19 */            int size = arrayList.size();
/* 23 */            for (int i = 0; i < size; i++) {
/* 39 */                if (O0000Ioio00.I0000O(((WeakReference) arrayList.get(i)).get(), this)) {
/* 41 */                    arrayList.remove(i);
/* 44 */                    return;
                        }
                    }
                }

                @Override
                public final boolean commitCompletion(CompletionInfo completionInfo) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (z) {
/* 5 */                 return false;
                    }
/* 29 */            return z;
                }

                @Override
                public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (z) {
/* 5 */                 return false;
                    }
/* 98 */            return z;
                }

                @Override
                public final boolean commitCorrection(CorrectionInfo correctionInfo) {
/* 1 */             boolean z = this.I000iOII;
                    return z ? this.I00000oOI : z;
                }

                @Override
                public final boolean commitText(CharSequence charSequence, int i) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (z) {
/* 14 */                I00000oIO(new IOi0OoOOIlli(String.valueOf(charSequence), i));
                    }
/* 37 */            return z;
                }

                @Override
                public final boolean deleteSurroundingText(int i, int i2) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (!z) {
/* 37 */                return z;
                    }
/* 10 */            I00000oIO(new IiIo10oo1il(i, i2));
/* 13 */            return true;
                }

                @Override
                public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (!z) {
/* 37 */                return z;
                    }
/* 10 */            I00000oIO(new IiIoi00ooIo(i, i2));
/* 13 */            return true;
                }

                @Override
                public final boolean endBatchEdit() {
/* 1 */             return I00000oOI();
                }

                @Override
                public final boolean finishComposingText() {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (!z) {
/* 20 */                return z;
                    }
/* 10 */            I00000oIO(new IlIoI1iIOoO0());
/* 13 */            return true;
                }

                @Override
                public final int getCursorCapsMode(int i) {
/* 1 */             Oo0OI01Il oo0OI01Il = this.I000II;
/* 13 */            return TextUtils.getCapsMode(oo0OI01Il.I00000oIO.I00iiI, Oo0lI00l.I000II(oo0OI01Il.I00000oOI), i);
                }

                @Override
                public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
/* 4 */             boolean z = (i & 1) != 0;
/* 8 */             this.I000OOo1O = z;
/* 10 */            if (z) {
/* 16 */                this.I000O01llI0 = extractedTextRequest != null ? extractedTextRequest.token : 0;
                    }
/* 20 */            return lIioo1OOlO.I00000oIO(this.I000II);
                }

                @Override
                public final Handler getHandler() {
/* 1 */             return null;
                }

                @Override
                public final CharSequence getSelectedText(int i) {
/* 9 */             if (Oo0lI00l.I0000O(this.I000II.I00000oOI)) {
/* 11 */                return null;
                    }
/* 19 */            return lOlII1lolOiO.I00000oIO(this.I000II).I00iiI;
                }

                @Override
                public final CharSequence getTextAfterCursor(int i, int i2) {
/* 7 */             return lOlII1lolOiO.I00000oOI(this.I000II, i).I00iiI;
                }

                @Override
                public final CharSequence getTextBeforeCursor(int i, int i2) {
/* 7 */             return lOlII1lolOiO.I0000Il00O(this.I000II, i).I00iiI;
                }

                @Override
                public final boolean performContextMenuAction(int i) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (z) {
/* 5 */                 z = false;
                        switch (i) {
                            case R.id.selectAll:
/* 43 */                        I00000oIO(new Oio0ilI1l(0, this.I000II.I00000oIO.I00iiI.length()));
                                break;
                            case R.id.cut:
/* 24 */                        I0000Il00O(277);
/* 5 */                         return false;
                            case R.id.copy:
/* 18 */                        I0000Il00O(278);
/* 5 */                         return false;
                            case R.id.paste:
/* 12 */                        I0000Il00O(279);
/* 5 */                         return false;
                            default:
/* 5 */                         return false;
                        }
                    }
/* 46 */            return z;
                }

                @Override
                public final boolean performEditorAction(int i) {
                    int i2;
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (z) {
/* 5 */                 z = true;
/* 6 */                 if (i != 0) {
                            switch (i) {
                                case 2:
/* 42 */                            i2 = 2;
                                    break;
                                case 3:
/* 40 */                            i2 = 3;
                                    break;
                                case 4:
/* 38 */                            i2 = 4;
                                    break;
                                case 5:
/* 36 */                            i2 = 6;
                                    break;
                                case 6:
/* 34 */                            i2 = 7;
                                    break;
                                case 7:
/* 32 */                            i2 = 5;
                                    break;
                                default:
/* 27 */                            Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
/* 30 */                            i2 = 1;
                                    break;
                            }
/* 55 */                    ((O0oIo1) this.I00000oIO.I00iiI).I0000O.invoke(IoiiIoIo.I00000oIO(i2));
                        } else {
/* 30 */                    i2 = 1;
/* 55 */                    ((O0oIo1) this.I00000oIO.I00iiI).I0000O.invoke(IoiiIoIo.I00000oIO(i2));
                        }
                    }
/* 58 */            return z;
                }

                /* JADX WARN: Removed duplicated region for block: B:127:0x0296  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
                    I1111OO10i i1111OO10i;
                    long jI000O01llI0;
                    int i;
                    int i2;
                    int i3;
                    String string;
                    int iI00000oOI;
                    Oo0il0olo1l oo0il0olo1lI0000O;
                    int iI00000oOI2;
                    Oo0il0olo1l oo0il0olo1lI0000O2;
                    Oo0iiO1 oo0iiO1;
/* 9 */             O0oIlOolIO o0oIlOolIO = this.I0000Il00O;
/* 11 */            Oo0IOoOi01 oo0IOoOi01 = this.I0000O;
/* 13 */            Oooii1o1 oooii1o1 = this.I0000oI00;
/* 19 */            OIoO1Ol oIoO1Ol = new OIoO1Ol(15);
/* 22 */            oIoO1Ol.I00iiI = this;
/* 24 */            VarHandle.storeStoreFence();
/* 28 */            int iI00000oIO = 3;
/* 29 */            if (o0oIlOolIO != null && (i1111OO10i = o0oIlOolIO.I000OiO) != null) {
/* 37 */                Oo0il0olo1l oo0il0olo1lI0000O3 = o0oIlOolIO.I0000O();
/* 58 */                if (i1111OO10i.equals((oo0il0olo1lI0000O3 == null || (oo0iiO1 = oo0il0olo1lI0000O3.I00000oIO.I00000oIO) == null) ? null : oo0iiO1.I00000oIO)) {
/* 72 */                    if (handwritingGesture instanceof SelectGesture) {
/* 74 */                        SelectGesture selectGesture = (SelectGesture) handwritingGesture;
/* 92 */                        long jI0000Il00O = illiOoIi.I0000Il00O(o0oIlOolIO, lIiool1i00.I0000O(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
/* 100 */                       if (Oo0lI00l.I0000O(jI0000Il00O)) {
/* 102 */                           iI00000oIO = illOi10o.I00000oIO(selectGesture, oIoO1Ol);
                                } else {
/* 118 */                           oIoO1Ol.invoke(new Oio0ilI1l((int) (jI0000Il00O >> 32), (int) (jI0000Il00O & 4294967295L)));
/* 121 */                           if (oo0IOoOi01 != null) {
/* 123 */                               oo0IOoOi01.I0000oI00(true);
                                    }
/* 126 */                           iI00000oIO = 1;
                                }
                            } else if (handwritingGesture instanceof DeleteGesture) {
/* 133 */                       DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
/* 143 */                       int i4 = deleteGesture.getGranularity() != 1 ? 0 : 1;
/* 152 */                       long jI0000Il00O2 = illiOoIi.I0000Il00O(o0oIlOolIO, lIiool1i00.I0000O(deleteGesture.getDeletionArea()), i4);
/* 160 */                       if (Oo0lI00l.I0000O(jI0000Il00O2)) {
/* 162 */                           iI00000oIO = illOi10o.I00000oIO(deleteGesture, oIoO1Ol);
                                } else {
/* 171 */                           illOi10o.I00000oOI(jI0000Il00O2, i1111OO10i, i4 == 1, oIoO1Ol);
/* 126 */                           iI00000oIO = 1;
                                }
                            } else if (handwritingGesture instanceof SelectRangeGesture) {
/* 179 */                       SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
/* 205 */                       long jI0000O = illiOoIi.I0000O(o0oIlOolIO, lIiool1i00.I0000O(selectRangeGesture.getSelectionStartArea()), lIiool1i00.I0000O(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
/* 213 */                       if (Oo0lI00l.I0000O(jI0000O)) {
/* 215 */                           iI00000oIO = illOi10o.I00000oIO(selectRangeGesture, oIoO1Ol);
                                } else {
/* 231 */                           oIoO1Ol.invoke(new Oio0ilI1l((int) (jI0000O >> 32), (int) (jI0000O & 4294967295L)));
/* 234 */                           if (oo0IOoOi01 != null) {
/* 236 */                               oo0IOoOi01.I0000oI00(true);
                                    }
/* 126 */                           iI00000oIO = 1;
                                }
                            } else if (handwritingGesture instanceof DeleteRangeGesture) {
/* 244 */                       DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
/* 254 */                       int i5 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
/* 271 */                       long jI0000O2 = illiOoIi.I0000O(o0oIlOolIO, lIiool1i00.I0000O(deleteRangeGesture.getDeletionStartArea()), lIiool1i00.I0000O(deleteRangeGesture.getDeletionEndArea()), i5);
/* 279 */                       if (Oo0lI00l.I0000O(jI0000O2)) {
/* 281 */                           iI00000oIO = illOi10o.I00000oIO(deleteRangeGesture, oIoO1Ol);
                                } else {
/* 290 */                           illOi10o.I00000oOI(jI0000O2, i1111OO10i, i5 == 1, oIoO1Ol);
/* 126 */                           iI00000oIO = 1;
                                }
                            } else {
/* 297 */                       iI00000oIO = 2;
/* 299 */                       if (handwritingGesture instanceof JoinOrSplitGesture) {
/* 301 */                           JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
/* 303 */                           if (oooii1o1 == null || (iI00000oOI2 = illiOoIi.I00000oOI(o0oIlOolIO, illiOoIi.I000OOo1O(joinOrSplitGesture.getJoinOrSplitPoint()), oooii1o1)) == -1 || ((oo0il0olo1lI0000O2 = o0oIlOolIO.I0000O()) != null && illiOoIi.I0000oI00(oo0il0olo1lI0000O2.I00000oIO, iI00000oOI2))) {
/* 438 */                               iI00000oIO = illOi10o.I00000oIO(joinOrSplitGesture, oIoO1Ol);
                                    } else {
/* 342 */                               int iCharCount = iI00000oOI2;
/* 343 */                               while (iCharCount > 0) {
/* 345 */                                   int iCodePointBefore = Character.codePointBefore(i1111OO10i, iCharCount);
/* 353 */                                   if (!illiOoIi.I000II(iCodePointBefore)) {
                                                break;
                                            } else {
/* 360 */                                       iCharCount -= Character.charCount(iCodePointBefore);
                                            }
                                        }
/* 368 */                               while (iI00000oOI2 < i1111OO10i.I00iiI.length()) {
/* 370 */                                   int iCodePointAt = Character.codePointAt(i1111OO10i, iI00000oOI2);
/* 378 */                                   if (!illiOoIi.I000II(iCodePointAt)) {
                                                break;
                                            } else {
/* 385 */                                       iI00000oOI2 += Character.charCount(iCodePointAt);
                                            }
                                        }
/* 387 */                               long jI00000oIO = lOliOi0Oi.I00000oIO(iCharCount, iI00000oOI2);
/* 395 */                               if (Oo0lI00l.I0000O(jI00000oIO)) {
/* 399 */                                   int i6 = (int) (jI00000oIO >> 32);
/* 412 */                                   Iioi1O[] iioi1OArr = {new Oio0ilI1l(i6, i6), new IOi0OoOOIlli(" ", 1)};
/* 420 */                                   Io1I0O io1I0O = new Io1I0O();
/* 423 */                                   io1I0O.I00000oIO = iioi1OArr;
/* 425 */                                   VarHandle.storeStoreFence();
/* 428 */                                   oIoO1Ol.invoke(io1I0O);
                                        } else {
/* 433 */                                   illOi10o.I00000oOI(jI00000oIO, i1111OO10i, false, oIoO1Ol);
                                        }
/* 126 */                               iI00000oIO = 1;
                                    }
                                } else if (handwritingGesture instanceof InsertGesture) {
/* 450 */                           InsertGesture insertGesture = (InsertGesture) handwritingGesture;
/* 452 */                           if (oooii1o1 == null || (iI00000oOI = illiOoIi.I00000oOI(o0oIlOolIO, illiOoIi.I000OOo1O(insertGesture.getInsertionPoint()), oooii1o1)) == -1 || ((oo0il0olo1lI0000O = o0oIlOolIO.I0000O()) != null && illiOoIi.I0000oI00(oo0il0olo1lI0000O.I00000oIO, iI00000oOI))) {
/* 524 */                               iI00000oIO = illOi10o.I00000oIO(insertGesture, oIoO1Ol);
                                    } else {
/* 503 */                               Iioi1O[] iioi1OArr2 = {new Oio0ilI1l(iI00000oOI, iI00000oOI), new IOi0OoOOIlli(insertGesture.getTextToInsert(), 1)};
/* 511 */                               Io1I0O io1I0O2 = new Io1I0O();
/* 514 */                               io1I0O2.I00000oIO = iioi1OArr2;
/* 516 */                               VarHandle.storeStoreFence();
/* 519 */                               oIoO1Ol.invoke(io1I0O2);
/* 126 */                               iI00000oIO = 1;
                                    }
                                } else if (handwritingGesture instanceof RemoveSpaceGesture) {
/* 534 */                           RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
/* 536 */                           Oo0il0olo1l oo0il0olo1lI0000O4 = o0oIlOolIO.I0000O();
/* 542 */                           Oo0iil0o0oI oo0iil0o0oI = oo0il0olo1lI0000O4 != null ? oo0il0olo1lI0000O4.I00000oIO : null;
/* 548 */                           long jI000OOo1O = illiOoIi.I000OOo1O(removeSpaceGesture.getStartPoint());
/* 557 */                           long jI000OOo1O2 = illiOoIi.I000OOo1O(removeSpaceGesture.getEndPoint());
/* 561 */                           O0iOOo0Ii o0iOOo0IiI0000Il00O = o0oIlOolIO.I0000Il00O();
/* 565 */                           if (oo0iil0o0oI != null) {
/* 567 */                               OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 569 */                               if (o0iOOo0IiI0000Il00O == null) {
/* 663 */                                   jI000O01llI0 = Oo0lI00l.I00000oOI;
                                        } else {
/* 572 */                                   long jI00IoO0 = o0iOOo0IiI0000Il00O.I00IoO0(jI000OOo1O);
/* 576 */                                   long jI00IoO02 = o0iOOo0IiI0000Il00O.I00IoO0(jI000OOo1O2);
/* 580 */                                   int iI00000oIO2 = illiOoIi.I00000oIO(oI0OIIiOi, jI00IoO0, oooii1o1);
/* 584 */                                   int iI00000oIO3 = illiOoIi.I00000oIO(oI0OIIiOi, jI00IoO02, oooii1o1);
/* 588 */                                   if (iI00000oIO2 != -1) {
/* 595 */                                       if (iI00000oIO3 != -1) {
/* 598 */                                           iI00000oIO2 = Math.min(iI00000oIO2, iI00000oIO3);
                                                }
/* 602 */                                       iI00000oIO3 = iI00000oIO2;
                                            } else if (iI00000oIO3 == -1) {
/* 592 */                                       jI000O01llI0 = Oo0lI00l.I00000oOI;
                                            }
/* 614 */                                   float fI00000oOI = (oI0OIIiOi.I00000oOI(iI00000oIO3) + oI0OIIiOi.I0001Ioi1lo(iI00000oIO3)) / 2.0f;
/* 619 */                                   int i7 = (int) (jI00IoO0 >> 32);
/* 626 */                                   int i8 = (int) (jI00IoO02 >> 32);
/* 658 */                                   jI000O01llI0 = oI0OIIiOi.I000O01llI0(new OOo0IO(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), fI00000oOI - 0.1f, Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), fI00000oOI + 0.1f), 0, iolOOiI.I00io1l);
                                        }
/* 669 */                               if (Oo0lI00l.I0000O(jI000O01llI0)) {
/* 671 */                                   iI00000oIO = illOi10o.I00000oIO(removeSpaceGesture, oIoO1Ol);
                                        } else {
/* 689 */                                   String str = i1111OO10i.subSequence(Oo0lI00l.I000II(jI000O01llI0), Oo0lI00l.I0001Ioi1lo(jI000O01llI0)).I00iiI;
/* 701 */                                   O1OlOOioiI o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(Pattern.compile("\\s+").matcher(str), 0, str);
/* 705 */                                   if (o1OlOOioiII00000oIO == null) {
/* 707 */                                       string = str.toString();
/* 711 */                                       i2 = -1;
/* 712 */                                       i = -1;
                                            } else {
/* 714 */                                       int length = str.length();
/* 720 */                                       StringBuilder sb = new StringBuilder(length);
/* 723 */                                       int i9 = 0;
/* 724 */                                       i = -1;
                                                while (true) {
/* 731 */                                           sb.append((CharSequence) str, i9, o1OlOOioiII00000oIO.I00000oOI().I00iOIl);
/* 734 */                                           if (i == -1) {
/* 740 */                                               i = o1OlOOioiII00000oIO.I00000oOI().I00iOIl;
                                                    }
/* 748 */                                           i2 = o1OlOOioiII00000oIO.I00000oOI().I00iiI + 1;
/* 751 */                                           sb.append((CharSequence) "");
/* 760 */                                           i3 = o1OlOOioiII00000oIO.I00000oOI().I00iiI + 1;
/* 761 */                                           o1OlOOioiII00000oIO = o1OlOOioiII00000oIO.I0000Il00O();
/* 765 */                                           if (i3 >= length || o1OlOOioiII00000oIO == null) {
                                                        break;
                                                    } else {
/* 770 */                                               i9 = i3;
                                                    }
                                                }
/* 772 */                                       if (i3 < length) {
/* 774 */                                           sb.append((CharSequence) str, i3, length);
                                                }
/* 777 */                                       string = sb.toString();
                                            }
/* 781 */                                   if (i == -1 || i2 == -1) {
/* 838 */                                       iI00000oIO = illOi10o.I00000oIO(removeSpaceGesture, oIoO1Ol);
                                            } else {
/* 788 */                                       int i10 = (int) (jI000O01llI0 >> 32);
/* 817 */                                       Iioi1O[] iioi1OArr3 = {new Oio0ilI1l(i10 + i, i10 + i2), new IOi0OoOOIlli(string.substring(i, string.length() - (Oo0lI00l.I0000oI00(jI000O01llI0) - i2)), 1)};
/* 825 */                                       Io1I0O io1I0O3 = new Io1I0O();
/* 828 */                                       io1I0O3.I00000oIO = iioi1OArr3;
/* 830 */                                       VarHandle.storeStoreFence();
/* 833 */                                       oIoO1Ol.invoke(io1I0O3);
/* 126 */                                       iI00000oIO = 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 844 */           if (intConsumer == null) {
/* 846 */               return;
                    }
/* 847 */           if (executor == null) {
/* 865 */               intConsumer.accept(iI00000oIO);
/* 1638 */              return;
                    }
/* 851 */           I1010Iil i1010Iil = new I1010Iil(1);
/* 854 */           i1010Iil.I00iiO = intConsumer;
/* 856 */           i1010Iil.I00iiI = iI00000oIO;
/* 858 */           VarHandle.storeStoreFence();
/* 861 */           executor.execute(i1010Iil);
                }

                @Override
                public final boolean performPrivateCommand(String str, Bundle bundle) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (z) {
/* 5 */                 return true;
                    }
/* 37 */            return z;
                }

                @Override
                public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
                    I1111OO10i i1111OO10i;
                    Oo0iiO1 oo0iiO1;
/* 1 */             O0oIlOolIO o0oIlOolIO = this.I0000Il00O;
/* 3 */             Oo0IOoOi01 oo0IOoOi01 = this.I0000O;
/* 6 */             if (o0oIlOolIO != null && (i1111OO10i = o0oIlOolIO.I000OiO) != null) {
/* 14 */                Oo0il0olo1l oo0il0olo1lI0000O = o0oIlOolIO.I0000O();
/* 34 */                if (i1111OO10i.equals((oo0il0olo1lI0000O == null || (oo0iiO1 = oo0il0olo1lI0000O.I00000oIO.I00000oIO) == null) ? null : oo0iiO1.I00000oIO)) {
/* 40 */                    int i = 1;
/* 41 */                    if (previewableHandwritingGesture instanceof SelectGesture) {
/* 43 */                        SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
/* 45 */                        if (oo0IOoOi01 != null) {
/* 64 */                            long jI0000Il00O = illiOoIi.I0000Il00O(o0oIlOolIO, lIiool1i00.I0000O(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
/* 68 */                            O0oIlOolIO o0oIlOolIO2 = oo0IOoOi01.I0000O;
/* 70 */                            if (o0oIlOolIO2 != null) {
/* 78 */                                o0oIlOolIO2.I001lIiIIo1O.setValue(Oo0lI00l.I00000oIO(jI0000Il00O));
                                    }
/* 81 */                            O0oIlOolIO o0oIlOolIO3 = oo0IOoOi01.I0000O;
/* 83 */                            if (o0oIlOolIO3 != null) {
/* 93 */                                o0oIlOolIO3.I001lllioOl.setValue(Oo0lI00l.I00000oIO(Oo0lI00l.I00000oOI));
                                    }
/* 100 */                           if (!Oo0lI00l.I0000O(jI0000Il00O)) {
/* 102 */                               oo0IOoOi01.I001IIilI0O(false);
/* 107 */                               oo0IOoOi01.I0010I0i(Io11Oo11oO.I00iOIl);
                                    }
                                }
                            } else if (previewableHandwritingGesture instanceof DeleteGesture) {
/* 116 */                       DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
/* 118 */                       if (oo0IOoOi01 != null) {
/* 137 */                           long jI0000Il00O2 = illiOoIi.I0000Il00O(o0oIlOolIO, lIiool1i00.I0000O(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
/* 141 */                           O0oIlOolIO o0oIlOolIO4 = oo0IOoOi01.I0000O;
/* 143 */                           if (o0oIlOolIO4 != null) {
/* 151 */                               o0oIlOolIO4.I001lllioOl.setValue(Oo0lI00l.I00000oIO(jI0000Il00O2));
                                    }
/* 154 */                           O0oIlOolIO o0oIlOolIO5 = oo0IOoOi01.I0000O;
/* 156 */                           if (o0oIlOolIO5 != null) {
/* 166 */                               o0oIlOolIO5.I001lIiIIo1O.setValue(Oo0lI00l.I00000oIO(Oo0lI00l.I00000oOI));
                                    }
/* 173 */                           if (!Oo0lI00l.I0000O(jI0000Il00O2)) {
/* 175 */                               oo0IOoOi01.I001IIilI0O(false);
/* 180 */                               oo0IOoOi01.I0010I0i(Io11Oo11oO.I00iOIl);
                                    }
                                }
                            } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
/* 189 */                       SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
/* 191 */                       if (oo0IOoOi01 != null) {
/* 218 */                           long jI0000O = illiOoIi.I0000O(o0oIlOolIO, lIiool1i00.I0000O(selectRangeGesture.getSelectionStartArea()), lIiool1i00.I0000O(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
/* 222 */                           O0oIlOolIO o0oIlOolIO6 = oo0IOoOi01.I0000O;
/* 224 */                           if (o0oIlOolIO6 != null) {
/* 232 */                               o0oIlOolIO6.I001lIiIIo1O.setValue(Oo0lI00l.I00000oIO(jI0000O));
                                    }
/* 235 */                           O0oIlOolIO o0oIlOolIO7 = oo0IOoOi01.I0000O;
/* 237 */                           if (o0oIlOolIO7 != null) {
/* 247 */                               o0oIlOolIO7.I001lllioOl.setValue(Oo0lI00l.I00000oIO(Oo0lI00l.I00000oOI));
                                    }
/* 254 */                           if (!Oo0lI00l.I0000O(jI0000O)) {
/* 256 */                               oo0IOoOi01.I001IIilI0O(false);
/* 261 */                               oo0IOoOi01.I0010I0i(Io11Oo11oO.I00iOIl);
                                    }
                                }
                            } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
/* 269 */                       DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
/* 271 */                       if (oo0IOoOi01 != null) {
/* 298 */                           long jI0000O2 = illiOoIi.I0000O(o0oIlOolIO, lIiool1i00.I0000O(deleteRangeGesture.getDeletionStartArea()), lIiool1i00.I0000O(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
/* 302 */                           O0oIlOolIO o0oIlOolIO8 = oo0IOoOi01.I0000O;
/* 304 */                           if (o0oIlOolIO8 != null) {
/* 312 */                               o0oIlOolIO8.I001lllioOl.setValue(Oo0lI00l.I00000oIO(jI0000O2));
                                    }
/* 315 */                           O0oIlOolIO o0oIlOolIO9 = oo0IOoOi01.I0000O;
/* 317 */                           if (o0oIlOolIO9 != null) {
/* 327 */                               o0oIlOolIO9.I001lIiIIo1O.setValue(Oo0lI00l.I00000oIO(Oo0lI00l.I00000oOI));
                                    }
/* 334 */                           if (!Oo0lI00l.I0000O(jI0000O2)) {
/* 336 */                               oo0IOoOi01.I001IIilI0O(false);
/* 341 */                               oo0IOoOi01.I0010I0i(Io11Oo11oO.I00iOIl);
                                    }
                                }
                            }
/* 344 */                   if (cancellationSignal != null) {
/* 348 */                       IOl0iil0l iOl0iil0l = new IOl0iil0l(i);
/* 351 */                       iOl0iil0l.I00000oOI = oo0IOoOi01;
/* 353 */                       VarHandle.storeStoreFence();
/* 356 */                       cancellationSignal.setOnCancelListener(iOl0iil0l);
                            }
/* 40 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final boolean reportFullscreenMode(boolean z) {
/* 1 */             return false;
                }

                @Override
                public final boolean requestCursorUpdates(int i) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (!z) {
/* 168 */               return z;
                    }
/* 13 */            boolean z2 = (i & 1) != 0;
/* 20 */            boolean z3 = (i & 2) != 0;
/* 27 */            boolean z4 = (i & 16) != 0;
/* 34 */            boolean z5 = (i & 8) != 0;
/* 41 */            boolean z6 = (i & 4) != 0;
/* 44 */            boolean z7 = (i & 32) != 0;
/* 47 */            if (!z4 && !z5 && !z6 && !z7) {
/* 55 */                z7 = true;
/* 56 */                z4 = true;
/* 57 */                z5 = true;
/* 58 */                z6 = true;
                    }
/* 65 */            O0oIIi o0oIIi = ((O0oIo1) this.I00000oIO.I00iiI).I000lI;
                    synchronized (o0oIIi.I0000Il00O) {
                        try {
/* 70 */                    o0oIIi.I0001Ioi1lo = z4;
/* 72 */                    o0oIIi.I000II = z5;
/* 74 */                    o0oIIi.I000O01llI0 = z6;
/* 76 */                    o0oIIi.I000OOo1O = z7;
/* 78 */                    if (z2) {
/* 80 */                        o0oIIi.I0000oI00 = true;
/* 84 */                        if (o0oIIi.I000OiO != null) {
/* 86 */                            o0oIIi.I00000oIO();
                                }
                            }
/* 92 */                    o0oIIi.I0000O = z3;
                        } catch (Throwable th) {
/* 97 */                    throw th;
                        }
                    }
/* 8 */             return true;
                }

                @Override
                public final boolean sendKeyEvent(KeyEvent keyEvent) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (!z) {
/* 29 */                return z;
                    }
/* 19 */            ((BaseInputConnection) ((O0oIo1) this.I00000oIO.I00iiI).I000iOII.getValue()).sendKeyEvent(keyEvent);
/* 22 */            return true;
                }

                @Override
                public final boolean setComposingRegion(int i, int i2) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (z) {
/* 10 */                I00000oIO(new Oiloo1i01(i, i2));
                    }
/* 37 */            return z;
                }

                @Override
                public final boolean setComposingText(CharSequence charSequence, int i) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (z) {
/* 14 */                I00000oIO(new OilooOiOolI1(String.valueOf(charSequence), i));
                    }
/* 37 */            return z;
                }

                @Override
                public final boolean setSelection(int i, int i2) {
/* 1 */             boolean z = this.I000iOII;
/* 3 */             if (!z) {
/* 37 */                return z;
                    }
/* 10 */            I00000oIO(new Oio0ilI1l(i, i2));
/* 13 */            return true;
                }
            }
