            package p000;

            import android.content.Intent;
            import android.content.IntentSender;
            
            public final class II0OlOll implements Runnable {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public II0OlOll(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 171 */                   II0i11 iI0i11 = (II0i11) this.I00iiO;
/* 173 */                   int i = this.I00iiI;
/* 177 */                   CharSequence charSequence = (CharSequence) this.I00iio;
/* 179 */                   II0lI0lO1 iI0lI0lO1 = iI0i11.I0110OiO;
/* 181 */                   iOOol1iOiIO iI0ioIIollll = iI0lI0lO1.I0000Il00O;
/* 183 */                   if (iI0ioIIollll == null) {
/* 187 */                       iI0ioIIollll = new II0ioIIollll();
/* 190 */                       iI0lI0lO1.I0000Il00O = iI0ioIIollll;
                            }
/* 192 */                   iI0ioIIollll.I00000oIO(i, charSequence);
                            break;
                        case 1:
/* 165 */                   ((IIl1Ol) this.I00iiO).I0000O(IIl1Iloio.I0000O((Oi0Iil) this.I00iio), this.I00iiI);
                            break;
                        case 2:
/* 85 */                    IOiO1IOloOiO iOiO1IOloOiO = (IOiO1IOloOiO) this.I00iiO;
/* 87 */                    int i2 = this.I00iiI;
/* 93 */                    Object obj = ((I0IIiO0iI) this.I00iio).I00iiI;
/* 105 */                   String str = (String) iOiO1IOloOiO.I00000oIO.get(Integer.valueOf(i2));
/* 107 */                   if (str != null) {
/* 116 */                       I0IO1Ol0l i0IO1Ol0l = (I0IO1Ol0l) iOiO1IOloOiO.I0000oI00.get(str);
/* 124 */                       if ((i0IO1Ol0l != null ? i0IO1Ol0l.I00000oIO : null) != null) {
/* 137 */                           I0IIOlio i0IIOlio = i0IO1Ol0l.I00000oIO;
/* 145 */                           if (iOiO1IOloOiO.I0000O.remove(str)) {
/* 147 */                               i0IIOlio.I000iOII(obj);
                                        break;
                                    }
                                } else {
/* 128 */                           iOiO1IOloOiO.I000II.remove(str);
/* 133 */                           iOiO1IOloOiO.I0001Ioi1lo.put(str, obj);
                                    break;
                                }
                            }
                            break;
                        case 3:
/* 79 */                    ((IOiO1IOloOiO) this.I00iiO).I00000oIO(this.I00iiI, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.I00iio));
                            break;
                        case 4:
/* 47 */                    ((IiOoiiil) this.I00iiO).I00000oOI.I0001Ioi1lo(this.I00iiI, this.I00iio);
                            break;
                        case 5:
/* 20 */                    O10oIiIi0OI0 o10oIiIi0OI0 = (O10oIiIi0OI0) this.I00iiO;
/* 22 */                    int i3 = this.I00iiI;
/* 26 */                    IoOlo1llOO ioOlo1llOO = (IoOlo1llOO) this.I00iio;
/* 28 */                    o10oIiIi0OI0.stop(i3);
/* 33 */                    O10lo0O.I00000oOI(ioOlo1llOO, O10oOIoI0.I000oI1ioi);
                            break;
                        default:
/* 14 */                    ((Oi1ol0llI) this.I00iiO).I0001Ioi1lo(this.I00iiI, this.I00iio);
                            break;
                    }
                }
            }
