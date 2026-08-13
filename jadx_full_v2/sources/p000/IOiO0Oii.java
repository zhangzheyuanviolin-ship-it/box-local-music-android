            package p000;

            import android.os.Bundle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            
            public final class IOiO0Oii implements OIOooIoo1Ii {
                public final int I00000oIO;
                public Ill0oOi0 I00000oOI;

                public IOiO0Oii(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void I00000oIO() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             Ill0oOi0 ill0oOi0 = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 29 */                    Bundle bundleI00IO1oi11O = ((I1I0i0Ilo1Oi) ill0oOi0.I00iio.I00iiO).I00IO1oi11O("android:support:activity-result");
/* 33 */                    if (bundleI00IO1oi11O != null) {
/* 35 */                        IOiO1IOloOiO iOiO1IOloOiO = ill0oOi0.I00ioIO;
/* 37 */                        LinkedHashMap linkedHashMap = iOiO1IOloOiO.I00000oOI;
/* 39 */                        LinkedHashMap linkedHashMap2 = iOiO1IOloOiO.I00000oIO;
/* 41 */                        Bundle bundle = iOiO1IOloOiO.I000II;
/* 45 */                        ArrayList<Integer> integerArrayList = bundleI00IO1oi11O.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
/* 51 */                        ArrayList<String> stringArrayList = bundleI00IO1oi11O.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
/* 55 */                        if (stringArrayList != null && integerArrayList != null) {
/* 62 */                            ArrayList<String> stringArrayList2 = bundleI00IO1oi11O.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
/* 66 */                            if (stringArrayList2 != null) {
/* 70 */                                iOiO1IOloOiO.I0000O.addAll(stringArrayList2);
                                    }
/* 75 */                            Bundle bundle2 = bundleI00IO1oi11O.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
/* 79 */                            if (bundle2 != null) {
/* 81 */                                bundle.putAll(bundle2);
                                    }
/* 84 */                            int size = stringArrayList.size();
/* 89 */                            for (int i2 = 0; i2 < size; i2++) {
/* 91 */                                String str = stringArrayList.get(i2);
/* 101 */                               if (linkedHashMap.containsKey(str)) {
/* 107 */                                   Integer num = (Integer) linkedHashMap.remove(str);
/* 113 */                                   if (!bundle.containsKey(str)) {
/* 119 */                                       OoOOI1100oI0.I00000oIO(linkedHashMap2).remove(num);
                                            }
                                        }
/* 128 */                               int iIntValue = integerArrayList.get(i2).intValue();
/* 132 */                               String str2 = stringArrayList.get(i2);
/* 142 */                               linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
/* 151 */                               iOiO1IOloOiO.I00000oOI.put(str2, Integer.valueOf(iIntValue));
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
/* 12 */                    Ill0lo1oI0I ill0lo1oI0I = (Ill0lo1oI0I) ill0oOi0.I00oO101o.I00iiI;
/* 17 */                    ill0lo1oI0I.I00iio.I00000oOI(ill0lo1oI0I, ill0lo1oI0I, null);
                            break;
                    }
                }
            }
