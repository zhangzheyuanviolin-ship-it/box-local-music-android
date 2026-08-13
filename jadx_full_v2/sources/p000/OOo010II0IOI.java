            package p000;

            import android.R;
            import android.os.Bundle;
            import android.os.Handler;
            import android.text.TextUtils;
            import android.util.Log;
            import android.view.KeyEvent;
            import android.view.inputmethod.BaseInputConnection;
            import android.view.inputmethod.CompletionInfo;
            import android.view.inputmethod.CorrectionInfo;
            import android.view.inputmethod.ExtractedText;
            import android.view.inputmethod.ExtractedTextRequest;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputContentInfo;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            
            public final class OOo010II0IOI implements InputConnection {
                public Oi1ol0llI I00000oIO;
                public boolean I00000oOI;
                public int I0000Il00O;
                public Oo0OI01Il I0000O;
                public int I0000oI00;
                public boolean I0001Ioi1lo;
                public ArrayList I000II;
                public boolean I000O01llI0;

                public final void I00000oIO(Iioi1O iioi1O) {
                    this.I0000Il00O++;
                    try {
/* 9 */                 this.I000II.add(iioi1O);
                    } finally {
/* 17 */                I00000oOI();
                    }
                }

                public final boolean I00000oOI() {
/* 1 */             ArrayList arrayList = this.I000II;
                    int i = this.I0000Il00O - 1;
/* 7 */             this.I0000Il00O = i;
/* 9 */             if (i == 0 && !arrayList.isEmpty()) {
/* 30 */                ((Oo0Ooo1Oi) this.I00000oIO.I00iiI).I0000oI00.invoke(new ArrayList(arrayList));
/* 33 */                arrayList.clear();
                    }
                    return this.I0000Il00O > 0;
                }

                public final void I0000Il00O(int i) {
/* 7 */             sendKeyEvent(new KeyEvent(0, i));
/* 16 */            sendKeyEvent(new KeyEvent(1, i));
                }

                @Override
                public final boolean beginBatchEdit() {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (!z) {
/* 20 */                return z;
                    }
                    this.I0000Il00O++;
/* 7 */             return true;
                }

                @Override
                public final boolean clearMetaKeyStates(int i) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (z) {
/* 5 */                 return false;
                    }
/* 29 */            return z;
                }

                @Override
                public final void closeConnection() {
/* 3 */             this.I000II.clear();
/* 7 */             this.I0000Il00O = 0;
/* 9 */             this.I000O01llI0 = false;
/* 17 */            ArrayList arrayList = ((Oo0Ooo1Oi) this.I00000oIO.I00iiI).I000OOo1O;
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
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (z) {
/* 5 */                 return false;
                    }
/* 29 */            return z;
                }

                @Override
                public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (z) {
/* 5 */                 return false;
                    }
/* 98 */            return z;
                }

                @Override
                public final boolean commitCorrection(CorrectionInfo correctionInfo) {
/* 1 */             boolean z = this.I000O01llI0;
                    return z ? this.I00000oOI : z;
                }

                @Override
                public final boolean commitText(CharSequence charSequence, int i) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (z) {
/* 14 */                I00000oIO(new IOi0OoOOIlli(String.valueOf(charSequence), i));
                    }
/* 37 */            return z;
                }

                @Override
                public final boolean deleteSurroundingText(int i, int i2) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (!z) {
/* 37 */                return z;
                    }
/* 10 */            I00000oIO(new IiIo10oo1il(i, i2));
/* 13 */            return true;
                }

                @Override
                public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
/* 1 */             boolean z = this.I000O01llI0;
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
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (!z) {
/* 20 */                return z;
                    }
/* 10 */            I00000oIO(new IlIoI1iIOoO0());
/* 13 */            return true;
                }

                @Override
                public final int getCursorCapsMode(int i) {
/* 1 */             Oo0OI01Il oo0OI01Il = this.I0000O;
/* 13 */            return TextUtils.getCapsMode(oo0OI01Il.I00000oIO.I00iiI, Oo0lI00l.I000II(oo0OI01Il.I00000oOI), i);
                }

                @Override
                public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
/* 4 */             boolean z = (i & 1) != 0;
/* 8 */             this.I0001Ioi1lo = z;
/* 10 */            if (z) {
/* 16 */                this.I0000oI00 = extractedTextRequest != null ? extractedTextRequest.token : 0;
                    }
/* 20 */            return iooI10OI1O.I00000oIO(this.I0000O);
                }

                @Override
                public final Handler getHandler() {
/* 1 */             return null;
                }

                @Override
                public final CharSequence getSelectedText(int i) {
/* 9 */             if (Oo0lI00l.I0000O(this.I0000O.I00000oOI)) {
/* 11 */                return null;
                    }
/* 19 */            return lOlII1lolOiO.I00000oIO(this.I0000O).I00iiI;
                }

                @Override
                public final CharSequence getTextAfterCursor(int i, int i2) {
/* 7 */             return lOlII1lolOiO.I00000oOI(this.I0000O, i).I00iiI;
                }

                @Override
                public final CharSequence getTextBeforeCursor(int i, int i2) {
/* 7 */             return lOlII1lolOiO.I0000Il00O(this.I0000O, i).I00iiI;
                }

                @Override
                public final boolean performContextMenuAction(int i) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (z) {
/* 5 */                 z = false;
                        switch (i) {
                            case R.id.selectAll:
/* 43 */                        I00000oIO(new Oio0ilI1l(0, this.I0000O.I00000oIO.I00iiI.length()));
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
/* 1 */             boolean z = this.I000O01llI0;
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
/* 55 */                    ((Oo0Ooo1Oi) this.I00000oIO.I00iiI).I0001Ioi1lo.invoke(IoiiIoIo.I00000oIO(i2));
                        } else {
/* 30 */                    i2 = 1;
/* 55 */                    ((Oo0Ooo1Oi) this.I00000oIO.I00iiI).I0001Ioi1lo.invoke(IoiiIoIo.I00000oIO(i2));
                        }
                    }
/* 58 */            return z;
                }

                @Override
                public final boolean performPrivateCommand(String str, Bundle bundle) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (z) {
/* 5 */                 return true;
                    }
/* 37 */            return z;
                }

                @Override
                public final boolean reportFullscreenMode(boolean z) {
/* 1 */             return false;
                }

                @Override
                public final boolean requestCursorUpdates(int i) {
/* 1 */             boolean z = this.I000O01llI0;
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
/* 65 */            Ii0i1000 ii0i1000 = ((Oo0Ooo1Oi) this.I00000oIO.I00iiI).I000l1;
                    synchronized (ii0i1000.I0000Il00O) {
                        try {
/* 70 */                    ii0i1000.I0001Ioi1lo = z4;
/* 72 */                    ii0i1000.I000II = z5;
/* 74 */                    ii0i1000.I000O01llI0 = z6;
/* 76 */                    ii0i1000.I000OOo1O = z7;
/* 78 */                    if (z2) {
/* 80 */                        ii0i1000.I0000oI00 = true;
/* 84 */                        if (ii0i1000.I000OiO != null) {
/* 86 */                            ii0i1000.I00000oIO();
                                }
                            }
/* 92 */                    ii0i1000.I0000O = z3;
                        } catch (Throwable th) {
/* 97 */                    throw th;
                        }
                    }
/* 8 */             return true;
                }

                @Override
                public final boolean sendKeyEvent(KeyEvent keyEvent) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (!z) {
/* 29 */                return z;
                    }
/* 19 */            ((BaseInputConnection) ((Oo0Ooo1Oi) this.I00000oIO.I00iiI).I000OiO.getValue()).sendKeyEvent(keyEvent);
/* 22 */            return true;
                }

                @Override
                public final boolean setComposingRegion(int i, int i2) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (z) {
/* 10 */                I00000oIO(new Oiloo1i01(i, i2));
                    }
/* 37 */            return z;
                }

                @Override
                public final boolean setComposingText(CharSequence charSequence, int i) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (z) {
/* 14 */                I00000oIO(new OilooOiOolI1(String.valueOf(charSequence), i));
                    }
/* 37 */            return z;
                }

                @Override
                public final boolean setSelection(int i, int i2) {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             if (!z) {
/* 37 */                return z;
                    }
/* 10 */            I00000oIO(new Oio0ilI1l(i, i2));
/* 13 */            return true;
                }
            }
