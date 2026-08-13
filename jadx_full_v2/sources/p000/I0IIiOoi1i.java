            package p000;

            import android.content.ClipData;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class I0IIiOoi1i extends iOI110IOi11i {
                public final int I00000oIO;

                public I0IIiOoi1i(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Intent I00000oIO(Object obj) {
                    Bundle bundleExtra;
/* 9 */             String str = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 221 */                   return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) obj);
                        case 1:
/* 201 */                   return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", (String[]) obj).setType("*/*");
                        case 2:
/* 167 */                   Uri uri = (Uri) obj;
/* 173 */                   Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
/* 176 */                   if (uri != null) {
/* 180 */                       intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                            }
/* 183 */                   return intent;
                        case 3:
/* 137 */                   Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
/* 140 */                   I0IO11ii011O i0IO11ii011O = ((OO10Oii) obj).I00000oIO;
/* 144 */                   if (i0IO11ii011O instanceof I0IO11i1) {
/* 146 */                       str = "image/*";
                            } else if (!(i0IO11ii011O instanceof I0IO10oI)) {
/* 163 */                       I000II.I00000oIO();
/* 9 */                         return null;
                            }
/* 153 */                   intent2.setType(str);
/* 158 */                   intent2.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
/* 161 */                   return intent2;
                        case 4:
/* 126 */                   return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
                        case 5:
/* 114 */                   return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                        case 6:
/* 100 */                   return (Intent) obj;
                        case 7:
/* 95 */                    return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", (Uri) obj).addFlags(1).addFlags(2);
                        default:
/* 13 */                    IooiIli iooiIli = (IooiIli) obj;
/* 19 */                    Intent intent3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
/* 22 */                    Intent intent4 = iooiIli.I00iiI;
/* 24 */                    if (intent4 != null && (bundleExtra = intent4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
/* 34 */                        intent3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
/* 37 */                        intent4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
/* 47 */                        if (intent4.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
/* 57 */                            iooiIli = new IooiIli(iooiIli.I00iOIl, null, iooiIli.I00iiO, iooiIli.I00iio);
                                }
                            }
/* 63 */                    intent3.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iooiIli);
/* 70 */                    if (Ill1OlOOl.I00IOO(2)) {
/* 72 */                        intent3.toString();
                            }
/* 75 */                    return intent3;
                    }
                }

                @Override
                public I0IIiO0iI I00000oOI(Ill0oOi0 ill0oOi0, Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 4 */                     return null;
                        case 1:
/* 4 */                     return null;
                        case 2:
/* 4 */                     return null;
                        case 3:
/* 4 */                     return null;
                        case 4:
/* 32 */                    String[] strArr = (String[]) obj;
/* 35 */                    if (strArr.length == 0) {
/* 41 */                        return new I0IIiO0iI(Il011I1OiO0I.I00iOIl, 0);
                            }
/* 47 */                    for (String str : strArr) {
/* 55 */                        if (iOI10i0I11.I00000oIO(ill0oOi0, str) != 0) {
/* 4 */                             return null;
                                }
                            }
/* 61 */                    int iI00000oIO = O1Oii0o0Oi.I00000oIO(strArr.length);
/* 67 */                    if (iI00000oIO < 16) {
/* 69 */                        iI00000oIO = 16;
                            }
/* 72 */                    LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 77 */                    for (String str2 : strArr) {
/* 83 */                        linkedHashMap.put(str2, Boolean.TRUE);
                            }
/* 91 */                    return new I0IIiO0iI(linkedHashMap, 0);
                        case 5:
/* 22 */                    if (iOI10i0I11.I00000oIO(ill0oOi0, (String) obj) == 0) {
/* 28 */                        return new I0IIiO0iI(Boolean.TRUE, 0);
                            }
/* 4 */                     return null;
                        case 6:
                        default:
/* 8 */                     return super.I00000oOI(ill0oOi0, obj);
                        case 7:
/* 4 */                     return null;
                    }
                }

                @Override
                public final Object I0000Il00O(Intent intent, int i) {
                    List arrayList;
/* 6 */             z = false;
/* 6 */             boolean z = false;
                    switch (this.I00000oIO) {
                        case 0:
/* 229 */                   if (i != -1) {
/* 232 */                       intent = null;
                            }
/* 233 */                   if (intent != null) {
/* 235 */                       return intent.getData();
                            }
/* 5 */                     return null;
                        case 1:
/* 218 */                   if (i != -1) {
/* 221 */                       intent = null;
                            }
/* 222 */                   if (intent != null) {
/* 224 */                       return intent.getData();
                            }
/* 5 */                     return null;
                        case 2:
/* 207 */                   if (i != -1) {
/* 210 */                       intent = null;
                            }
/* 211 */                   if (intent != null) {
/* 213 */                       return intent.getData();
                            }
/* 5 */                     return null;
                        case 3:
/* 128 */                   if (i != -1) {
/* 131 */                       intent = null;
                            }
/* 132 */                   if (intent == null) {
/* 5 */                         return null;
                            }
/* 134 */                   Uri data = intent.getData();
/* 138 */                   if (data != null) {
/* 206 */                       return data;
                            }
/* 142 */                   LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 145 */                   Uri data2 = intent.getData();
/* 149 */                   if (data2 != null) {
/* 151 */                       linkedHashSet.add(data2);
                            }
/* 154 */                   ClipData clipData = intent.getClipData();
/* 158 */                   if (clipData == null && linkedHashSet.isEmpty()) {
/* 166 */                       arrayList = Il01100l.I00iOIl;
                            } else {
/* 169 */                       if (clipData != null) {
/* 171 */                           int itemCount = clipData.getItemCount();
/* 175 */                           for (int i2 = 0; i2 < itemCount; i2++) {
/* 181 */                               Uri uri = clipData.getItemAt(i2).getUri();
/* 185 */                               if (uri != null) {
/* 187 */                                   linkedHashSet.add(uri);
                                        }
                                    }
                                }
/* 195 */                       arrayList = new ArrayList(linkedHashSet);
                            }
/* 204 */                   return (Uri) IOOi0Ool1i.I00II0Ol1O0l(arrayList);
                        case 4:
/* 64 */                    if (i == -1 && intent != null) {
/* 72 */                        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
/* 76 */                        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
/* 80 */                        if (intArrayExtra != null && stringArrayExtra != null) {
/* 88 */                            ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
/* 93 */                            for (int i3 : intArrayExtra) {
/* 106 */                               arrayList2.add(Boolean.valueOf(i3 == 0));
                                    }
/* 120 */                           return O1Oii0O0loo.I000OiO(IOOi0Ool1i.I00ilO0(I1IoiO1l.I001IIilI0O(stringArrayExtra), arrayList2));
                                }
                            }
/* 125 */                   return Il011I1OiO0I.I00iOIl;
                        case 5:
/* 32 */                    if (intent == null || i != -1) {
/* 61 */                        return Boolean.FALSE;
                            }
/* 37 */                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
/* 41 */                    if (intArrayExtra2 != null) {
/* 43 */                        int length = intArrayExtra2.length;
/* 44 */                        int i4 = 0;
                                while (true) {
/* 45 */                            if (i4 < length) {
/* 49 */                                if (intArrayExtra2[i4] == 0) {
/* 51 */                                    z = true;
                                        } else {
/* 53 */                                    i4++;
                                        }
                                    }
                                }
                            }
/* 56 */                    return Boolean.valueOf(z);
                        case 6:
/* 28 */                    return new I0IIOOO1O(intent, i);
                        case 7:
/* 21 */                    return Boolean.valueOf(i == -1);
                        default:
/* 14 */                    return new I0IIOOO1O(intent, i);
                    }
                }
            }
