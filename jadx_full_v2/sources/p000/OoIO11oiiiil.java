            package p000;

            import android.content.Context;
            import android.speech.tts.TextToSpeech;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOoIO11oiiiil;", "LOooioIIoi0O;", "<init>", "()V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class OoIO11oiiiil extends OooioIIoi0O {
                public final OlO0OIIl1 I00000oOI;
                public final OOli1O I0000Il00O;
                public final II1iIoli I0000O;
                public long I0000oI00;
                public Context I0001Ioi1lo;
                public O1oIOiI11o0 I000II;
                public int I000O01llI0;
                public TextToSpeech I000OOo1O;
                public boolean I000OiO;
                public OoIlOii I000iOII;

                public OoIO11oiiiil() {
/* 6 */             List list = OoIO1Oli1.I00000oIO;
/* 37 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new OoIIo0oOI1((OoI1lOl) list.get(0), (OoI1lOl) list.get(1), OoII00OiO.I00iOIl, null, Il01100l.I00iOIl, "", false, true));
/* 41 */            this.I00000oOI = olO0OIIl1I00000oIO;
/* 47 */            this.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
/* 54 */            this.I0000O = new II1iIoli();
/* 58 */            this.I0000oI00 = 1L;
                }

                public static final void I000lI(byte[] bArr, int i, String str) {
/* 1 */             int length = str.length();
/* 6 */             for (int i2 = 0; i2 < length; i2++) {
/* 15 */                bArr[i + i2] = (byte) str.charAt(i2);
                    }
                }

                public static final void I000o00OoI0I(byte[] bArr, int i, int i2) {
/* 4 */             bArr[i] = (byte) (i2 & 255);
/* 9 */             bArr[i + 1] = 0;
                }

                public static final void I000oI1ioi(byte[] bArr, int i, int i2) {
/* 4 */             bArr[i] = (byte) (i2 & 255);
/* 13 */            bArr[i + 1] = (byte) ((i2 >> 8) & 255);
/* 22 */            bArr[i + 2] = (byte) ((i2 >> 16) & 255);
/* 31 */            bArr[i + 3] = (byte) ((i2 >> 24) & 255);
                }

                @Override
                public final void I0000O() {
                    this.I000O01llI0++;
/* 9 */             this.I0000O.I00000oOI = true;
                    try {
/* 11 */                TextToSpeech textToSpeech = this.I000OOo1O;
/* 13 */                if (textToSpeech != null) {
/* 15 */                    textToSpeech.stop();
                        }
/* 18 */                TextToSpeech textToSpeech2 = this.I000OOo1O;
/* 20 */                if (textToSpeech2 != null) {
/* 22 */                    textToSpeech2.shutdown();
                        }
                    } catch (Throwable unused) {
                    }
/* 26 */            this.I000OOo1O = null;
                }

                public final void I0000oI00(OoIIOoO ooIIOoO, long j) {
/* 11 */            if (((OoIIo0oOI1) this.I00000oOI.getValue()).I000II) {
/* 29 */                iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), null, null, new IO0IOi1Oi(j, this, ooIIOoO, (IOoil1iiIilo) null), 3);
                    }
                }

                public final void I0001Ioi1lo(Context context, O1oIOiI11o0 o1oIOiI11o0, OoIIOoO ooIIOoO) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 13 */            if (((OoIIo0oOI1) olO0OIIl1.getValue()).I0000Il00O != OoII00OiO.I00iOIl) {
/* 15 */                return;
                    }
/* 20 */            this.I0001Ioi1lo = context.getApplicationContext();
/* 24 */            if (o1oIOiI11o0.I00IlilI0i0i == null) {
/* 49 */                olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl1.getValue(), null, null, null, null, null, "The model is still loading — one moment.", false, false, 223));
                    } else {
/* 53 */                this.I000II = o1oIOiI11o0;
/* 55 */                I000OiO(ooIIOoO);
                    }
                }

                public final void I000II(Context context, OoIIOoO ooIIOoO, OoI1lOl ooI1lOl) {
                    OoI1lOl ooI1lOl2;
                    OoIIo0oOI1 ooIIo0oOI1I00000oIO;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 8 */             OoIIo0oOI1 ooIIo0oOI1 = (OoIIo0oOI1) olO0OIIl1.getValue();
/* 10 */            int iOrdinal = ooIIOoO.ordinal();
/* 14 */            if (iOrdinal == 0) {
/* 39 */                ooI1lOl2 = ooI1lOl;
/* 49 */                ooIIo0oOI1I00000oIO = OoIIo0oOI1.I00000oIO(ooIIo0oOI1, ooI1lOl2, null, null, null, null, null, false, false, 254);
                    } else if (iOrdinal != 1) {
/* 35 */                I000II.I00000oIO();
/* 38 */                return;
                    } else {
/* 29 */                ooIIo0oOI1I00000oIO = OoIIo0oOI1.I00000oIO(ooIIo0oOI1, null, ooI1lOl, null, null, null, null, false, false, 253);
/* 33 */                ooI1lOl2 = ooI1lOl;
                    }
/* 54 */            olO0OIIl1.I000lI(null, ooIIo0oOI1I00000oIO);
/* 83 */            context.getSharedPreferences("box_settings", 0).edit().putString(ooIIOoO == OoIIOoO.I00iOIl ? "translator_lang_a" : "translator_lang_b", ooI1lOl2.I00000oOI).apply();
                }

                public final boolean I000O01llI0(String str, OoI1lOl ooI1lOl, OoIIOoO ooIIOoO) {
/* 1 */             Context context = this.I0001Ioi1lo;
/* 3 */             if (context == null) {
/* 47 */                return false;
                    }
/* 8 */             if (this.I000OOo1O != null) {
/* 45 */                if (!this.I000OiO) {
/* 47 */                    return false;
                        }
/* 49 */                String str2 = ooI1lOl.I00000oOI;
/* 51 */                if (ooIIOoO == null) {
/* 53 */                    ooIIOoO = OoIIOoO.I00iOIl;
                        }
/* 55 */                return I000OOo1O(str, str2, ooIIOoO);
                    }
/* 12 */            String str3 = ooI1lOl.I00000oOI;
/* 14 */            if (ooIIOoO == null) {
/* 16 */                ooIIOoO = OoIIOoO.I00iOIl;
                    }
/* 21 */            this.I000iOII = new OoIlOii(str, str3, ooIIOoO);
/* 28 */            I1O1l01lOi i1O1l01lOi = new I1O1l01lOi(2);
/* 31 */            i1O1l01lOi.I00000oOI = this;
/* 33 */            VarHandle.storeStoreFence();
/* 39 */            this.I000OOo1O = new TextToSpeech(context, i1O1l01lOi);
/* 41 */            return true;
                }

                public final boolean I000OOo1O(String str, String str2, OoIIOoO ooIIOoO) {
                    String str3;
                    Object next;
/* 3 */             TextToSpeech textToSpeech = this.I000OOo1O;
/* 6 */             if (textToSpeech == null) {
/* 5 */                 return false;
                    }
/* 13 */            int language = textToSpeech.setLanguage(Locale.forLanguageTag(str2));
/* 19 */            if (language != -2 && language != -1) {
/* 36 */                textToSpeech.speak(str, 0, null, IIl001iO0Io.I000o00OoI0I("turn_", ooIIOoO.name()));
/* 39 */                return true;
                    }
/* 45 */            Iterator it = OoIO1Oli1.I00000oIO.iterator();
                    while (true) {
/* 53 */                if (!it.hasNext()) {
/* 73 */                    str3 = str2;
/* 75 */                    next = null;
                            break;
                        }
/* 55 */                next = it.next();
/* 64 */                str3 = str2;
/* 70 */                if (((OoI1lOl) next).I00000oOI.equals(str3)) {
                            break;
                        }
                    }
/* 76 */            OoI1lOl ooI1lOl = (OoI1lOl) next;
/* 83 */            String str4 = ooI1lOl != null ? ooI1lOl.I00000oIO : str3;
/* 84 */            OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 114 */           olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl1.getValue(), null, null, null, null, null, IlIi0I0.I000lI("No ", str4, " voice installed — showing text only."), false, false, 223));
/* 5 */             return false;
                }

                public final void I000OiO(OoIIOoO ooIIOoO) {
                    O1oIOiI11o0 o1oIOiI11o0;
/* 5 */             Context context = this.I0001Ioi1lo;
/* 7 */             if (context == null || (o1oIOiI11o0 = this.I000II) == null) {
/* 14 */                return;
                    }
/* 15 */            OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 21 */            OoIIo0oOI1 ooIIo0oOI1 = (OoIIo0oOI1) olO0OIIl1.getValue();
/* 23 */            OoIIOoO ooIIOoO2 = OoIIOoO.I00iOIl;
/* 31 */            OoI1lOl ooI1lOl = ooIIOoO == ooIIOoO2 ? ooIIo0oOI1.I00000oIO : ooIIo0oOI1.I00000oOI;
/* 40 */            OoI1lOl ooI1lOl2 = ooIIOoO == ooIIOoO2 ? ooIIo0oOI1.I00000oOI : ooIIo0oOI1.I00000oIO;
/* 45 */            int i = this.I000O01llI0 + 1;
/* 47 */            this.I000O01llI0 = i;
/* 71 */            olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO(ooIIo0oOI1, null, null, OoII00OiO.I00iiI, ooIIOoO, null, "", false, false, 211));
/* 93 */            iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), null, null, new I0iOlI010ii(this, context, i, o1oIOiI11o0, ooIIOoO, ooI1lOl, ooI1lOl2, null), 3);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000iOII(O1oIOiI11o0 o1oIOiI11o0, OoIIOoO ooIIOoO, OoI1lOl ooI1lOl, OoI1lOl ooI1lOl2, byte[] bArr, int i, IOoilo iOoilo) throws Throwable {
                    OoIO0OO ooIO0OO;
                    long j;
                    int i2;
                    O1oIOiI11o0 o1oIOiI11o02;
                    OoI1lOl ooI1lOl3;
                    byte[] bArr2;
                    OoIIOoO ooIIOoO2;
/* 7 */             OoI1lOl ooI1lOl4 = ooI1lOl2;
/* 13 */            if (iOoilo instanceof OoIO0OO) {
/* 16 */                ooIO0OO = (OoIO0OO) iOoilo;
/* 18 */                int i3 = ooIO0OO.I00l0OO0IO;
/* 24 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 27 */                    ooIO0OO.I00l0OO0IO = i3 - Integer.MIN_VALUE;
                        } else {
/* 32 */                    ooIO0OO = new OoIO0OO(this, iOoilo);
                        }
                    }
/* 35 */            Object obj = ooIO0OO.I00ioIO;
/* 37 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 39 */            int i4 = ooIO0OO.I00l0OO0IO;
/* 43 */            OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 45 */            if (i4 == 0) {
/* 78 */                lIoii1l01l0i.I00000oOI(obj);
/* 81 */                j = this.I0000oI00;
/* 86 */                this.I0000oI00 = 1 + j;
/* 154 */               olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl1.getValue(), null, null, OoII00OiO.I00iiO, null, IOOi0Ool1i.I00OI1(((OoIIo0oOI1) olO0OIIl1.getValue()).I0000oI00, new OoIIliIIII0(j, ooIIOoO, ooI1lOl.I00000oIO, ooI1lOl4.I00000oIO, ooI1lOl4.I00000oOI, "", false, null)), null, false, false, 235));
/* 157 */               IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 163 */               Ol0Oli ol0Oli = new Ol0Oli(o1oIOiI11o0, null, 12);
/* 166 */               ooIO0OO.I00iOIl = o1oIOiI11o0;
/* 170 */               ooIO0OO.I00iiI = ooIIOoO;
/* 172 */               ooIO0OO.I00iiO = ooI1lOl;
/* 174 */               ooIO0OO.I00iio = ooI1lOl4;
/* 178 */               ooIO0OO.I00ilI0I1 = bArr;
/* 180 */               i2 = i;
/* 182 */               ooIO0OO.I00ilO0 = i2;
/* 184 */               ooIO0OO.I00io1l = j;
/* 187 */               ooIO0OO.I00l0OO0IO = 1;
/* 193 */               if (iOi1II01i0.I0000oI00(iiI0oillOO10, ol0Oli, ooIO0OO) == ii0111o) {
/* 195 */                   return ii0111o;
                        }
/* 196 */               o1oIOiI11o02 = o1oIOiI11o0;
/* 197 */               ooI1lOl3 = ooI1lOl;
/* 198 */               bArr2 = bArr;
/* 199 */               ooIIOoO2 = ooIIOoO;
                    } else {
/* 47 */                if (i4 != 1) {
/* 74 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 42 */                    return null;
                        }
/* 49 */                long j2 = ooIO0OO.I00io1l;
/* 51 */                int i5 = ooIO0OO.I00ilO0;
/* 53 */                bArr2 = ooIO0OO.I00ilI0I1;
/* 55 */                OoI1lOl ooI1lOl5 = ooIO0OO.I00iio;
/* 57 */                ooI1lOl3 = ooIO0OO.I00iiO;
/* 59 */                ooIIOoO2 = ooIO0OO.I00iiI;
/* 61 */                O1oIOiI11o0 o1oIOiI11o03 = ooIO0OO.I00iOIl;
/* 63 */                lIoii1l01l0i.I00000oOI(obj);
/* 66 */                i2 = i5;
/* 67 */                j = j2;
/* 68 */                o1oIOiI11o02 = o1oIOiI11o03;
/* 69 */                ooI1lOl4 = ooI1lOl5;
                    }
/* 200 */           int i6 = this.I000O01llI0;
/* 202 */           OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 204 */           if (i2 != i6) {
/* 206 */               return ooiIlOl1iI;
                    }
/* 207 */           String str = ooI1lOl3.I00000oIO;
/* 209 */           String str2 = ooI1lOl4.I00000oIO;
/* 223 */           String strI00100l0 = IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("You are a professional interpreter. The attached audio is someone speaking ", str, ". Translate what they said into ", str2, ". Reply with ONLY the "), str2, " translation of the speech — no explanations, no transcript, no quotation marks.");
/* 229 */           StringBuilder sb = new StringBuilder();
                    try {
/* 232 */               O11il1ilio1o o11il1ilio1oI00000oIO = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o02);
/* 238 */               OoIIoIlO0IOl ooIIoIlO0IOl = new OoIIoIlO0IOl();
/* 241 */               ooIIoIlO0IOl.I00iOIl = i2;
/* 243 */               ooIIoIlO0IOl.I00iiI = this;
/* 245 */               ooIIoIlO0IOl.I00iiO = sb;
/* 247 */               ooIIoIlO0IOl.I00iio = j;
/* 249 */               ooIIoIlO0IOl.I00ilI0I1 = ooIIOoO2;
/* 251 */               ooIIoIlO0IOl.I00ilO0 = ooI1lOl4;
/* 253 */               VarHandle.storeStoreFence();
/* 260 */               OlOiIoII olOiIoII = new OlOiIoII(13);
/* 265 */               OoIIoiil1OI ooIIoiil1OI = new OoIIoiil1OI();
/* 268 */               ooIIoiil1OI.I00iOIl = i2;
/* 270 */               ooIIoiil1OI.I00iiI = this;
/* 272 */               ooIIoiil1OI.I00iiO = j;
/* 274 */               VarHandle.storeStoreFence();
/* 291 */               O11il1ilio1o.I00000oOI(o11il1ilio1oI00000oIO, o1oIOiI11o02, strI00100l0, ooIIoIlO0IOl, olOiIoII, ooIIoiil1OI, Collections.singletonList(bArr2), null, 416);
/* 294 */               return ooiIlOl1iI;
                    } catch (Throwable th) {
/* 300 */               Log.e("AGTranslatorViewModel", "translate failed", th);
/* 307 */               Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(14);
/* 310 */               ol1OiIli00Ii.I00iiI = th;
/* 312 */               VarHandle.storeStoreFence();
/* 315 */               I000l1(j, ol1OiIli00Ii);
/* 345 */               olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl1.getValue(), null, null, OoII00OiO.I00iOIl, null, null, null, false, false, 243));
/* 965 */               return ooiIlOl1iI;
                    }
                }

                public final void I000l1(long j, Function1 function1) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 8 */             OoIIo0oOI1 ooIIo0oOI1 = (OoIIo0oOI1) olO0OIIl1.getValue();
/* 16 */            List<OoIIliIIII0> list = ((OoIIo0oOI1) olO0OIIl1.getValue()).I0000oI00;
/* 28 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 39 */            for (OoIIliIIII0 ooIIliIIII0 : list) {
/* 51 */                if (ooIIliIIII0.I00000oIO == j) {
/* 57 */                    ooIIliIIII0 = (OoIIliIIII0) function1.invoke(ooIIliIIII0);
                        }
/* 59 */                arrayList.add(ooIIliIIII0);
                    }
/* 77 */            olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO(ooIIo0oOI1, null, null, null, null, arrayList, null, false, false, 239));
                }
            }
