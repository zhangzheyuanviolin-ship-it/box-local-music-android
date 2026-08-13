            package p000;

            import android.speech.tts.TextToSpeech;
            import android.util.Log;
            import android.view.ActionMode;
            import android.view.View;
            import com.box.gallery.R;
            import com.google.mlkit.genai.imagedescription.ImageDescriber;
            import com.google.mlkit.genai.proofreading.Proofreader;
            import com.google.mlkit.genai.rewriting.Rewriter;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.genai.summarization.Summarizer;
            import com.google.mlkit.vision.barcode.BarcodeScanner;
            import com.google.mlkit.vision.face.FaceDetector;
            import com.google.mlkit.vision.facemesh.FaceMeshDetector;
            import com.google.mlkit.vision.label.ImageLabeler;
            import com.google.mlkit.vision.pose.PoseDetector;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenter;
            import com.google.mlkit.vision.text.TextRecognizer;
            
            public final class I0IOIo0 implements IiiO1li1 {
                public final int I00000oIO;
                public Object I00000oOI;

                public I0IOIo0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void I00000oOI() throws Throwable {
                    switch (this.I00000oIO) {
                        case 0:
/* 372 */                   I0IO1iOI1 i0IO1iOI1 = ((I0IO1OIi) this.I00000oOI).I00000oIO;
/* 374 */                   if (i0IO1iOI1 == null) {
/* 382 */                       I000II.I001IO000("Launcher has not been initialized");
                                break;
                            } else {
/* 376 */                       i0IO1iOI1.I00000oOI();
                                break;
                            }
                        case 1:
/* 357 */                   Iii0oiil iii0oiil = (Iii0oiil) this.I00000oOI;
/* 359 */                   iii0oiil.dismiss();
/* 364 */                   iii0oiil.I00ioIO.I0000oI00();
                            break;
                        case 2:
/* 338 */                   OO1lio oO1lio = (OO1lio) this.I00000oOI;
/* 340 */                   oO1lio.I0000oI00();
/* 346 */                   oO1lio.setTag(R.id.view_tree_lifecycle_owner, null);
/* 351 */                   oO1lio.I00o0l1o1o0.removeViewImmediate(oO1lio);
                            break;
                        case 3:
/* 312 */                   I100OOIO0oio i100OOIO0oio = (I100OOIO0oio) this.I00000oOI;
/* 314 */                   Ol1olI0o1I01 ol1olI0o1I01 = i100OOIO0oio.I0000oI00;
/* 316 */                   I0IOIlIOIII i0IOIlIOIII = ol1olI0o1I01.I000O01llI0;
/* 318 */                   if (i0IOIlIOIII != null) {
/* 320 */                       i0IOIlIOIII.I000II();
                            }
/* 323 */                   ol1olI0o1I01.I00000oIO();
/* 326 */                   ActionMode actionMode = i100OOIO0oio.I000O01llI0;
/* 328 */                   if (actionMode != null) {
/* 330 */                       actionMode.finish();
                            }
/* 333 */                   i100OOIO0oio.I000O01llI0 = null;
                            break;
                        case 4:
/* 284 */                   I1o1Ii0I i1o1Ii0I = (I1o1Ii0I) this.I00000oOI;
/* 286 */                   i1o1Ii0I.getClass();
                            try {
/* 297 */                       ((SubjectSegmenter) i1o1Ii0I.I0000O.getValue()).close();
                                break;
                            } catch (Exception e) {
/* 306 */                       Log.e("BgRemover", "Cleanup error", e);
/* 309 */                       return;
                            }
                        case 5:
/* 274 */                   I1oilii10i i1oilii10i = (I1oilii10i) ((I1oiliiOol) this.I00000oOI).I0000Il00O.getValue();
/* 276 */                   if (i1oilii10i != null) {
/* 278 */                       i1oilii10i.close();
                                break;
                            }
                            break;
                        case 6:
/* 256 */                   IIoOoIol0Io0 iIoOoIol0Io0 = ((Oo1o1iil) this.I00000oOI).I0000Il00O;
/* 258 */                   if (iIoOoIol0Io0 != null) {
/* 260 */                       iIoOoIol0Io0.I0000O(null);
                                break;
                            }
                            break;
                        case 7:
/* 248 */                   ((Oo0IOoOi01) this.I00000oOI).I000lI();
                            break;
                        case 8:
/* 222 */                   Il1io01O0 il1io01O0 = (Il1io01O0) this.I00000oOI;
/* 224 */                   View view = il1io01O0.I00iiI;
/* 228 */                   if (il1io01O0.I00iOIl) {
/* 235 */                       view.getViewTreeObserver().removeOnGlobalLayoutListener(il1io01O0);
/* 238 */                       il1io01O0.I00iOIl = false;
                            }
/* 240 */                   view.removeOnAttachStateChangeListener(il1io01O0);
                            break;
                        case 9:
/* 216 */                   ((FaceDetector) this.I00000oOI).close();
                            break;
                        case 10:
/* 208 */                   ((FaceMeshDetector) this.I00000oOI).close();
                            break;
                        case 11:
/* 200 */                   ((ImageDescriber) this.I00000oOI).close();
                            break;
                        case 12:
/* 192 */                   ((ImageLabeler) this.I00000oOI).close();
                            break;
                        case 13:
/* 184 */                   ((PoseDetector) this.I00000oOI).close();
                            break;
                        case 14:
/* 176 */                   ((Proofreader) this.I00000oOI).close();
                            break;
                        case 15:
/* 168 */                   ((Rewriter) this.I00000oOI).close();
                            break;
                        case 16:
/* 160 */                   ((BarcodeScanner) this.I00000oOI).close();
                            break;
                        case 17:
/* 152 */                   ((TextRecognizer) this.I00000oOI).close();
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 144 */                   ((SpeechRecognizer) this.I00000oOI).close();
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 136 */                   ((Summarizer) this.I00000oOI).close();
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 129 */                   ((O0li1O) this.I00000oOI).I0000O = null;
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 114 */                   O0llioI1 o0llioI1 = (O0llioI1) this.I00000oOI;
/* 116 */                   I1ii1l10IO i1ii1l10IO = o0llioI1.I0000Il00O;
/* 118 */                   if (i1ii1l10IO != null) {
/* 120 */                       i1ii1l10IO.I00000oIO = false;
                            }
/* 122 */                   o0llioI1.I0000Il00O = null;
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 88 */                    O0ll1IIi o0ll1IIi = (O0ll1IIi) this.I00000oOI;
/* 91 */                    o0ll1IIi.I0001Ioi1lo = true;
/* 93 */                    o0ll1IIi.I0000O = 0;
/* 99 */                    o0ll1IIi.I00000oOI.I00iOIl.remove(o0ll1IIi);
/* 102 */                   O0ll1IIi o0ll1IIi2 = o0ll1IIi.I0000oI00;
/* 104 */                   if (o0ll1IIi2 != null) {
/* 106 */                       o0ll1IIi2.I00000oOI();
                            }
/* 109 */                   o0ll1IIi.I0000oI00 = null;
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 82 */                    ((TextToSpeech) this.I00000oOI).shutdown();
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 70 */                    android.speech.SpeechRecognizer speechRecognizer = (android.speech.SpeechRecognizer) this.I00000oOI;
/* 72 */                    if (speechRecognizer != null) {
/* 74 */                        speechRecognizer.destroy();
                                break;
                            }
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 64 */                    O1o10Iiio.I0001Ioi1lo(((O1o10Iiio) this.I00000oOI).I00000oOI, false);
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 47 */                    O1o1lI0I o1o1lI0I = (O1o1lI0I) this.I00000oOI;
/* 49 */                    o1o1lI0I.dismiss();
/* 54 */                    o1o1lI0I.I00l0I0l0lO1.I0000oI00();
                            break;
                        case 27:
/* 41 */                    ((Ii0l0Olio10) this.I00000oOI).I0000oI00.invoke(null);
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 22 */                    Oiill0lI1il1 oiill0lI1il1 = (Oiill0lI1il1) this.I00000oOI;
/* 24 */                    oiill0lI1il1.I000l1();
/* 31 */                    oiill0lI1il1.I00l0I0l0lO1.setValue(Boolean.FALSE);
                            break;
                        default:
/* 16 */                    ((TextToSpeech) ((OOo0ooi) this.I00000oOI).I00iOIl).shutdown();
                            break;
                    }
                }
            }
