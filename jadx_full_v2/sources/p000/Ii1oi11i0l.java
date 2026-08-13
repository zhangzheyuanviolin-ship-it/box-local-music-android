            package p000;

            import android.util.Base64OutputStream;
            import java.io.ByteArrayOutputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.concurrent.Callable;
            import java.util.zip.GZIPOutputStream;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            public final class Ii1oi11i0l implements Callable {
                public final int I00000oIO;
                public Ii1oil I00000oOI;

                public Ii1oi11i0l(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object call() {
                    String string;
                    switch (this.I00000oIO) {
                        case 0:
/* 42 */                    Ii1oil ii1oil = this.I00000oOI;
                            synchronized (ii1oil) {
                                try {
/* 51 */                            Io1Ooo1 io1Ooo1 = (Io1Ooo1) ii1oil.I00000oIO.get();
/* 53 */                            ArrayList arrayListI00000oIO = io1Ooo1.I00000oIO();
                                    synchronized (io1Ooo1) {
/* 58 */                                O00lOo o00lOo = io1Ooo1.I00000oIO;
/* 64 */                                Iil1olo iil1olo = new Iil1olo(20);
/* 67 */                                iil1olo.I00iiI = io1Ooo1;
/* 69 */                                VarHandle.storeStoreFence();
/* 72 */                                o00lOo.I00000oIO(iil1olo);
                                    }
/* 78 */                            JSONArray jSONArray = new JSONArray();
/* 86 */                            for (int i = 0; i < arrayListI00000oIO.size(); i++) {
/* 92 */                                I1l0OoO1 i1l0OoO1 = (I1l0OoO1) arrayListI00000oIO.get(i);
/* 96 */                                JSONObject jSONObject = new JSONObject();
/* 103 */                               jSONObject.put("agent", i1l0OoO1.I00000oIO);
/* 115 */                               jSONObject.put("dates", new JSONArray((Collection) i1l0OoO1.I00000oOI));
/* 118 */                               jSONArray.put(jSONObject);
                                    }
/* 128 */                           JSONObject jSONObject2 = new JSONObject();
/* 133 */                           jSONObject2.put("heartbeats", jSONArray);
/* 140 */                           jSONObject2.put("version", "2");
/* 145 */                           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 152 */                           Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                                    try {
/* 157 */                               GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                                        try {
/* 170 */                                   gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
/* 173 */                                   gZIPOutputStream.close();
/* 176 */                                   base64OutputStream.close();
/* 181 */                                   string = byteArrayOutputStream.toString("UTF-8");
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th) {
/* 212 */                           throw th;
                                }
                            }
/* 186 */                   return string;
                        default:
/* 6 */                     Ii1oil ii1oil2 = this.I00000oOI;
                            synchronized (ii1oil2) {
/* 33 */                        ((Io1Ooo1) ii1oil2.I00000oIO.get()).I0001Ioi1lo(System.currentTimeMillis(), ((IiIO0i100IO) ii1oil2.I0000Il00O.get()).I00000oIO());
                            }
/* 37 */                    return null;
                    }
                }
            }
