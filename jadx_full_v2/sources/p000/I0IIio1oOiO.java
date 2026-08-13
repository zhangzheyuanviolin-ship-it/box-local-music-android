            package p000;

            import android.content.ClipData;
            import android.content.Intent;
            import android.net.Uri;
            import android.provider.MediaStore;
            import java.util.ArrayList;
            import java.util.LinkedHashSet;
            
            public final class I0IIio1oOiO extends iOI110IOi11i {
                public int I00000oIO;

                @Override
                public final Intent I00000oIO(Object obj) {
                    String str;
/* 1 */             OO10Oii oO10Oii = (OO10Oii) obj;
/* 7 */             Intent intent = new Intent("android.provider.action.PICK_IMAGES");
/* 10 */            I0IO11ii011O i0IO11ii011O = oO10Oii.I00000oIO;
/* 15 */            if (i0IO11ii011O instanceof I0IO11i1) {
/* 17 */                str = "image/*";
                    } else {
/* 22 */                if (!(i0IO11ii011O instanceof I0IO10oI)) {
/* 68 */                    I000II.I00000oIO();
/* 14 */                    return null;
                        }
/* 24 */                str = null;
                    }
/* 25 */            intent.setType(str);
/* 32 */            int iMin = Math.min(this.I00000oIO, oO10Oii.I00000oOI);
/* 37 */            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
/* 64 */                I000II.I000iOII("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
/* 14 */                return null;
                    }
/* 47 */            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
/* 52 */            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
/* 58 */            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
/* 61 */            return intent;
                }

                @Override
                public final I0IIiO0iI I00000oOI(Ill0oOi0 ill0oOi0, Object obj) {
/* 3 */             return null;
                }

                @Override
                public final Object I0000Il00O(Intent intent, int i) {
/* 2 */             if (i != -1) {
/* 5 */                 intent = null;
                    }
/* 6 */             if (intent != null) {
/* 10 */                LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 13 */                Uri data = intent.getData();
/* 17 */                if (data != null) {
/* 19 */                    linkedHashSet.add(data);
                        }
/* 22 */                ClipData clipData = intent.getClipData();
/* 26 */                if (clipData != null || !linkedHashSet.isEmpty()) {
/* 35 */                    if (clipData != null) {
/* 37 */                        int itemCount = clipData.getItemCount();
/* 42 */                        for (int i2 = 0; i2 < itemCount; i2++) {
/* 48 */                            Uri uri = clipData.getItemAt(i2).getUri();
/* 52 */                            if (uri != null) {
/* 54 */                                linkedHashSet.add(uri);
                                    }
                                }
                            }
/* 62 */                    return new ArrayList(linkedHashSet);
                        }
                    }
/* 66 */            return Il01100l.I00iOIl;
                }
            }
