            package p000;

            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            
            public final class IOiO1IOloOiO {
                public LinkedHashMap I00000oIO;
                public LinkedHashMap I00000oOI;
                public LinkedHashMap I0000Il00O;
                public ArrayList I0000O;
                public transient LinkedHashMap I0000oI00;
                public LinkedHashMap I0001Ioi1lo;
                public Bundle I000II;
                public Ill0oOi0 I000O01llI0;

                public final boolean I00000oIO(int i, int i2, Intent intent) {
/* 11 */            String str = (String) this.I00000oIO.get(Integer.valueOf(i));
/* 13 */            if (str == null) {
/* 15 */                return false;
                    }
/* 23 */            I0IO1Ol0l i0IO1Ol0l = (I0IO1Ol0l) this.I0000oI00.get(str);
/* 25 */            ArrayList arrayList = this.I0000O;
/* 33 */            if ((i0IO1Ol0l != null ? i0IO1Ol0l.I00000oIO : null) == null || !arrayList.contains(str)) {
/* 58 */                this.I0001Ioi1lo.remove(str);
/* 68 */                this.I000II.putParcelable(str, new I0IIOOO1O(intent, i2));
/* 71 */                return true;
                    }
/* 49 */            i0IO1Ol0l.I00000oIO.I000iOII(i0IO1Ol0l.I00000oOI.I0000Il00O(intent, i2));
/* 52 */            arrayList.remove(str);
/* 71 */            return true;
                }

                public final void I00000oOI(int i, iOI110IOi11i ioi110ioi11i, Object obj) throws IntentSender.SendIntentException {
                    Bundle bundleExtra;
                    int i2;
/* 1 */             Ill0oOi0 ill0oOi0 = this.I000O01llI0;
/* 3 */             I0IIiO0iI i0IIiO0iII00000oOI = ioi110ioi11i.I00000oOI(ill0oOi0, obj);
/* 7 */             if (i0IIiO0iII00000oOI != null) {
/* 15 */                Handler handler = new Handler(Looper.getMainLooper());
/* 21 */                II0OlOll iI0OlOll = new II0OlOll(2);
/* 24 */                iI0OlOll.I00iiO = this;
/* 26 */                iI0OlOll.I00iiI = i;
/* 28 */                iI0OlOll.I00iio = i0IIiO0iII00000oOI;
/* 30 */                VarHandle.storeStoreFence();
/* 33 */                handler.post(iI0OlOll);
/* 36 */                return;
                    }
/* 37 */            Intent intentI00000oIO = ioi110ioi11i.I00000oIO(obj);
/* 45 */            if (intentI00000oIO.getExtras() != null && intentI00000oIO.getExtras().getClassLoader() == null) {
/* 61 */                intentI00000oIO.setExtrasClassLoader(ill0oOi0.getClassLoader());
                    }
/* 70 */            if (intentI00000oIO.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
/* 72 */                bundleExtra = intentI00000oIO.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
/* 76 */                intentI00000oIO.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    } else {
/* 81 */                bundleExtra = null;
                    }
/* 79 */            Bundle bundle = bundleExtra;
/* 93 */            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentI00000oIO.getAction())) {
/* 97 */                String[] stringArrayExtra = intentI00000oIO.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
/* 102 */               if (stringArrayExtra == null) {
/* 104 */                   stringArrayExtra = new String[0];
                        }
/* 108 */               HashSet hashSet = new HashSet();
/* 113 */               for (String str : stringArrayExtra) {
/* 121 */                   if (TextUtils.isEmpty(str)) {
/* 143 */                       I000II.I000iOII(IIl001iO0Io.I00100l0(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
/* 146 */                       return;
                            }
                        }
/* 147 */               int size = hashSet.size();
/* 158 */               String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
/* 159 */               if (size > 0) {
/* 162 */                   if (size == stringArrayExtra.length) {
/* 164 */                       return;
                            }
/* 165 */                   int i3 = 0;
/* 167 */                   for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
/* 177 */                       if (!hashSet.contains(Integer.valueOf(i4))) {
/* 183 */                           strArr[i3] = stringArrayExtra[i4];
/* 179 */                           i3++;
                                }
                            }
                        }
/* 189 */               ill0oOi0.requestPermissions(stringArrayExtra, i);
/* 192 */               return;
                    }
/* 203 */           if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentI00000oIO.getAction())) {
/* 262 */               ill0oOi0.startActivityForResult(intentI00000oIO, i, bundle);
/* 408 */               return;
                    }
/* 211 */           IooiIli iooiIli = (IooiIli) intentI00000oIO.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
/* 222 */               i2 = i;
                        try {
/* 223 */                   ill0oOi0.startIntentSenderForResult(iooiIli.I00iOIl, i2, iooiIli.I00iiI, iooiIli.I00iiO, iooiIli.I00iio, 0, bundle);
                        } catch (IntentSender.SendIntentException e) {
/* 227 */                   e = e;
/* 228 */                   IntentSender.SendIntentException sendIntentException = e;
/* 239 */                   Handler handler2 = new Handler(Looper.getMainLooper());
/* 245 */                   II0OlOll iI0OlOll2 = new II0OlOll(3);
/* 248 */                   iI0OlOll2.I00iiO = this;
/* 250 */                   iI0OlOll2.I00iiI = i2;
/* 252 */                   iI0OlOll2.I00iio = sendIntentException;
/* 254 */                   VarHandle.storeStoreFence();
/* 257 */                   handler2.post(iI0OlOll2);
                        }
                    } catch (IntentSender.SendIntentException e2) {
/* 230 */               e = e2;
/* 231 */               i2 = i;
                    }
                }

                public final I0IO1iOI1 I0000Il00O(String str, iOI110IOi11i ioi110ioi11i, I0IIOlio i0IIOlio) {
/* 1 */             LinkedHashMap linkedHashMap = this.I00000oIO;
/* 3 */             Bundle bundle = this.I000II;
/* 5 */             LinkedHashMap linkedHashMap2 = this.I0001Ioi1lo;
/* 7 */             LinkedHashMap linkedHashMap3 = this.I00000oOI;
/* 15 */            if (((Integer) linkedHashMap3.get(str)) == null) {
/* 30 */                Iterator it = ((IOo0i10) OilO1oiooiII.I000OOo1O(new I01iOOoiOI(1))).iterator();
/* 38 */                while (it.hasNext()) {
/* 44 */                    Number number = (Number) it.next();
/* 58 */                    if (!linkedHashMap.containsKey(Integer.valueOf(number.intValue()))) {
/* 60 */                        int iIntValue = number.intValue();
/* 68 */                        linkedHashMap.put(Integer.valueOf(iIntValue), str);
/* 75 */                        linkedHashMap3.put(str, Integer.valueOf(iIntValue));
                            }
                        }
/* 152 */               OIiilo1Ool0o.I000II("Sequence contains no element matching the predicate.");
/* 155 */               return null;
                    }
/* 78 */            LinkedHashMap linkedHashMap4 = this.I0000oI00;
/* 82 */            I0IO1Ol0l i0IO1Ol0l = new I0IO1Ol0l();
/* 85 */            i0IO1Ol0l.I00000oIO = i0IIOlio;
/* 87 */            i0IO1Ol0l.I00000oOI = ioi110ioi11i;
/* 89 */            VarHandle.storeStoreFence();
/* 92 */            linkedHashMap4.put(str, i0IO1Ol0l);
/* 99 */            if (linkedHashMap2.containsKey(str)) {
/* 101 */               Object obj = linkedHashMap2.get(str);
/* 105 */               linkedHashMap2.remove(str);
/* 108 */               i0IIOlio.I000iOII(obj);
                    }
/* 117 */           I0IIOOO1O i0iiooo1o = (I0IIOOO1O) bundle.getParcelable(str, I0IIOOO1O.class);
/* 119 */           if (i0iiooo1o != null) {
/* 121 */               bundle.remove(str);
/* 132 */               i0IIOlio.I000iOII(ioi110ioi11i.I0000Il00O(i0iiooo1o.I00iiI, i0iiooo1o.I00iOIl));
                    }
/* 137 */           I0IO1iOI1 i0IO1iOI1 = new I0IO1iOI1();
/* 140 */           i0IO1iOI1.I00000oIO = this;
/* 142 */           i0IO1iOI1.I00000oOI = str;
/* 144 */           i0IO1iOI1.I0000Il00O = ioi110ioi11i;
/* 146 */           VarHandle.storeStoreFence();
/* 149 */           return i0IO1iOI1;
                }
            }
