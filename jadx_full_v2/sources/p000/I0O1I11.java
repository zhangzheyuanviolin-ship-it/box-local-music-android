            package p000;

            import android.content.Intent;
            import com.google.mlkit.vision.pose.PoseLandmark;
            
            public final class I0O1I11 implements IllOOo00lI {
                public final int I00iOIl;
                public O1OIi1 I00iiI;

                @Override
                public final Object invoke() throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            O1OIi1 o1OIi1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 203 */                   o1OIi1.I00000oIO(null);
                            break;
                        case 1:
/* 176 */                   Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
/* 179 */                   intent.addCategory("android.intent.category.OPENABLE");
/* 184 */                   intent.setType("audio/*");
/* 195 */                   intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"audio/*", "video/mp4"});
/* 198 */                   o1OIi1.I00000oIO(intent);
                            break;
                        case 2:
/* 170 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 3:
/* 166 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 4:
/* 162 */                   o1OIi1.I00000oIO(lI0ilOIoll.I00000oIO());
                            break;
                        case 5:
/* 154 */                   o1OIi1.I00000oIO(lI0ilOIoll.I00000oIO());
                            break;
                        case 6:
/* 146 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 7:
/* 142 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 8:
/* 138 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 9:
/* 134 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 10:
/* 130 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 11:
/* 126 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 12:
/* 122 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 13:
/* 118 */                   o1OIi1.I00000oIO("android.permission.RECORD_AUDIO");
                            break;
                        case 14:
/* 112 */                   o1OIi1.I00000oIO("image/*");
                            break;
                        case 15:
/* 99 */                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
/* 102 */                   intent2.addCategory("android.intent.category.OPENABLE");
/* 105 */                   intent2.setType("*/*");
/* 108 */                   o1OIi1.I00000oIO(intent2);
                            break;
                        case 16:
/* 93 */                    o1OIi1.I00000oIO(lI0ilOIoll.I00000oIO());
                            break;
                        case 17:
/* 85 */                    o1OIi1.I00000oIO(lI0ilOIoll.I00000oIO());
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 68 */                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
/* 71 */                    intent3.addCategory("android.intent.category.OPENABLE");
/* 74 */                    intent3.setType("*/*");
/* 77 */                    o1OIi1.I00000oIO(intent3);
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 62 */                    o1OIi1.I00000oIO(new String[]{"application/pdf"});
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 43 */                    Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
/* 46 */                    intent4.addCategory("android.intent.category.OPENABLE");
/* 49 */                    intent4.setType("*/*");
/* 52 */                    o1OIi1.I00000oIO(intent4);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 37 */                    o1OIi1.I00000oIO(lI0ilOIoll.I00000oIO());
                            break;
                        default:
/* 20 */                    Intent intent5 = new Intent("android.intent.action.OPEN_DOCUMENT");
/* 23 */                    intent5.addCategory("android.intent.category.OPENABLE");
/* 26 */                    intent5.setType("*/*");
/* 29 */                    o1OIi1.I00000oIO(intent5);
                            break;
                    }
/* 32 */            return ooiIlOl1iI;
                }
            }
