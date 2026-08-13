            package p000;

            import android.app.RemoteAction;
            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.Icon;
            import android.os.LocaleList;
            import android.view.textclassifier.TextClassification;
            import android.view.textclassifier.TextClassifier;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Locale;
            
            public final class OO1O0I {
                public Ii00l101O I00000oIO;
                public Context I00000oOI;
                public OiiOIo1 I0000Il00O;
                public O11oiiOIl0O I0000O;
                public OI1I0OoOl I0000oI00;
                public TextClassifier I0001Ioi1lo;
                public OIooliIO0 I000II;
                public Object I000O01llI0;

                /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
                
                    if (r1 == r5) goto L36;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[DONT_GENERATE] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /* JADX WARN: Type inference failed for: r3v3, types: [OI11ol] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(CharSequence charSequence, long j, TextClassifier textClassifier, IOoilo iOoilo) throws Throwable {
                    OO1IoIll oO1IoIll;
                    long j2;
                    CharSequence charSequence2;
                    TextClassifier textClassifier2;
                    OI1I0OoOl oI1I0OoOl;
                    OloiIl oloiIlI00000oOI;
                    boolean z;
                    OI1I0OoOl oI1I0OoOl2;
/* 5 */             OIooliIO0 oIooliIO0 = this.I000II;
/* 7 */             OI1I0OoOl oI1I0OoOl3 = this.I0000oI00;
/* 11 */            if (iOoilo instanceof OO1IoIll) {
/* 14 */                oO1IoIll = (OO1IoIll) iOoilo;
/* 16 */                int i = oO1IoIll.I00io1l;
/* 22 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 25 */                    oO1IoIll.I00io1l = i - Integer.MIN_VALUE;
                        } else {
/* 30 */                    oO1IoIll = new OO1IoIll(this, iOoilo);
                        }
                    }
/* 33 */            Object obj = oO1IoIll.I00ilI0I1;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i2 = oO1IoIll.I00io1l;
/* 39 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    try {
/* 44 */                if (i2 == 0) {
/* 86 */                    lIoii1l01l0i.I00000oOI(obj);
/* 91 */                    oO1IoIll.I00iOIl = charSequence;
/* 95 */                    oO1IoIll.I00iiI = textClassifier;
/* 97 */                    oO1IoIll.I00iiO = oI1I0OoOl3;
/* 99 */                    j2 = j;
/* 101 */                   oO1IoIll.I00iio = j2;
/* 103 */                   oO1IoIll.I00io1l = 1;
/* 109 */                   if (oI1I0OoOl3.I00000oIO(oO1IoIll) != ii0111o) {
/* 112 */                       charSequence2 = charSequence;
/* 113 */                       textClassifier2 = textClassifier;
/* 114 */                       oI1I0OoOl = oI1I0OoOl3;
                            }
/* 203 */                   return ii0111o;
                        }
/* 46 */                if (i2 != 1) {
/* 48 */                    if (i2 != 2) {
/* 66 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 43 */                        return null;
                            }
/* 53 */                    ?? r3 = (OI11ol) oO1IoIll.I00iiI;
/* 57 */                    oloiIlI00000oOI = (OloiIl) oO1IoIll.I00iOIl;
/* 59 */                    lIoii1l01l0i.I00000oOI(obj);
                            oI1I0OoOl2 = r3;
                            try {
/* 204 */                       oIooliIO0.setValue(oloiIlI00000oOI);
/* 210 */                       return ooiIlOl1iI;
                            } finally {
                            }
                        }
/* 70 */                j2 = oO1IoIll.I00iio;
/* 72 */                oI1I0OoOl = oO1IoIll.I00iiO;
/* 76 */                textClassifier2 = (TextClassifier) oO1IoIll.I00iiI;
/* 80 */                charSequence2 = (CharSequence) oO1IoIll.I00iOIl;
/* 82 */                lIoii1l01l0i.I00000oOI(obj);
/* 119 */               OloiIl oloiIl = (OloiIl) oIooliIO0.getValue();
/* 121 */               if (oloiIl != null) {
/* 129 */                   if (Oo0lI00l.I0000Il00O(j2, oloiIl.I00000oOI)) {
/* 137 */                       z = O0000Ioio00.I0000O(charSequence2, oloiIl.I00000oIO);
/* 146 */                       if (z) {
/* 151 */                           return ooiIlOl1iI;
                                }
                            }
/* 146 */                   if (z) {
                            }
                        }
/* 152 */               oI1I0OoOl.I00000oOI(null);
/* 184 */               oloiIlI00000oOI = I00000oOI(charSequence2, j2, textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, Oo0lI00l.I000II(j2), Oo0lI00l.I0001Ioi1lo(j2)).setDefaultLocales(I0000Il00O()).build()));
/* 188 */               oO1IoIll.I00iOIl = oloiIlI00000oOI;
/* 190 */               oO1IoIll.I00iiI = oI1I0OoOl3;
/* 192 */               oO1IoIll.I00iiO = null;
/* 195 */               oO1IoIll.I00io1l = 2;
/* 197 */               Object objI00000oIO = oI1I0OoOl3.I00000oIO(oO1IoIll);
                        oI1I0OoOl2 = oI1I0OoOl3;
                    } finally {
                    }
                }

                public final OloiIl I00000oOI(CharSequence charSequence, long j, TextClassification textClassification) {
                    Icon icon;
/* 5 */             int size = textClassification.getActions().size();
/* 11 */            ArrayList arrayList = new ArrayList(size);
/* 15 */            for (int i = 0; i < size; i++) {
/* 21 */                RemoteAction remoteAction = textClassification.getActions().get(i);
/* 26 */                RemoteAction remoteAction2 = remoteAction;
/* 28 */                Drawable drawableLoadDrawable = null;
/* 29 */                if (i != 0 && !remoteAction2.shouldShowIcon()) {
/* 38 */                    remoteAction = null;
                        }
/* 39 */                RemoteAction remoteAction3 = remoteAction;
/* 41 */                if (remoteAction3 != null && (icon = remoteAction3.getIcon()) != null) {
/* 51 */                    drawableLoadDrawable = icon.loadDrawable(this.I00000oOI);
                        }
/* 55 */                arrayList.add(drawableLoadDrawable);
                    }
/* 63 */            OloiIl oloiIl = new OloiIl();
/* 66 */            oloiIl.I00000oIO = charSequence;
/* 68 */            oloiIl.I00000oOI = j;
/* 70 */            oloiIl.I0000Il00O = textClassification;
/* 72 */            oloiIl.I0000O = arrayList;
/* 74 */            VarHandle.storeStoreFence();
/* 98 */            return oloiIl;
                }

                public final LocaleList I0000Il00O() {
/* 1 */             O11oiiOIl0O o11oiiOIl0O = this.I0000O;
/* 4 */             if (o11oiiOIl0O == null) {
/* 84 */                return new LocaleList(((O11oOOio1iO) OO1Iii0lOo.I00000oIO.I00111O().I00iOIl.get(0)).I00000oIO);
                    }
/* 14 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(o11oiiOIl0O, 10));
/* 19 */            Iterator it = o11oiiOIl0O.I00iOIl.iterator();
/* 27 */            while (it.hasNext()) {
/* 37 */                arrayList.add(((O11oOOio1iO) it.next()).I00000oIO);
                    }
/* 47 */            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
/* 58 */            return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
                }
            }
