            package p000;

            import android.os.Bundle;
            import android.os.CancellationSignal;
            import android.os.Handler;
            import android.view.KeyEvent;
            import android.view.inputmethod.CompletionInfo;
            import android.view.inputmethod.CorrectionInfo;
            import android.view.inputmethod.ExtractedText;
            import android.view.inputmethod.ExtractedTextRequest;
            import android.view.inputmethod.HandwritingGesture;
            import android.view.inputmethod.InputContentInfo;
            import android.view.inputmethod.PreviewableHandwritingGesture;
            import java.util.concurrent.Executor;
            import java.util.function.IntConsumer;
            
            public final class OIOOl1i101lO implements OIOOiOOI0oOi {
                public Iil1olo I00000oIO;
                public OOo010ill I00000oOI;

                @Override
                public final boolean beginBatchEdit() {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.beginBatchEdit();
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean clearMetaKeyStates(int i) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.clearMetaKeyStates(i);
                    }
/* 10 */            return false;
                }

                @Override
                public final void closeConnection() {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 if (oOo010ill != null) {
/* 7 */                     oOo010ill.closeConnection();
/* 11 */                    this.I00000oOI = null;
                        }
/* 15 */                this.I00000oIO.invoke(this);
                    }
                }

                @Override
                public final boolean commitCompletion(CompletionInfo completionInfo) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.commitCompletion(completionInfo);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.commitContent(inputContentInfo, i, bundle);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean commitCorrection(CorrectionInfo correctionInfo) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.commitCorrection(correctionInfo);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean commitText(CharSequence charSequence, int i) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.commitText(charSequence, i);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean deleteSurroundingText(int i, int i2) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.deleteSurroundingText(i, i2);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.deleteSurroundingTextInCodePoints(i, i2);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean endBatchEdit() {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.I00000oOI();
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean finishComposingText() {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.finishComposingText();
                    }
/* 10 */            return false;
                }

                @Override
                public final int getCursorCapsMode(int i) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.getCursorCapsMode(i);
                    }
/* 10 */            return 0;
                }

                @Override
                public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.getExtractedText(extractedTextRequest, i);
                    }
/* 10 */            return null;
                }

                @Override
                public final Handler getHandler() {
/* 1 */             return null;
                }

                @Override
                public final CharSequence getSelectedText(int i) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.getSelectedText(i);
                    }
/* 10 */            return null;
                }

                @Override
                public final CharSequence getTextAfterCursor(int i, int i2) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.getTextAfterCursor(i, i2);
                    }
/* 10 */            return null;
                }

                @Override
                public final CharSequence getTextBeforeCursor(int i, int i2) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.getTextBeforeCursor(i, i2);
                    }
/* 10 */            return null;
                }

                @Override
                public final boolean performContextMenuAction(int i) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.performContextMenuAction(i);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean performEditorAction(int i) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.performEditorAction(i);
                    }
/* 10 */            return false;
                }

                @Override
                public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 oOo010ill.performHandwritingGesture(handwritingGesture, executor, intConsumer);
                    }
                }

                @Override
                public final boolean performPrivateCommand(String str, Bundle bundle) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.performPrivateCommand(str, bundle);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean reportFullscreenMode(boolean z) {
/* 1 */             return false;
                }

                @Override
                public final boolean requestCursorUpdates(int i) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.requestCursorUpdates(i);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean sendKeyEvent(KeyEvent keyEvent) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.sendKeyEvent(keyEvent);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean setComposingRegion(int i, int i2) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.setComposingRegion(i, i2);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean setComposingText(CharSequence charSequence, int i) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.setComposingText(charSequence, i);
                    }
/* 10 */            return false;
                }

                @Override
                public final boolean setSelection(int i, int i2) {
/* 1 */             OOo010ill oOo010ill = this.I00000oOI;
/* 3 */             if (oOo010ill != null) {
/* 5 */                 return oOo010ill.setSelection(i, i2);
                    }
/* 10 */            return false;
                }
            }
