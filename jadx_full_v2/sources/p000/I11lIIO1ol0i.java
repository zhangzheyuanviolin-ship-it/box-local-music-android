            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.util.Log;
            import android.util.Xml;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            
            public final class I11lIIO1ol0i implements Runnable {
                public final int I00iOIl;
                public Context I00iiI;

                public I11lIIO1ol0i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    Object systemService;
                    String attributeValue;
                    Context context;
/* 1 */             int i = this.I00iOIl;
/* 4 */             Context context2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 56 */                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
/* 67 */                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
/* 69 */                        I1Io1oIoo i1Io1oIoo = I11lil0o.I00ilI0I1;
/* 71 */                        i1Io1oIoo.getClass();
/* 76 */                        I1IlliII1i i1IlliII1i = new I1IlliII1i(i1Io1oIoo);
                                while (true) {
/* 84 */                            if (i1IlliII1i.hasNext()) {
/* 96 */                                I11lil0o i11lil0o = (I11lil0o) ((WeakReference) i1IlliII1i.next()).get();
/* 98 */                                if (i11lil0o != null && (context = ((I11oi01ll) i11lil0o).I00ioIO) != null) {
/* 108 */                                   systemService = context.getSystemService("locale");
                                        }
                                    } else {
/* 113 */                               systemService = null;
                                    }
                                }
/* 135 */                       if ((systemService != null ? O11oilI.I0000Il00O(I11lOI.I00000oIO(systemService)) : O11oilI.I00000oOI).I00000oIO.I00000oIO.isEmpty()) {
                                    synchronized (OI1I1OloIIlO.I00000oIO) {
/* 140 */                               attributeValue = "";
                                        try {
/* 144 */                                   FileInputStream fileInputStreamOpenFileInput = context2.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                                            try {
                                                try {
/* 148 */                                           XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
/* 154 */                                           xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
/* 157 */                                           int depth = xmlPullParserNewPullParser.getDepth();
                                                    while (true) {
/* 161 */                                               int next = xmlPullParserNewPullParser.next();
/* 165 */                                               if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
/* 180 */                                                   if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
/* 200 */                                                       attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                                            }
                                                        }
                                                    }
                                                } catch (IOException | XmlPullParserException unused) {
/* 217 */                                           Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
/* 220 */                                           if (fileInputStreamOpenFileInput != null) {
                                                    }
                                                }
/* 204 */                                       if (fileInputStreamOpenFileInput != null) {
                                                    try {
/* 206 */                                               fileInputStreamOpenFileInput.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                }
/* 227 */                                       if (attributeValue.isEmpty()) {
/* 232 */                                           context2.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                                                }
                                            } finally {
                                            }
                                        } catch (FileNotFoundException unused3) {
                                        }
                                    }
/* 246 */                           Object systemService2 = context2.getSystemService("locale");
/* 250 */                           if (systemService2 != null) {
/* 256 */                               I11lOI.I00000oOI(systemService2, I11lIli0OOiO.I00000oIO(attributeValue));
                                    }
                                }
/* 266 */                       context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
/* 269 */                   I11lil0o.I00iio = true;
/* 271 */                   return;
                        case 1:
/* 34 */                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
/* 40 */                    I11lIIO1ol0i i11lIIO1ol0i = new I11lIIO1ol0i(2);
/* 43 */                    i11lIIO1ol0i.I00iiI = context2;
/* 45 */                    VarHandle.storeStoreFence();
/* 48 */                    threadPoolExecutor.execute(i11lIIO1ol0i);
/* 51 */                    return;
                        default:
/* 17 */                    OOIoioOOOi10.I0000Il00O(context2, new I1Ii1lIoOI(1), OOIoioOOOi10.I00000oIO, false);
/* 20 */                    return;
                    }
                }
            }
