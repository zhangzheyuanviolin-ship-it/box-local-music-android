            package p000;

            import android.content.ContentResolver;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.provider.MediaStore;
            import android.widget.Toast;
            import androidx.core.content.FileProvider;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.OutputStream;
            
            public final class Oioo1l00 implements IllOOo00lI {
                public final int I00iOIl;
                public Context I00iiI;
                public String I00iiO;

                @Override
                public final Object invoke() {
                    File file;
                    ContentResolver contentResolver;
                    ContentValues contentValues;
                    Uri uriInsert;
                    OutputStream outputStreamOpenOutputStream;
                    FileInputStream fileInputStream;
                    File file2;
                    ContentResolver contentResolver2;
                    ContentValues contentValues2;
                    Uri uriInsert2;
/* 3 */             int i = this.I00iOIl;
/* 37 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 547 */                   return this.I00iiI.getSharedPreferences(this.I00iiO, 0);
                        case 1:
/* 381 */                   Context context = this.I00iiI;
                            try {
/* 389 */                       file = new File(this.I00iiO);
/* 410 */                       String str = "SoundGenHD_" + System.currentTimeMillis() + ".wav";
/* 414 */                       contentResolver = context.getContentResolver();
/* 420 */                       contentValues = new ContentValues();
/* 423 */                       contentValues.put("_display_name", str);
/* 426 */                       contentValues.put("mime_type", "audio/wav");
/* 429 */                       contentValues.put("relative_path", "Music/SoundGen");
/* 438 */                       contentValues.put("is_pending", (Integer) 1);
/* 445 */                       uriInsert = contentResolver.insert(MediaStore.Audio.Media.getContentUri("external_primary"), contentValues);
                            } catch (Throwable th) {
/* 539 */                       Toast.makeText(context, "Export failed: " + th.getMessage(), 0).show();
                            }
/* 449 */                   if (uriInsert == null) {
/* 517 */                       throw new IllegalStateException("insert failed");
                            }
/* 451 */                   outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                            try {
/* 457 */                       fileInputStream = new FileInputStream(file);
                                try {
/* 460 */                           iOiOlIoI.I00000oIO(fileInputStream, outputStreamOpenOutputStream);
/* 463 */                           fileInputStream.close();
/* 466 */                           outputStreamOpenOutputStream.close();
/* 469 */                           contentValues.clear();
/* 476 */                           contentValues.put("is_pending", (Integer) 0);
/* 480 */                           contentResolver.update(uriInsert, contentValues, null, null);
/* 489 */                           Toast.makeText(context, "Saved to Music/SoundGen", 0).show();
/* 542 */                           return ooiIlOl1iI;
                                } finally {
                                    try {
/* 500 */                               throw th;
                                    } finally {
                                    }
                                }
                            } finally {
                                try {
/* 506 */                           throw th;
                                } finally {
                                }
                            }
                        case 2:
/* 293 */                   Context context2 = this.I00iiI;
/* 295 */                   String str2 = this.I00iiO;
                            try {
/* 321 */                       Uri uriI0000Il00O = FileProvider.I0000Il00O(context2, context2.getPackageName() + ".provider", new File(str2));
/* 327 */                       Intent intent = new Intent("android.intent.action.SEND");
/* 330 */                       intent.setType("audio/wav");
/* 333 */                       intent.putExtra("android.intent.extra.STREAM", uriI0000Il00O);
/* 337 */                       intent.addFlags(1);
/* 350 */                       context2.startActivity(Intent.createChooser(intent, "Share audio").addFlags(268435456));
                            } catch (Throwable th2) {
/* 375 */                       Toast.makeText(context2, "Share failed: " + th2.getMessage(), 0).show();
                            }
/* 378 */                   return ooiIlOl1iI;
                        case 3:
/* 135 */                   Context context3 = this.I00iiI;
                            try {
/* 143 */                       file2 = new File(this.I00iiO);
/* 161 */                       String str3 = "SoundGen_" + System.currentTimeMillis() + ".wav";
/* 165 */                       contentResolver2 = context3.getContentResolver();
/* 171 */                       contentValues2 = new ContentValues();
/* 174 */                       contentValues2.put("_display_name", str3);
/* 177 */                       contentValues2.put("mime_type", "audio/wav");
/* 180 */                       contentValues2.put("relative_path", "Music/SoundGen");
/* 189 */                       contentValues2.put("is_pending", (Integer) 1);
/* 196 */                       uriInsert2 = contentResolver2.insert(MediaStore.Audio.Media.getContentUri("external_primary"), contentValues2);
                            } catch (Throwable th3) {
/* 289 */                       Toast.makeText(context3, "Export failed: " + th3.getMessage(), 0).show();
                            }
/* 200 */                   if (uriInsert2 == null) {
/* 266 */                       throw new IllegalStateException("insert failed");
                            }
/* 202 */                   outputStreamOpenOutputStream = contentResolver2.openOutputStream(uriInsert2);
                            try {
/* 208 */                       fileInputStream = new FileInputStream(file2);
                                try {
/* 211 */                           iOiOlIoI.I00000oIO(fileInputStream, outputStreamOpenOutputStream);
/* 214 */                           fileInputStream.close();
/* 217 */                           outputStreamOpenOutputStream.close();
/* 220 */                           contentValues2.clear();
/* 227 */                           contentValues2.put("is_pending", (Integer) 0);
/* 231 */                           contentResolver2.update(uriInsert2, contentValues2, null, null);
/* 238 */                           Toast.makeText(context3, "Saved to Music/SoundGen", 0).show();
/* 292 */                           return ooiIlOl1iI;
                                } finally {
                                }
                            } finally {
                            }
                        default:
/* 49 */                    Context context4 = this.I00iiI;
/* 51 */                    String str4 = this.I00iiO;
                            try {
/* 77 */                        Uri uriI0000Il00O2 = FileProvider.I0000Il00O(context4, context4.getPackageName() + ".provider", new File(str4));
/* 83 */                        Intent intent2 = new Intent("android.intent.action.SEND");
/* 86 */                        intent2.setType("audio/wav");
/* 89 */                        intent2.putExtra("android.intent.extra.STREAM", uriI0000Il00O2);
/* 93 */                        intent2.addFlags(1);
/* 106 */                       context4.startActivity(Intent.createChooser(intent2, "Share audio").addFlags(268435456));
                            } catch (Throwable th4) {
/* 131 */                       Toast.makeText(context4, "Share failed: " + th4.getMessage(), 0).show();
                            }
/* 134 */                   return ooiIlOl1iI;
                    }
                }
            }
