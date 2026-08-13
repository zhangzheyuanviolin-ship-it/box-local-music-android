            package p000;

            import android.graphics.Canvas;
            import android.graphics.RecordingCanvas;
            import android.graphics.RenderNode;
            import android.widget.EdgeEffect;
            
            public final class OlOl100 extends IiIioO0ol1oI implements Iillo1il11l {
                public I0o1iIoolIi I00o101lO;
                public IioO1oi1li I00oI0i;
                public RenderNode I00oII;

                public static boolean I010o0o0oO(float f, EdgeEffect edgeEffect, Canvas canvas) {
/* 4 */             if (f == 0.0f) {
/* 6 */                 return edgeEffect.draw(canvas);
                    }
/* 11 */            int iSave = canvas.save();
/* 15 */            canvas.rotate(f);
/* 18 */            boolean zDraw = edgeEffect.draw(canvas);
/* 22 */            canvas.restoreToCount(iSave);
/* 98 */            return zDraw;
                }

                @Override
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) {
                    long j;
                    char c;
                    long j2;
                    boolean zI010o0o0oO;
                    float f;
                    float f2;
                    float distance;
                    float distance2;
                    float distance3;
                    float distance4;
/* 5 */             IioO1oi1li iioO1oi1li = this.I00oI0i;
/* 7 */             I0o1iIoolIi i0o1iIoolIi = this.I00o101lO;
/* 9 */             IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 11 */            long jI0000oI00 = iIolilIo.I0000oI00();
/* 19 */            boolean zI00000oOI = Ol0i1I.I00000oOI(i0o1iIoolIi.I000II, 0L);
/* 25 */            boolean zI00000oOI2 = Ol0i1I.I00000oOI(jI0000oI00, i0o1iIoolIi.I000II);
/* 29 */            i0o1iIoolIi.I000II = jI0000oI00;
/* 38 */            if (zI00000oOI2) {
/* 177 */               j = 4294967295L;
                    } else {
/* 40 */                IioO1oi1li iioO1oi1li2 = i0o1iIoolIi.I0000Il00O;
/* 67 */                long jI000II = (O1OooO0IlOo.I000II(Float.intBitsToFloat((int) (jI0000oI00 & 4294967295L))) & 4294967295L) | (O1OooO0IlOo.I000II(Float.intBitsToFloat((int) (jI0000oI00 >> 32))) << 32);
/* 68 */                iioO1oi1li2.I0000Il00O = jI000II;
/* 70 */                EdgeEffect edgeEffect = iioO1oi1li2.I0000O;
/* 72 */                if (edgeEffect != null) {
/* 77 */                    j = 4294967295L;
/* 81 */                    edgeEffect.setSize((int) (jI000II >> 32), (int) (jI000II & 4294967295L));
                        } else {
/* 85 */                    j = 4294967295L;
                        }
/* 86 */                EdgeEffect edgeEffect2 = iioO1oi1li2.I0000oI00;
/* 88 */                if (edgeEffect2 != null) {
/* 96 */                    edgeEffect2.setSize((int) (jI000II >> 32), (int) (jI000II & j));
                        }
/* 99 */                EdgeEffect edgeEffect3 = iioO1oi1li2.I0001Ioi1lo;
/* 101 */               if (edgeEffect3 != null) {
/* 109 */                   edgeEffect3.setSize((int) (jI000II & j), (int) (jI000II >> 32));
                        }
/* 112 */               EdgeEffect edgeEffect4 = iioO1oi1li2.I000II;
/* 114 */               if (edgeEffect4 != null) {
/* 122 */                   edgeEffect4.setSize((int) (jI000II & j), (int) (jI000II >> 32));
                        }
/* 125 */               EdgeEffect edgeEffect5 = iioO1oi1li2.I000O01llI0;
/* 127 */               if (edgeEffect5 != null) {
/* 135 */                   edgeEffect5.setSize((int) (jI000II >> 32), (int) (jI000II & j));
                        }
/* 138 */               EdgeEffect edgeEffect6 = iioO1oi1li2.I000OOo1O;
/* 140 */               if (edgeEffect6 != null) {
/* 148 */                   edgeEffect6.setSize((int) (jI000II >> 32), (int) (jI000II & j));
                        }
/* 151 */               EdgeEffect edgeEffect7 = iioO1oi1li2.I000OiO;
/* 153 */               if (edgeEffect7 != null) {
/* 161 */                   edgeEffect7.setSize((int) (jI000II & j), (int) (jI000II >> 32));
                        }
/* 164 */               EdgeEffect edgeEffect8 = iioO1oi1li2.I000iOII;
/* 166 */               if (edgeEffect8 != null) {
/* 173 */                   edgeEffect8.setSize((int) (jI000II & j), (int) (jI000II >> 32));
                        }
                    }
/* 178 */           if (!zI00000oOI && !zI00000oOI2) {
/* 182 */               i0o1iIoolIi.I00000oIO();
                    }
/* 187 */           IIolOo iIolOoI0010o = iIolilIo.I00iiI.I0010o();
/* 191 */           Canvas canvas = I0lO01i00oi.I00000oIO;
/* 195 */           Canvas canvas2 = ((I0lIooIo1) iIolOoI0010o).I00000oIO;
/* 199 */           i0o1iIoolIi.I0000O.getValue();
/* 210 */           if (Ol0i1I.I0001Ioi1lo(iIolilIo.I0000oI00())) {
/* 212 */               o0iiliOio.I00000oOI();
/* 215 */               return;
                    }
/* 220 */           if (!canvas2.isHardwareAccelerated()) {
/* 222 */               EdgeEffect edgeEffect9 = iioO1oi1li.I0000O;
/* 224 */               if (edgeEffect9 != null) {
/* 226 */                   edgeEffect9.finish();
                        }
/* 229 */               EdgeEffect edgeEffect10 = iioO1oi1li.I0000oI00;
/* 231 */               if (edgeEffect10 != null) {
/* 233 */                   edgeEffect10.finish();
                        }
/* 236 */               EdgeEffect edgeEffect11 = iioO1oi1li.I0001Ioi1lo;
/* 238 */               if (edgeEffect11 != null) {
/* 240 */                   edgeEffect11.finish();
                        }
/* 243 */               EdgeEffect edgeEffect12 = iioO1oi1li.I000II;
/* 245 */               if (edgeEffect12 != null) {
/* 247 */                   edgeEffect12.finish();
                        }
/* 250 */               EdgeEffect edgeEffect13 = iioO1oi1li.I000O01llI0;
/* 252 */               if (edgeEffect13 != null) {
/* 254 */                   edgeEffect13.finish();
                        }
/* 257 */               EdgeEffect edgeEffect14 = iioO1oi1li.I000OOo1O;
/* 259 */               if (edgeEffect14 != null) {
/* 261 */                   edgeEffect14.finish();
                        }
/* 264 */               EdgeEffect edgeEffect15 = iioO1oi1li.I000OiO;
/* 266 */               if (edgeEffect15 != null) {
/* 268 */                   edgeEffect15.finish();
                        }
/* 271 */               EdgeEffect edgeEffect16 = iioO1oi1li.I000iOII;
/* 273 */               if (edgeEffect16 != null) {
/* 275 */                   edgeEffect16.finish();
                        }
/* 278 */               o0iiliOio.I00000oOI();
/* 281 */               return;
                    }
/* 284 */           float fI00i0ilIl0i = o0iiliOio.I00i0ilIl0i(30.0f);
/* 324 */           boolean z = IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0000O) || IioO1oi1li.I000II(iioO1oi1li.I000O01llI0) || IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0000oI00) || IioO1oi1li.I000II(iioO1oi1li.I000OOo1O);
/* 360 */           boolean z2 = IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0001Ioi1lo) || IioO1oi1li.I000II(iioO1oi1li.I000OiO) || IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I000II) || IioO1oi1li.I000II(iioO1oi1li.I000iOII);
/* 361 */           if (z && z2) {
/* 377 */               I010oio1OO0().setPosition(0, 0, canvas2.getWidth(), canvas2.getHeight());
                    } else if (z) {
/* 402 */               I010oio1OO0().setPosition(0, 0, (O1OooO0IlOo.I000II(fI00i0ilIl0i) * 2) + canvas2.getWidth(), canvas2.getHeight());
                    } else {
/* 406 */               if (!z2) {
/* 1029 */                  o0iiliOio.I00000oOI();
/* 1261 */                  return;
                        }
/* 428 */               I010oio1OO0().setPosition(0, 0, canvas2.getWidth(), (O1OooO0IlOo.I000II(fI00i0ilIl0i) * 2) + canvas2.getHeight());
                    }
/* 435 */           RecordingCanvas recordingCanvasBeginRecording = I010oio1OO0().beginRecording();
/* 447 */           if (IioO1oi1li.I000II(iioO1oi1li.I000OiO)) {
/* 449 */               EdgeEffect edgeEffectI00000oIO = iioO1oi1li.I000OiO;
/* 451 */               if (edgeEffectI00000oIO == null) {
/* 455 */                   edgeEffectI00000oIO = iioO1oi1li.I00000oIO(OIilII.I00iiI);
/* 459 */                   iioO1oi1li.I000OiO = edgeEffectI00000oIO;
                        }
/* 461 */               I010o0o0oO(90.0f, edgeEffectI00000oIO, recordingCanvasBeginRecording);
/* 464 */               edgeEffectI00000oIO.finish();
                    }
/* 478 */           if (IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0001Ioi1lo)) {
/* 480 */               EdgeEffect edgeEffectI0000Il00O = iioO1oi1li.I0000Il00O();
/* 484 */               zI010o0o0oO = I010o0o0oO(270.0f, edgeEffectI0000Il00O, recordingCanvasBeginRecording);
/* 488 */               c = ' ';
/* 496 */               if (IioO1oi1li.I000II(iioO1oi1li.I0001Ioi1lo)) {
/* 502 */                   j2 = j;
/* 507 */                   float fIntBitsToFloat = Float.intBitsToFloat((int) (i0o1iIoolIi.I0000Il00O() & j2));
/* 511 */                   EdgeEffect edgeEffectI00000oIO2 = iioO1oi1li.I000OiO;
/* 513 */                   if (edgeEffectI00000oIO2 == null) {
/* 517 */                       edgeEffectI00000oIO2 = iioO1oi1li.I00000oIO(OIilII.I00iiI);
/* 521 */                       iioO1oi1li.I000OiO = edgeEffectI00000oIO2;
                            }
                            try {
/* 523 */                       distance4 = edgeEffectI0000Il00O.getDistance();
                            } catch (Throwable unused) {
/* 528 */                       distance4 = 0.0f;
                            }
/* 529 */                   float f3 = 1.0f - fIntBitsToFloat;
                            try {
/* 531 */                       edgeEffectI00000oIO2.onPullDistance(distance4, f3);
                            } catch (Throwable unused2) {
/* 535 */                       edgeEffectI00000oIO2.onPull(distance4, f3);
                            }
                        } else {
/* 539 */                   j2 = j;
                        }
                    } else {
/* 542 */               c = ' ';
/* 544 */               j2 = j;
/* 546 */               zI010o0o0oO = false;
                    }
/* 556 */           if (IioO1oi1li.I000II(iioO1oi1li.I000O01llI0)) {
/* 558 */               EdgeEffect edgeEffectI00000oIO3 = iioO1oi1li.I000O01llI0;
/* 560 */               if (edgeEffectI00000oIO3 == null) {
/* 564 */                   edgeEffectI00000oIO3 = iioO1oi1li.I00000oIO(OIilII.I00iOIl);
/* 568 */                   iioO1oi1li.I000O01llI0 = edgeEffectI00000oIO3;
                        }
/* 570 */               I010o0o0oO(180.0f, edgeEffectI00000oIO3, recordingCanvasBeginRecording);
/* 573 */               edgeEffectI00000oIO3.finish();
                    }
/* 582 */           if (IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0000O)) {
/* 584 */               EdgeEffect edgeEffectI0000oI00 = iioO1oi1li.I0000oI00();
/* 600 */               zI010o0o0oO = I010o0o0oO(0.0f, edgeEffectI0000oI00, recordingCanvasBeginRecording) || zI010o0o0oO;
/* 608 */               if (IioO1oi1li.I000II(iioO1oi1li.I0000O)) {
/* 617 */                   float fIntBitsToFloat2 = Float.intBitsToFloat((int) (i0o1iIoolIi.I0000Il00O() >> c));
/* 621 */                   EdgeEffect edgeEffectI00000oIO4 = iioO1oi1li.I000O01llI0;
/* 623 */                   if (edgeEffectI00000oIO4 == null) {
/* 627 */                       edgeEffectI00000oIO4 = iioO1oi1li.I00000oIO(OIilII.I00iOIl);
/* 631 */                       iioO1oi1li.I000O01llI0 = edgeEffectI00000oIO4;
                            }
                            try {
/* 633 */                       distance3 = edgeEffectI0000oI00.getDistance();
                            } catch (Throwable unused3) {
/* 638 */                       distance3 = 0.0f;
                            }
                            try {
/* 639 */                       edgeEffectI00000oIO4.onPullDistance(distance3, fIntBitsToFloat2);
                            } catch (Throwable unused4) {
/* 643 */                       edgeEffectI00000oIO4.onPull(distance3, fIntBitsToFloat2);
                            }
                        }
                    }
/* 652 */           if (IioO1oi1li.I000II(iioO1oi1li.I000iOII)) {
/* 654 */               EdgeEffect edgeEffectI00000oIO5 = iioO1oi1li.I000iOII;
/* 656 */               if (edgeEffectI00000oIO5 == null) {
/* 660 */                   edgeEffectI00000oIO5 = iioO1oi1li.I00000oIO(OIilII.I00iiI);
/* 664 */                   iioO1oi1li.I000iOII = edgeEffectI00000oIO5;
                        }
/* 666 */               I010o0o0oO(270.0f, edgeEffectI00000oIO5, recordingCanvasBeginRecording);
/* 669 */               edgeEffectI00000oIO5.finish();
                    }
/* 678 */           if (IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I000II)) {
/* 680 */               EdgeEffect edgeEffectI0000O = iioO1oi1li.I0000O();
/* 698 */               zI010o0o0oO = I010o0o0oO(90.0f, edgeEffectI0000O, recordingCanvasBeginRecording) || zI010o0o0oO;
/* 706 */               if (IioO1oi1li.I000II(iioO1oi1li.I000II)) {
/* 715 */                   float fIntBitsToFloat3 = Float.intBitsToFloat((int) (i0o1iIoolIi.I0000Il00O() & j2));
/* 719 */                   EdgeEffect edgeEffectI00000oIO6 = iioO1oi1li.I000iOII;
/* 721 */                   if (edgeEffectI00000oIO6 == null) {
/* 725 */                       edgeEffectI00000oIO6 = iioO1oi1li.I00000oIO(OIilII.I00iiI);
/* 729 */                       iioO1oi1li.I000iOII = edgeEffectI00000oIO6;
                            }
                            try {
/* 731 */                       distance2 = edgeEffectI0000O.getDistance();
                            } catch (Throwable unused5) {
/* 736 */                       distance2 = 0.0f;
                            }
                            try {
/* 737 */                       edgeEffectI00000oIO6.onPullDistance(distance2, fIntBitsToFloat3);
                            } catch (Throwable unused6) {
/* 741 */                       edgeEffectI00000oIO6.onPull(distance2, fIntBitsToFloat3);
                            }
                        }
                    }
/* 750 */           if (IioO1oi1li.I000II(iioO1oi1li.I000OOo1O)) {
/* 752 */               EdgeEffect edgeEffectI00000oIO7 = iioO1oi1li.I000OOo1O;
/* 754 */               if (edgeEffectI00000oIO7 == null) {
/* 758 */                   edgeEffectI00000oIO7 = iioO1oi1li.I00000oIO(OIilII.I00iOIl);
/* 762 */                   iioO1oi1li.I000OOo1O = edgeEffectI00000oIO7;
                        }
/* 764 */               I010o0o0oO(0.0f, edgeEffectI00000oIO7, recordingCanvasBeginRecording);
/* 767 */               edgeEffectI00000oIO7.finish();
                    }
/* 776 */           if (IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0000oI00)) {
/* 778 */               EdgeEffect edgeEffectI00000oOI = iioO1oi1li.I00000oOI();
/* 796 */               boolean z3 = I010o0o0oO(180.0f, edgeEffectI00000oOI, recordingCanvasBeginRecording) || zI010o0o0oO;
/* 804 */               if (IioO1oi1li.I000II(iioO1oi1li.I0000oI00)) {
/* 813 */                   float fIntBitsToFloat4 = Float.intBitsToFloat((int) (i0o1iIoolIi.I0000Il00O() >> c));
/* 817 */                   EdgeEffect edgeEffectI00000oIO8 = iioO1oi1li.I000OOo1O;
/* 819 */                   if (edgeEffectI00000oIO8 == null) {
/* 823 */                       edgeEffectI00000oIO8 = iioO1oi1li.I00000oIO(OIilII.I00iOIl);
/* 827 */                       iioO1oi1li.I000OOo1O = edgeEffectI00000oIO8;
                            }
                            try {
/* 829 */                       distance = edgeEffectI00000oOI.getDistance();
                            } catch (Throwable unused7) {
/* 834 */                       distance = 0.0f;
                            }
/* 835 */                   float f4 = 1.0f - fIntBitsToFloat4;
                            try {
/* 837 */                       edgeEffectI00000oIO8.onPullDistance(distance, f4);
                            } catch (Throwable unused8) {
/* 841 */                       edgeEffectI00000oIO8.onPull(distance, f4);
                            }
                        }
/* 844 */               zI010o0o0oO = z3;
                    }
/* 846 */           if (zI010o0o0oO) {
/* 848 */               i0o1iIoolIi.I0000O();
                    }
/* 855 */           float f5 = z2 ? 0.0f : fI00i0ilIl0i;
/* 856 */           if (z) {
/* 858 */               fI00i0ilIl0i = 0.0f;
                    }
/* 859 */           O0iOOoiioO layoutDirection = o0iiliOio.getLayoutDirection();
/* 865 */           I0lIooIo1 i0lIooIo1 = new I0lIooIo1();
/* 868 */           i0lIooIo1.I00000oIO = recordingCanvasBeginRecording;
/* 870 */           long jI0000oI002 = iIolilIo.I0000oI00();
/* 876 */           IiIooOOOI iiIooOOOII001IIilI0O = iIolilIo.I00iiI.I001IIilI0O();
/* 882 */           O0iOOoiioO o0iOOoiioOI001i1O0Ol = iIolilIo.I00iiI.I001i1O0Ol();
/* 888 */           IIolOo iIolOoI0010o2 = iIolilIo.I00iiI.I0010o();
/* 894 */           long jI001iOo1i0O = iIolilIo.I00iiI.I001iOo1i0O();
/* 898 */           IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 905 */           Io10IOI io10IOI = (Io10IOI) iOO000ilo.I00iiO;
/* 907 */           iOO000ilo.I00IioO0OiOi(o0iiliOio);
/* 910 */           iOO000ilo.I00IlilI0i0i(layoutDirection);
/* 913 */           iOO000ilo.I00IOO(i0lIooIo1);
/* 916 */           iOO000ilo.I00Io1lO(jI0000oI002);
/* 920 */           iOO000ilo.I00iiO = null;
/* 922 */           i0lIooIo1.I000II();
                    try {
/* 931 */               ((IIOOoll) iIolilIo.I00iiI.I00iiI).I00i0oil(f5, fI00i0ilIl0i);
                        try {
/* 934 */                   o0iiliOio.I00000oOI();
/* 948 */                   i0lIooIo1.I00100l0();
/* 951 */                   IOO000ilo iOO000ilo2 = iIolilIo.I00iiI;
/* 953 */                   iOO000ilo2.I00IioO0OiOi(iiIooOOOII001IIilI0O);
/* 956 */                   iOO000ilo2.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol);
/* 959 */                   iOO000ilo2.I00IOO(iIolOoI0010o2);
/* 962 */                   iOO000ilo2.I00Io1lO(jI001iOo1i0O);
/* 965 */                   iOO000ilo2.I00iiO = io10IOI;
/* 971 */                   I010oio1OO0().endRecording();
/* 974 */                   int iSave = canvas2.save();
/* 980 */                   canvas2.translate(f, f2);
/* 987 */                   canvas2.drawRenderNode(I010oio1OO0());
/* 990 */                   canvas2.restoreToCount(iSave);
                        } finally {
/* 1005 */                  ((IIOOoll) iIolilIo.I00iiI.I00iiI).I00i0oil(-f5, -fI00i0ilIl0i);
                        }
                    } catch (Throwable th) {
/* 1009 */              i0lIooIo1.I00100l0();
/* 1012 */              IOO000ilo iOO000ilo3 = iIolilIo.I00iiI;
/* 1014 */              iOO000ilo3.I00IioO0OiOi(iiIooOOOII001IIilI0O);
/* 1017 */              iOO000ilo3.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol);
/* 1020 */              iOO000ilo3.I00IOO(iIolOoI0010o2);
/* 1023 */              iOO000ilo3.I00Io1lO(jI001iOo1i0O);
/* 1026 */              iOO000ilo3.I00iiO = io10IOI;
/* 1028 */              throw th;
                    }
                }

                public final RenderNode I010oio1OO0() {
/* 1 */             RenderNode renderNode = this.I00oII;
/* 3 */             if (renderNode != null) {
/* 20 */                return renderNode;
                    }
/* 9 */             RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
/* 12 */            this.I00oII = renderNode2;
/* 20 */            return renderNode2;
                }
            }
