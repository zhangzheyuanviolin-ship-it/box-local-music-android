            package p000;

            import android.content.ClipData;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Rect;
            import android.media.AudioAttributes;
            import android.media.AudioFormat;
            import android.media.AudioTrack;
            import android.media.MediaCodec;
            import android.media.MediaCrypto;
            import android.media.MediaExtractor;
            import android.media.MediaFormat;
            import android.net.Uri;
            import android.util.Log;
            import android.view.ScrollCaptureSession;
            import android.view.Surface;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.FaceDao;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.FaceRecord;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.ai.edge.litertlm.ToolKt;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.face.FaceDetector;
            import com.google.mlkit.vision.label.ImageLabeler;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.text.Text;
            import com.google.mlkit.vision.text.TextRecognizer;
            import java.io.ByteArrayOutputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.function.Consumer;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 16 */    public final class I0iOI0o1i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0iOI0o1i(Conversation conversation, List list, IO1OIo01l1 iO1OIo01l1, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            super(2, iOoil1iiIilo);
/* 3 */             this.I00iOIl = 9;
/* 5 */             this.I00iiO = conversation;
/* 7 */             this.I00ilI0I1 = list;
/* 9 */             this.I00ilO0 = iO1OIo01l1;
/* 11 */            this.I00iio = context;
                }

                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:39:0x00e5, B:41:0x00f1, B:42:0x00f4, B:23:0x004f, B:26:0x0066, B:28:0x0074, B:29:0x00a2, B:32:0x00b1, B:34:0x00bf, B:35:0x00d5, B:15:0x0032, B:18:0x003c), top: B:56:0x000c }] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[Catch: all -> 0x0021, PHI: r2 r7 r12
                  0x00b1: PHI (r2v6 IoO10oI0o) = (r2v5 IoO10oI0o), (r2v14 IoO10oI0o) binds: [B:30:0x00ae, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]
                  0x00b1: PHI (r7v3 OOo0ll111) = (r7v2 OOo0ll111), (r7v9 OOo0ll111) binds: [B:30:0x00ae, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]
                  0x00b1: PHI (r12v12 java.lang.Object) = (r12v11 java.lang.Object), (r12v0 java.lang.Object) binds: [B:30:0x00ae, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:39:0x00e5, B:41:0x00f1, B:42:0x00f4, B:23:0x004f, B:26:0x0066, B:28:0x0074, B:29:0x00a2, B:32:0x00b1, B:34:0x00bf, B:35:0x00d5, B:15:0x0032, B:18:0x003c), top: B:56:0x000c }] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:39:0x00e5, B:41:0x00f1, B:42:0x00f4, B:23:0x004f, B:26:0x0066, B:28:0x0074, B:29:0x00a2, B:32:0x00b1, B:34:0x00bf, B:35:0x00d5, B:15:0x0032, B:18:0x003c), top: B:56:0x000c }] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00f1 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:39:0x00e5, B:41:0x00f1, B:42:0x00f4, B:23:0x004f, B:26:0x0066, B:28:0x0074, B:29:0x00a2, B:32:0x00b1, B:34:0x00bf, B:35:0x00d5, B:15:0x0032, B:18:0x003c), top: B:56:0x000c }] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e4 -> B:39:0x00e5). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I00000oIO(Object obj) throws Throwable {
                    OOo0ll111 oOo0ll111;
                    IoO10oI0o ioO10oI0oI0000Il00O;
                    O1I1OOiol o1I1OOiol;
                    Ii1olII1lO1 ii1olII1lO1I0000oI00;
                    O1I1OOiol o1I1OOiol2;
                    Ii1olII1lO1 ii1olII1lO1;
/* 3 */             Ii1l01l ii1l01l = (Ii1l01l) this.I00ilO0;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
                    try {
                    } catch (Throwable th) {
/* 254 */               if (oOo0ll111.I00iOIl == 0) {
/* 256 */                   O1I1OOiol o1I1OOiol3 = OiIOOIOIo.I00000oIO;
/* 262 */                   if (o1I1OOiol3.I000II()) {
/* 266 */                       o1I1OOiol3.I000o00OoI0I("Max retries (0) reached for SSE reconnection, closing session");
                            }
/* 269 */                   throw th;
                        }
/* 270 */               O1I1OOiol o1I1OOiol4 = OiIOOIOIo.I00000oIO;
/* 276 */               if (o1I1OOiol4.I000II()) {
/* 300 */                   o1I1OOiol4.I000o00OoI0I("SSE reconnection attempt " + (oOo0ll111.I00iOIl + 1) + " failed");
                        }
                        oOo0ll111.I00iOIl++;
                    }
/* 13 */            if (i == 0) {
/* 65 */                lIoii1l01l0i.I00000oOI(obj);
/* 70 */                OOo0ll111 oOo0ll1112 = new OOo0ll111();
/* 73 */                oOo0ll1112.I00iOIl = 1;
/* 75 */                oOo0ll111 = oOo0ll1112;
/* 78 */                if (oOo0ll111.I00iOIl <= 0) {
/* 82 */                    iOiOO1O1.I00000oIO(ii1l01l.I00iOIl);
/* 85 */                    long j = ii1l01l.I00iio;
/* 87 */                    this.I00iiO = oOo0ll111;
/* 89 */                    this.I00iio = null;
/* 91 */                    this.I00ilI0I1 = null;
/* 93 */                    this.I00iiI = 1;
/* 99 */                    if (il0l1o1l.I00000oOI(j, this) != ii0111o) {
/* 103 */                       int i2 = Ii1l01l.I00lll10;
/* 105 */                       ioO10oI0oI0000Il00O = ii1l01l.I0000Il00O();
/* 109 */                       o1I1OOiol = OiIOOIOIo.I00000oIO;
/* 115 */                       if (o1I1OOiol.I000II()) {
                                }
/* 163 */                       IoIlI1oli ioIlI1oli = ii1l01l.I00l0OO0IO;
/* 165 */                       this.I00iiO = oOo0ll111;
/* 167 */                       this.I00iio = ioO10oI0oI0000Il00O;
/* 169 */                       this.I00iiI = 2;
/* 171 */                       obj = ioIlI1oli.I0000Il00O(ioO10oI0oI0000Il00O, this);
/* 175 */                       if (obj == ii0111o) {
                                }
                            }
/* 228 */                   return ii0111o;
                        }
/* 310 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 15 */            if (i == 1) {
/* 59 */                oOo0ll111 = (OOo0ll111) this.I00iiO;
/* 61 */                lIoii1l01l0i.I00000oOI(obj);
/* 103 */               int i22 = Ii1l01l.I00lll10;
/* 105 */               ioO10oI0oI0000Il00O = ii1l01l.I0000Il00O();
/* 109 */               o1I1OOiol = OiIOOIOIo.I00000oIO;
/* 115 */               if (o1I1OOiol.I000II()) {
/* 160 */                   o1I1OOiol.I000o00OoI0I("Sending SSE request " + ioO10oI0oI0000Il00O.I00000oIO + " (attempt " + (oOo0ll111.I00iOIl + 1) + "/1)");
                        }
/* 163 */               IoIlI1oli ioIlI1oli2 = ii1l01l.I00l0OO0IO;
/* 165 */               this.I00iiO = oOo0ll111;
/* 167 */               this.I00iio = ioO10oI0oI0000Il00O;
/* 169 */               this.I00iiI = 2;
/* 171 */               obj = ioIlI1oli2.I0000Il00O(ioO10oI0oI0000Il00O, this);
/* 175 */               if (obj == ii0111o) {
/* 180 */                   ii1olII1lO1I0000oI00 = ((IoIlIolo10o) obj).I0000oI00();
/* 184 */                   o1I1OOiol2 = OiIOOIOIo.I00000oIO;
/* 190 */                   if (o1I1OOiol2.I000II()) {
                            }
/* 214 */                   this.I00iiO = oOo0ll111;
/* 216 */                   this.I00iio = null;
/* 218 */                   this.I00ilI0I1 = ii1olII1lO1I0000oI00;
/* 220 */                   this.I00iiI = 3;
/* 226 */                   if (OiIOOIOIo.I00000oIO(ii1olII1lO1I0000oI00, this) != ii0111o) {
                            }
                        }
/* 228 */               return ii0111o;
                    }
/* 17 */            if (i != 2) {
/* 19 */                if (i != 3) {
/* 39 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                    return null;
                        }
/* 23 */                ii1olII1lO1 = (Ii1olII1lO1) this.I00ilI0I1;
/* 27 */                oOo0ll111 = (OOo0ll111) this.I00iiO;
/* 29 */                lIoii1l01l0i.I00000oOI(obj);
/* 240 */               if (O0000Ioio00.I0000O(ii1olII1lO1.I0000O(), IoOIoo.I00ilI0I1)) {
/* 243 */                   ii1l01l.I00io1l = false;
                        }
/* 249 */               ii1l01l.I00iOIl = ii1olII1lO1.I0000Il00O();
/* 310 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 45 */            ioO10oI0oI0000Il00O = (IoO10oI0o) this.I00iio;
/* 49 */            oOo0ll111 = (OOo0ll111) this.I00iiO;
/* 51 */            lIoii1l01l0i.I00000oOI(obj);
/* 180 */           ii1olII1lO1I0000oI00 = ((IoIlIolo10o) obj).I0000oI00();
/* 184 */           o1I1OOiol2 = OiIOOIOIo.I00000oIO;
/* 190 */           if (o1I1OOiol2.I000II()) {
/* 211 */               o1I1OOiol2.I000o00OoI0I("Receive response for reconnection SSE request to " + ioO10oI0oI0000Il00O.I00000oIO);
                    }
/* 214 */           this.I00iiO = oOo0ll111;
/* 216 */           this.I00iio = null;
/* 218 */           this.I00ilI0I1 = ii1olII1lO1I0000oI00;
/* 220 */           this.I00iiI = 3;
/* 226 */           if (OiIOOIOIo.I00000oIO(ii1olII1lO1I0000oI00, this) != ii0111o) {
/* 229 */               ii1olII1lO1 = ii1olII1lO1I0000oI00;
/* 240 */               if (O0000Ioio00.I0000O(ii1olII1lO1.I0000O(), IoOIoo.I00ilI0I1)) {
                        }
/* 249 */               ii1l01l.I00iOIl = ii1olII1lO1.I0000Il00O();
/* 310 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 228 */           return ii0111o;
                }

                private final Object I000II(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 26 */                Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 30 */                IillIill1IO1 iillIill1IO1 = (IillIill1IO1) this.I00iio;
/* 32 */                Function3 function3 = iillIill1IO1.I010ioo;
/* 46 */                long jI000II = OooIOilolOo.I000II(iillIill1IO1.I010l10O ? -1.0f : 1.0f, ((IilIoiI1Oo01) this.I00ilI0I1).I00000oIO);
/* 56 */                OIilII oIilII = (OIilII) this.I00ilO0;
/* 58 */                IillI1lo11l0 iillI1lo11l0 = IillIi1.I00000oIO;
/* 75 */                Float f = new Float(oIilII == OIilII.I00iOIl ? OooIOilolOo.I0000O(jI000II) : OooIOilolOo.I0000Il00O(jI000II));
/* 78 */                this.I00iiI = 1;
/* 84 */                if (function3.invoke(ii0110, f, this) == ii0111o) {
/* 86 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 87 */            return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000O01llI0(Object obj) throws Throwable {
                    IlI00iOi1 ilI00iOi1;
/* 3 */             I0IO1io0I i0IO1io0I = (I0IO1io0I) this.I00ilO0;
/* 7 */             O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilI0I1;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiI;
/* 15 */            if (i == 0) {
/* 33 */                lIoii1l01l0i.I00000oOI(obj);
/* 38 */                IlI00iOi1 ilI00iOi12 = new IlI00iOi1();
/* 47 */                String strI00000oOI = o1oIOiI11o0.I00000oOI((Context) this.I00iio, o1oIOiI11o0.I000OiO);
/* 51 */                this.I00iiO = ilI00iOi12;
/* 53 */                this.I00iiI = 1;
/* 62 */                Object objI0000oI00 = iOi1II01i0.I0000oI00(IlI00iOi1.I00000oOI, new IlI00Ii0III(ilI00iOi12, strI00000oOI, null), this);
/* 66 */                if (objI0000oI00 == ii0111o) {
/* 68 */                    return ii0111o;
                        }
/* 70 */                obj = objI0000oI00;
/* 71 */                ilI00iOi1 = ilI00iOi12;
                    } else {
/* 17 */                if (i != 1) {
/* 29 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                    return null;
                        }
/* 21 */                ilI00iOi1 = (IlI00iOi1) this.I00iiO;
/* 23 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 78 */            if (((Boolean) obj).booleanValue()) {
/* 80 */                o1oIOiI11o0.I00IlilI0i0i = ilI00iOi1;
/* 84 */                i0IO1io0I.invoke("");
                    } else {
/* 90 */                i0IO1io0I.invoke("Failed to load face-recognition model");
                    }
/* 93 */            return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000iOII(Object obj) throws Throwable {
/* 3 */             Context context = (Context) this.I00iio;
/* 7 */             IlI1loI1lO1 ilI1loI1lO1 = (IlI1loI1lO1) this.I00iiO;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiI;
/* 14 */            if (i == 0) {
/* 29 */                lIoii1l01l0i.I00000oOI(obj);
/* 38 */                FaceDao faceDaoI001IO000 = BoxChatDatabase.I000l1.I000OiO(context).I001IO000();
/* 44 */                String str = (String) this.I00ilI0I1;
/* 48 */                String str2 = (String) this.I00ilO0;
/* 50 */                this.I00iiI = 1;
/* 56 */                if (faceDaoI001IO000.rename(str, str2, this) == ii0111o) {
/* 58 */                    return ii0111o;
                        }
                    } else {
/* 16 */                if (i != 1) {
/* 24 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 27 */                    return null;
                        }
/* 18 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 59 */            ilI1loI1lO1.I000OiO(context);
/* 62 */            return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000lI(Object obj) throws Throwable {
/* 5 */             Context context = (Context) this.I00iio;
/* 9 */             OO0l00Ii10 oO0l00Ii10 = (OO0l00Ii10) this.I00ilO0;
/* 13 */            IlI1loI1lO1 ilI1loI1lO1 = (IlI1loI1lO1) this.I00iiO;
/* 15 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 17 */            int i = this.I00iiI;
                    try {
/* 21 */                if (i == 0) {
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 42 */                    ilI1loI1lO1.getClass();
/* 51 */                    FaceDao faceDaoI001IO000 = BoxChatDatabase.I000l1.I000OiO(context).I001IO000();
/* 60 */                    String str = (String) this.I00ilI0I1;
/* 62 */                    float[] fArr = oO0l00Ii10.I00000oOI;
/* 67 */                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(fArr.length * 4);
/* 75 */                    byteBufferAllocate.asFloatBuffer().put(fArr);
/* 78 */                    byte[] bArrArray = byteBufferAllocate.array();
/* 82 */                    Bitmap bitmapCreateScaledBitmap = oO0l00Ii10.I00000oIO;
/* 92 */                    int iMax = Math.max(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
/* 98 */                    if (iMax > 160) {
/* 104 */                       float f = 160.0f / iMax;
/* 119 */                       bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) (bitmapCreateScaledBitmap.getWidth() * f), (int) (bitmapCreateScaledBitmap.getHeight() * f), true);
                            }
/* 125 */                   ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 132 */                   bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
/* 149 */                   FaceRecord faceRecord = new FaceRecord(0L, str, bArrArray, byteArrayOutputStream.toByteArray(), System.currentTimeMillis(), 1, null);
/* 152 */                   this.I00iiI = 1;
/* 158 */                   if (faceDaoI001IO000.insert(faceRecord, this) == ii0111o) {
/* 160 */                       return ii0111o;
                            }
                        } else {
/* 23 */                    if (i != 1) {
/* 35 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                        return null;
                            }
/* 25 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 161 */               OlO0OIIl1 olO0OIIl1 = ilI1loI1lO1.I00000oOI;
/* 168 */               IlI10IO ilI10IO = (IlI10IO) olO0OIIl1.getValue();
/* 178 */               List list = ((IlI10IO) ilI1loI1lO1.I00000oOI.getValue()).I0001Ioi1lo;
/* 184 */               ArrayList arrayList = new ArrayList();
/* 195 */               for (Object obj2 : list) {
/* 204 */                   if (((OO0l00Ii10) obj2) != oO0l00Ii10) {
/* 207 */                       arrayList.add(obj2);
                            }
                        }
/* 255 */               olO0OIIl1.I000lI(null, IlI10IO.I00000oIO(ilI10IO, null, false, null, "Saved \"" + ((String) this.I00ilI0I1) + "\"", null, arrayList, null, 0.0f, false, false, false, 2007));
/* 258 */               ilI1loI1lO1.I000OiO(context);
                    } catch (Throwable th) {
/* 266 */               Log.e("FaceRecViewModel", "save face failed", th);
/* 287 */               ilI1loI1lO1.I000O01llI0("Couldn't save: " + th.getMessage());
                    }
/* 290 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
                
                    if (r2.I00000oIO(r3, r14) == r0) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
                
                    if (r2.I00000oIO(r3, r14) != r0) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
                
                    if (p000.ilOlI1o001Io.I00000oIO(r15, r1, r14) == r0) goto L28;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000o00OoI0I(Object obj) throws Throwable {
/* 4 */             IlOil1ii ilOil1ii = (IlOil1ii) this.I00iio;
/* 9 */             OI10Ol0 oI10Ol0 = (OI10Ol0) this.I00ilI0I1;
/* 11 */            Object obj2 = Ii0111o.I00iOIl;
/* 13 */            int i = this.I00iiI;
/* 17 */            int i2 = 1;
/* 18 */            int i3 = 2;
/* 19 */            if (i != 0) {
/* 21 */                if (i != 1) {
/* 23 */                    if (i == 2) {
/* 37 */                        lIoii1l01l0i.I00000oOI(obj);
/* 93 */                        this.I00iiI = 3;
                            } else if (i != 3 && i != 4) {
/* 32 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                        return null;
                            }
                        }
/* 41 */                lIoii1l01l0i.I00000oOI(obj);
/* 172 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 46 */            lIoii1l01l0i.I00000oOI(obj);
/* 51 */            OlO00IIi olO00IIi = (OlO00IIi) this.I00iiO;
/* 55 */            if (olO00IIi != Ol00III.I00000oIO) {
/* 69 */                IOoil1iiIilo iOoil1iiIilo = null;
/* 70 */                if (olO00IIi == Ol00III.I00000oOI) {
/* 75 */                    OliO0olIi oliO0olIiI000OiO = ((I01OooO0o0o) oI10Ol0).I000OiO();
/* 81 */                    IIo10olO0 iIo10olO0 = new IIo10olO0(i3, iOoil1iiIilo, i2);
/* 84 */                    this.I00iiI = 2;
/* 90 */                    if (ilOoO00.I00000oOI(oliO0olIiI000OiO, iIo10olO0, this) != obj2) {
/* 93 */                        this.I00iiI = 3;
                            }
                        } else {
/* 105 */                   OliO0olIi oliO0olIiI000OiO2 = ((I01OooO0o0o) oI10Ol0).I000OiO();
/* 111 */                   OlO001lI01Io olO001lI01Io = new OlO001lI01Io(olO00IIi, null);
/* 114 */                   int i4 = IlOlliIl1l10.I00000oIO;
/* 123 */                   IO10i01 iO10i01 = new IO10i01(olO001lI01Io, oliO0olIiI000OiO2, Il00o11.I00iOIl, -2, IIII0i.I00iOIl);
/* 130 */                   I0I1oi i0I1oi = new I0I1oi(i3, iOoil1iiIilo, 10);
/* 136 */                   IlOlOlI0 ilOlOlI0 = new IlOlOlI0(0);
/* 139 */                   ilOlOlI0.I00iiI = iO10i01;
/* 141 */                   ilOlOlI0.I00iiO = i0I1oi;
/* 143 */                   VarHandle.storeStoreFence();
/* 150 */                   IlOil1ii ilOil1iiI00000oIO = iIOIO0IO0l.I00000oIO(iIOIO0IO0l.I00000oIO(ilOlOlI0));
/* 160 */                   I0iOI0o1i i0iOI0o1i = new I0iOI0o1i(ilOil1ii, oI10Ol0, this.I00ilO0, iOoil1iiIilo, 20);
/* 163 */                   this.I00iiI = 4;
                        }
/* 171 */               return obj2;
                    }
/* 57 */            this.I00iiI = 1;
                }

                private final Object I00100l0(Object obj) throws Throwable {
/* 3 */             OI10Ol0 oI10Ol0 = (OI10Ol0) this.I00ilI0I1;
/* 7 */             Ol00I1i00 ol00I1i00 = (Ol00I1i00) this.I00iiO;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiI;
/* 15 */            if (i == 0) {
/* 29 */                lIoii1l01l0i.I00000oOI(obj);
/* 32 */                int iOrdinal = ol00I1i00.ordinal();
/* 36 */                if (iOrdinal == 0) {
/* 63 */                    IlOil1ii ilOil1ii = (IlOil1ii) this.I00iio;
/* 65 */                    this.I00iiO = null;
/* 67 */                    this.I00iiI = 1;
/* 73 */                    if (ilOil1ii.I00000oIO(oI10Ol0, this) == ii0111o) {
/* 75 */                        return ii0111o;
                            }
                        } else if (iOrdinal != 1) {
/* 41 */                    if (iOrdinal != 2) {
/* 57 */                        I000II.I00000oIO();
/* 13 */                        return null;
                            }
/* 43 */                    Object obj2 = this.I00ilO0;
/* 47 */                    if (obj2 == Oiolio0iO1.I00000oIO) {
/* 49 */                        oI10Ol0.I0000oI00();
                            } else {
/* 53 */                        oI10Ol0.I0001Ioi1lo(obj2);
                            }
                        }
                    } else {
/* 17 */                if (i != 1) {
/* 25 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        }
/* 19 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 76 */            return OoiIlOl1iI.I00000oIO;
                }

                private final Object I00111O(Object obj) throws Throwable {
/* 3 */             OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 7 */             OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilO0;
/* 13 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 15 */            int i = this.I00iiI;
                    try {
                        try {
/* 18 */                    if (i == 0) {
/* 37 */                        lIoii1l01l0i.I00000oOI(obj);
/* 53 */                        OloIIoII1oo oloIIoII1ooProcess = ((FaceDetector) this.I00iiO).process(InputImage.fromBitmap((Bitmap) this.I00iio, 0));
/* 57 */                        this.I00iiI = 1;
/* 59 */                        obj = lOio0oO.I00000oIO(oloIIoII1ooProcess, this);
/* 63 */                        if (obj == ii0111o) {
/* 65 */                            return ii0111o;
                                }
                            } else {
/* 20 */                        if (i != 1) {
/* 32 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                            return null;
                                }
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 72 */                    oI10i0Il.setValue(Iloo0ilo.I000O01llI0((List) obj));
                        } catch (Exception e) {
/* 93 */                    String str = "Error: " + e.getMessage();
/* 97 */                    List list = Iloo0ilo.I00000oIO;
/* 99 */                    oI10i0Il.setValue(str);
/* 120 */                   Log.e("GeminiNanoHub", "face detect error: " + e.getMessage());
                        }
/* 77 */                oI10i0Il2.setValue(Boolean.FALSE);
/* 124 */               return OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 127 */               List list2 = Iloo0ilo.I00000oIO;
/* 131 */               oI10i0Il2.setValue(Boolean.FALSE);
/* 168 */               throw th;
                    }
                }

                private final Object I001IIilI0O(Object obj) throws Throwable {
/* 4 */             OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 9 */             OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilO0;
/* 15 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 17 */            int i = this.I00iiI;
                    try {
                        try {
/* 20 */                    if (i == 0) {
/* 42 */                        lIoii1l01l0i.I00000oOI(obj);
/* 58 */                        OloIIoII1oo oloIIoII1ooProcess = ((ImageLabeler) this.I00iiO).process(InputImage.fromBitmap((Bitmap) this.I00iio, 0));
/* 62 */                        this.I00iiI = 1;
/* 64 */                        obj = lOio0oO.I00000oIO(oloIIoII1ooProcess, this);
/* 68 */                        if (obj == ii0111o) {
/* 70 */                            return ii0111o;
                                }
                            } else {
/* 22 */                        if (i != 1) {
/* 37 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 40 */                            return null;
                                }
/* 24 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 71 */                    List list = (List) obj;
/* 98 */                    String strI00IlilI0i0i = list.isEmpty() ? "No labels found." : IOOi0Ool1i.I00IlilI0i0i(list, "\n", null, null, new Ilo10O1IlOl(22), 30);
/* 102 */                   List list2 = Iloo0ilo.I00000oIO;
/* 104 */                   oI10i0Il.setValue(strI00IlilI0i0i);
                        } catch (Exception e) {
/* 125 */                   String str = "Error: " + e.getMessage();
/* 129 */                   List list3 = Iloo0ilo.I00000oIO;
/* 131 */                   oI10i0Il.setValue(str);
/* 152 */                   Log.e("GeminiNanoHub", "label error: " + e.getMessage());
                        }
/* 109 */               oI10i0Il2.setValue(Boolean.FALSE);
/* 156 */               return OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 159 */               List list4 = Iloo0ilo.I00000oIO;
/* 163 */               oI10i0Il2.setValue(Boolean.FALSE);
/* 168 */               throw th;
                    }
                }

                private final Object I001IO000(Object obj) throws Throwable {
                    OI10i0Il oI10i0Il;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 30 */                OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilO0;
/* 34 */                Context context = (Context) this.I00iio;
/* 38 */                Uri uri = (Uri) this.I00ilI0I1;
/* 40 */                this.I00iiO = oI10i0Il2;
/* 42 */                this.I00iiI = 1;
/* 44 */                Object objI00IioO0OiOi = Iloo0ilo.I00IioO0OiOi(context, uri, this);
/* 48 */                if (objI00IioO0OiOi == ii0111o) {
/* 50 */                    return ii0111o;
                        }
/* 52 */                obj = objI00IioO0OiOi;
/* 53 */                oI10i0Il = oI10i0Il2;
                    } else {
/* 8 */                 if (i != 1) {
/* 20 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 23 */                    return null;
                        }
/* 12 */                oI10i0Il = (OI10i0Il) this.I00iiO;
/* 14 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 56 */            List list = Iloo0ilo.I00000oIO;
/* 58 */            oI10i0Il.setValue((Bitmap) obj);
/* 61 */            return OoiIlOl1iI.I00000oIO;
                }

                private final Object I001i1O0Ol(Object obj) throws Throwable {
/* 3 */             OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 7 */             OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilO0;
/* 13 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 15 */            int i = this.I00iiI;
                    try {
                        try {
/* 18 */                    if (i == 0) {
/* 37 */                        lIoii1l01l0i.I00000oOI(obj);
/* 53 */                        OloIIoII1oo oloIIoII1ooProcess = ((TextRecognizer) this.I00iiO).process(InputImage.fromBitmap((Bitmap) this.I00iio, 0));
/* 57 */                        this.I00iiI = 1;
/* 59 */                        obj = lOio0oO.I00000oIO(oloIIoII1ooProcess, this);
/* 63 */                        if (obj == ii0111o) {
/* 65 */                            return ii0111o;
                                }
                            } else {
/* 20 */                        if (i != 1) {
/* 32 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                            return null;
                                }
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 68 */                    String text = ((Text) obj).getText();
/* 76 */                    if (text.length() == 0) {
/* 78 */                        text = "No text found.";
                            }
/* 80 */                    List list = Iloo0ilo.I00000oIO;
/* 82 */                    oI10i0Il.setValue(text);
                        } catch (Exception e) {
/* 103 */                   String str = "Error: " + e.getMessage();
/* 107 */                   List list2 = Iloo0ilo.I00000oIO;
/* 109 */                   oI10i0Il.setValue(str);
/* 130 */                   Log.e("GeminiNanoHub", "scan text error: " + e.getMessage());
                        }
/* 87 */                oI10i0Il2.setValue(Boolean.FALSE);
/* 134 */               return OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 137 */               List list3 = Iloo0ilo.I00000oIO;
/* 141 */               oI10i0Il2.setValue(Boolean.FALSE);
/* 168 */               throw th;
                    }
                }

                /* JADX WARN: Path cross not found for [B:11:0x003d, B:18:0x007f], limit reached: 22 */
                /* JADX WARN: Path cross not found for [B:18:0x007f, B:11:0x003d], limit reached: 22 */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:11:0x003d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009d -> B:11:0x003d). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I001i1lo1io(Object obj) throws Throwable {
                    Ii0110 ii0110;
                    OOo0lO oOo0lO;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 8 */             if (i == 0) {
/* 46 */                lIoii1l01l0i.I00000oOI(obj);
/* 51 */                ii0110 = (Ii0110) this.I00iio;
/* 55 */                oOo0lO = new OOo0lO();
/* 60 */                oOo0lO.I00iOIl = 1.0f;
                    } else if (i == 1) {
/* 35 */                oOo0lO = (OOo0lO) this.I00iiO;
/* 39 */                Ii0110 ii01102 = (Ii0110) this.I00iio;
/* 41 */                lIoii1l01l0i.I00000oOI(obj);
/* 44 */                ii0110 = ii01102;
/* 126 */               if (oOo0lO.I00iOIl == 0.0f) {
/* 131 */                   IlIi0Il ilIi0Il = new IlIi0Il(3);
/* 134 */                   ilIi0Il.I00iiI = ii0110;
/* 136 */                   VarHandle.storeStoreFence();
/* 139 */                   Ii1Io1loiI ii1Io1loiII0000Il00O = lOIoiooI1i01.I0000Il00O(ilIi0Il);
/* 145 */                   IolIi1l iolIi1l = new IolIi1l(2, null);
/* 148 */                   this.I00iio = ii0110;
/* 150 */                   this.I00iiO = oOo0lO;
/* 152 */                   this.I00iiI = 2;
/* 158 */                   if (ilOoO00.I00000oOI(ii1Io1loiII0000Il00O, iolIi1l, this) != ii0111o) {
                            }
/* 160 */                   return ii0111o;
                        }
                    } else {
/* 12 */                if (i != 2) {
/* 29 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 16 */                oOo0lO = (OOo0lO) this.I00iiO;
/* 20 */                Ii0110 ii01103 = (Ii0110) this.I00iio;
/* 22 */                lIoii1l01l0i.I00000oOI(obj);
/* 25 */                ii0110 = ii01103;
                    }
/* 64 */            OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 68 */            IolIiIl iolIiIl = (IolIiIl) this.I00ilO0;
/* 74 */            I0O1IO i0o1io = new I0O1IO(11);
/* 77 */            i0o1io.I00ilI0I1 = oI10i0Il;
/* 79 */            i0o1io.I00iiI = iolIiIl;
/* 81 */            i0o1io.I00iiO = oOo0lO;
/* 83 */            i0o1io.I00iio = ii0110;
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            this.I00iio = ii0110;
/* 90 */            this.I00iiO = oOo0lO;
/* 92 */            this.I00iiI = 1;
/* 104 */           if (getContext().I00lli11(o0llIi.I00iio) != null) {
/* 161 */               OIiilo1Ool0o.I00000oIO();
/* 5 */                 return null;
                    }
/* 118 */           if (l1i0lii.I00000oIO(getContext()).I00000oIO(this, i0o1io) != ii0111o) {
/* 126 */               if (oOo0lO.I00iOIl == 0.0f) {
                        }
/* 64 */                OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 68 */                IolIiIl iolIiIl2 = (IolIiIl) this.I00ilO0;
/* 74 */                I0O1IO i0o1io2 = new I0O1IO(11);
/* 77 */                i0o1io2.I00ilI0I1 = oI10i0Il2;
/* 79 */                i0o1io2.I00iiI = iolIiIl2;
/* 81 */                i0o1io2.I00iiO = oOo0lO;
/* 83 */                i0o1io2.I00iio = ii0110;
/* 85 */                VarHandle.storeStoreFence();
/* 88 */                this.I00iio = ii0110;
/* 90 */                this.I00iiO = oOo0lO;
/* 92 */                this.I00iiI = 1;
/* 104 */               if (getContext().I00lli11(o0llIi.I00iio) != null) {
                        }
                    }
/* 160 */           return ii0111o;
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(500, r17) == r4) goto L30;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I001iOo1i0O(Object obj) throws Throwable {
/* 7 */             String str = ((OloIl1l1oOii) this.I00iio).I00000oIO;
/* 11 */            O11l1I o11l1I = (O11l1I) this.I00iiO;
/* 15 */            O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilI0I1;
/* 17 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 19 */            int i = this.I00iiI;
/* 22 */            int i2 = 1;
/* 23 */            if (i == 0) {
/* 44 */                lIoii1l01l0i.I00000oOI(obj);
/* 47 */                o11l1I.I0000oI00(true);
/* 50 */                o11l1I.I0001Ioi1lo(true);
                    } else {
/* 25 */                if (i != 1) {
/* 27 */                    if (i != 2) {
/* 35 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 38 */                        return null;
                            }
/* 29 */                    lIoii1l01l0i.I00000oOI(obj);
/* 129 */                   OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 132 */                   oOo0l0ii10l.I00iOIl = true;
/* 136 */                   OOo0ooi oOo0ooi = new OOo0ooi();
/* 141 */                   oOo0ooi.I00iOIl = "";
/* 143 */                   O11il1ilio1o o11il1ilio1oI00000oIO = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0);
/* 150 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00ilI0I1;
/* 155 */                   String str2 = (String) this.I00ilO0;
/* 161 */                   IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(11);
/* 164 */                   iO1oIiIi1O01.I00iiO = oOo0l0ii10l;
/* 166 */                   iO1oIiIi1O01.I00iio = o11l1I;
/* 168 */                   iO1oIiIi1O01.I00iiI = oOo0ooi;
/* 170 */                   iO1oIiIi1O01.I00ilI0I1 = o1oIOiI11o02;
/* 172 */                   VarHandle.storeStoreFence();
/* 179 */                   IlIi0Il ilIi0Il = new IlIi0Il(17);
/* 182 */                   ilIi0Il.I00iiI = o11l1I;
/* 184 */                   VarHandle.storeStoreFence();
/* 189 */                   O11iloI1 o11iloI1 = new O11iloI1(i2);
/* 192 */                   o11iloI1.I00iiI = o11l1I;
/* 194 */                   VarHandle.storeStoreFence();
/* 204 */                   O11il1ilio1o.I00000oOI(o11il1ilio1oI00000oIO, o1oIOiI11o02, str2, iO1oIiIi1O01, ilIi0Il, o11iloI1, null, OooiooIOO.I00000oIO(o11l1I), 352);
/* 207 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 40 */                lIoii1l01l0i.I00000oOI(obj);
                    }
                    while (true) {
/* 55 */                if (o1oIOiI11o0.I00IlilI0i0i == null) {
/* 57 */                    this.I00iiI = 1;
/* 65 */                    if (il0l1o1l.I00000oOI(100L, this) == ii0111o) {
                                break;
                            }
                        } else {
/* 113 */                   O11il1ilio1o.I000O01llI0(l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0), (O1oIOiI11o0) this.I00ilI0I1, o1oIOiI11o0.I001i1O0Ol && O0000Ioio00.I0000O(str, "llm_ask_image"), o1oIOiI11o0.I001i1lo1io && O0000Ioio00.I0000O(str, "llm_ask_audio"), null, null, false, 120);
/* 116 */                   this.I00iiI = 2;
                        }
                    }
/* 126 */           return ii0111o;
                }

                private final Object I001l0I00(Object obj) throws Throwable {
                    O1lo00 o1lo00;
/* 3 */             I0IO1io0I i0IO1io0I = (I0IO1io0I) this.I00ilO0;
/* 7 */             O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilI0I1;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiI;
/* 15 */            if (i == 0) {
/* 33 */                lIoii1l01l0i.I00000oOI(obj);
/* 38 */                O1lo00 o1lo002 = new O1lo00();
/* 47 */                String strI00000oOI = o1oIOiI11o0.I00000oOI((Context) this.I00iio, o1oIOiI11o0.I000OiO);
/* 51 */                this.I00iiO = o1lo002;
/* 53 */                this.I00iiI = 1;
/* 62 */                Object objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new O1llllo1(o1lo002, strI00000oOI, null), this);
/* 66 */                if (objI0000oI00 == ii0111o) {
/* 68 */                    return ii0111o;
                        }
/* 70 */                obj = objI0000oI00;
/* 71 */                o1lo00 = o1lo002;
                    } else {
/* 17 */                if (i != 1) {
/* 29 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                    return null;
                        }
/* 21 */                o1lo00 = (O1lo00) this.I00iiO;
/* 23 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 78 */            if (((Boolean) obj).booleanValue()) {
/* 80 */                o1oIOiI11o0.I00IlilI0i0i = o1lo00;
/* 84 */                i0IO1io0I.invoke("");
                    } else {
/* 90 */                i0IO1io0I.invoke("Failed to load inpainting model");
                    }
/* 93 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 788 */                   return new I0iOI0o1i((I0iOIl) this.I00iiO, (Context) this.I00iio, (O1oIOiI11o0) this.I00ilI0I1, (I0IO1io0I) this.I00ilO0, iOoil1iiIilo, 0);
                        case 1:
/* 758 */                   I0iOI0o1i i0iOI0o1i = new I0iOI0o1i((Function1) this.I00iio, (I0oOiiOi0l) this.I00ilI0I1, (O0oIIIiiO1) this.I00ilO0, iOoil1iiIilo, 1);
/* 761 */                   i0iOI0o1i.I00iiO = obj;
/* 763 */                   return i0iOI0o1i;
                        case 2:
/* 734 */                   return new I0iOI0o1i(this.I00iiO, (I10i01) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, iOoil1iiIilo, 2);
                        case 3:
/* 707 */                   I0iOI0o1i i0iOI0o1i2 = new I0iOI0o1i((OI10i0Il) this.I00iio, this.I00iiI, (byte[]) this.I00ilI0I1, (Function1) this.I00ilO0, iOoil1iiIilo);
/* 710 */                   i0iOI0o1i2.I00iiO = obj;
/* 712 */                   return i0iOI0o1i2;
                        case 4:
/* 683 */                   return new I0iOI0o1i(4, (I0IO1io0I) this.I00ilO0, iOoil1iiIilo, (O1oIOiI11o0) this.I00ilI0I1, (Context) this.I00iio);
                        case 5:
/* 659 */                   return new I0iOI0o1i((I1iOI11ioi1) this.I00iiO, (Context) this.I00iio, (Uri) this.I00ilO0, (O1oIOiI11o0) this.I00ilI0I1, iOoil1iiIilo);
                        case 6:
/* 632 */                   return new I0iOI0o1i((O111Oli) this.I00iiO, (II00Ol1Ii) this.I00iio, (String) this.I00ilI0I1, (IOO0IOIll) this.I00ilO0, iOoil1iiIilo, 6);
                        case 7:
/* 604 */                   return new I0iOI0o1i((OI10i0Il) this.I00iiO, (I10i01) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, iOoil1iiIilo, 7);
                        case 8:
/* 576 */                   return new I0iOI0o1i(iOoil1iiIilo, (IO01o11o0lI0) this.I00iiO, (ArrayList) this.I00iio, (ArrayList) this.I00ilI0I1);
                        case 9:
/* 557 */                   return new I0iOI0o1i((Conversation) this.I00iiO, (List) this.I00ilI0I1, (IO1OIo01l1) this.I00ilO0, (Context) this.I00iio, iOoil1iiIilo);
                        case 10:
/* 530 */                   return new I0iOI0o1i((IOl0iiI) this.I00iiO, (ScrollCaptureSession) this.I00iio, (Rect) this.I00ilI0I1, (Consumer) this.I00ilO0, iOoil1iiIilo, 10);
                        case 11:
/* 501 */                   return new I0iOI0o1i((Ii1l01l) this.I00ilO0, iOoil1iiIilo);
                        case 12:
/* 490 */                   return new I0iOI0o1i((IiIi1o) this.I00iiO, iOoil1iiIilo, (Map) this.I00iio, (Ool1iI0OiI) this.I00ilI0I1, (IOlOo0) this.I00ilO0, 12);
                        case 13:
/* 460 */                   return new I0iOI0o1i((IiIi1o) this.I00iiO, iOoil1iiIilo, (List) this.I00iio, (List) this.I00ilI0I1, (List) this.I00ilO0, 13);
                        case 14:
/* 430 */                   return new I0iOI0o1i((OooioIIoi0O) this.I00iiO, (O1oIOiI11o0) this.I00ilI0I1, this.I00iio, this.I00ilO0, iOoil1iiIilo, 14);
                        case 15:
/* 399 */                   I0iOI0o1i i0iOI0o1i3 = new I0iOI0o1i((Iililo00OiO) this.I00iio, (IillIill1IO1) this.I00ilI0I1, (OIilII) this.I00ilO0, iOoil1iiIilo, 15);
/* 402 */                   i0iOI0o1i3.I00iiO = obj;
/* 404 */                   return i0iOI0o1i3;
                        case 16:
/* 372 */                   I0iOI0o1i i0iOI0o1i4 = new I0iOI0o1i((IillIill1IO1) this.I00iio, (IilIoiI1Oo01) this.I00ilI0I1, (OIilII) this.I00ilO0, iOoil1iiIilo, 16);
/* 375 */                   i0iOI0o1i4.I00iiO = obj;
/* 377 */                   return i0iOI0o1i4;
                        case 17:
/* 347 */                   return new I0iOI0o1i(17, (I0IO1io0I) this.I00ilO0, iOoil1iiIilo, (O1oIOiI11o0) this.I00ilI0I1, (Context) this.I00iio);
                        case PoseLandmark.RIGHT_PINKY:
/* 322 */                   return new I0iOI0o1i((IlI1loI1lO1) this.I00iiO, (Context) this.I00iio, (String) this.I00ilI0I1, (String) this.I00ilO0, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 293 */                   return new I0iOI0o1i((IlI1loI1lO1) this.I00iiO, (Context) this.I00iio, (String) this.I00ilI0I1, (OO0l00Ii10) this.I00ilO0, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 262 */                   I0iOI0o1i i0iOI0o1i5 = new I0iOI0o1i((IlOil1ii) this.I00iio, (OI10Ol0) this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 20);
/* 265 */                   i0iOI0o1i5.I00iiO = obj;
/* 267 */                   return i0iOI0o1i5;
                        case PoseLandmark.LEFT_THUMB:
/* 240 */                   return new I0iOI0o1i((OlO00IIi) this.I00iiO, (IlOil1ii) this.I00iio, (OI10Ol0) this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 21);
                        case PoseLandmark.RIGHT_THUMB:
/* 214 */                   return new I0iOI0o1i((FaceDetector) this.I00iiO, (Bitmap) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, iOoil1iiIilo, 22);
                        case PoseLandmark.LEFT_HIP:
/* 185 */                   return new I0iOI0o1i((ImageLabeler) this.I00iiO, (Bitmap) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 156 */                   return new I0iOI0o1i((Context) this.I00iio, (Uri) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 131 */                   return new I0iOI0o1i((TextRecognizer) this.I00iiO, (Bitmap) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 100 */                   I0iOI0o1i i0iOI0o1i6 = new I0iOI0o1i((OI10i0Il) this.I00ilI0I1, (IolIiIl) this.I00ilO0, iOoil1iiIilo);
/* 103 */                   i0iOI0o1i6.I00iio = obj;
/* 105 */                   return i0iOI0o1i6;
                        case 27:
/* 85 */                    return new I0iOI0o1i((OooioIIoi0O) this.I00iiO, (O1oIOiI11o0) this.I00ilI0I1, this.I00iio, this.I00ilO0, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 56 */                    return new I0iOI0o1i(28, (I0IO1io0I) this.I00ilO0, iOoil1iiIilo, (O1oIOiI11o0) this.I00ilI0I1, (Context) this.I00iio);
                        default:
/* 31 */                    return new I0iOI0o1i((O1lo00) this.I00iiO, (Bitmap) this.I00iio, (Bitmap) this.I00ilI0I1, (O1loIO) this.I00ilO0, iOoil1iiIilo, 29);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 1:
/* 438 */                   ((I0iOI0o1i) create((I0olOi00O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 3:
/* 409 */                   ((I0iOI0o1i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 63 */                    ((I0iOI0o1i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 18 */            return ((I0iOI0o1i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:124:0x038f, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r0, r12, r34) == r6) goto L128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:127:0x03a2, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r0, r2, r34) == r6) goto L128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:168:0x0444, code lost:
                
                    if (r0 != r4) goto L138;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:530:?, code lost:
                
                    return r6;
                 */
                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:167:0x0442  */
                /* JADX WARN: Removed duplicated region for block: B:238:0x0699 A[PHI: r3 r15
                  0x0699: PHI (r3v28 android.media.MediaCodec) = 
                  (r3v20 android.media.MediaCodec)
                  (r3v20 android.media.MediaCodec)
                  (r3v20 android.media.MediaCodec)
                  (r3v30 android.media.MediaCodec)
                 binds: [B:227:0x0671, B:229:0x0677, B:248:0x06cc, B:237:0x0697] A[DONT_GENERATE, DONT_INLINE]
                  0x0699: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v26 int), (r15v27 int) binds: [B:227:0x0671, B:229:0x0677, B:248:0x06cc, B:237:0x0697] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:255:0x06db A[Catch: all -> 0x06d3, TryCatch #9 {all -> 0x06d3, blocks: (B:224:0x065c, B:228:0x0673, B:230:0x0679, B:253:0x06d5, B:255:0x06db, B:257:0x06e1, B:259:0x06eb, B:262:0x06f4, B:265:0x0705), top: B:470:0x065c }] */
                /* JADX WARN: Removed duplicated region for block: B:311:0x0819  */
                /* JADX WARN: Removed duplicated region for block: B:317:0x0852  */
                /* JADX WARN: Type inference failed for: r11v1, types: [com.google.ai.edge.litertlm.Contents] */
                /* JADX WARN: Type inference failed for: r19v0, types: [com.google.ai.edge.litertlm.Contents] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    String strI000O01llI0;
                    boolean z;
                    Object value;
                    boolean z2;
                    Object objI0000oI00;
                    Object value2;
                    AudioTrack audioTrack;
                    int playbackHeadPosition;
                    Object objLoadModel;
                    WhisperEngine whisperEngine;
                    OoiIlOl1iI ooiIlOl1iI;
                    Ii0111o ii0111o;
                    int i;
                    int i2;
                    int integer;
                    MediaExtractor mediaExtractor;
                    MediaCodec.BufferInfo bufferInfo;
                    int i3;
                    int i4;
                    int i5;
                    int iDequeueOutputBuffer;
                    Ii0111o ii0111o2;
                    int i6;
                    String str;
                    int i7;
                    int i8;
                    boolean z3;
                    float[] fArr;
                    MediaCodec mediaCodec;
                    OOo0l0ii10l oOo0l0ii10l;
                    Object objI0000Il00O;
                    AutoCloseable autoCloseable;
                    Object objI00000oIO;
                    OoiIlOl1iI ooiIlOl1iI2;
                    IOoil1iiIilo iOoil1iiIilo;
                    Object objI00000oIO2;
                    Object obj2;
                    Object objI0000oI002;
/* 3 */             int i9 = this.I00iOIl;
/* 7 */             strI000O01llI0 = "";
/* 12 */            OoiIlOl1iI ooiIlOl1iI3 = OoiIlOl1iI.I00000oIO;
/* 16 */            int integer2 = 1;
/* 17 */            fArr = null;
/* 17 */            fArr = null;
/* 17 */            float[] fArr2 = null;
                    switch (i9) {
                        case 0:
/* 2744 */                  I0iOIl i0iOIl = (I0iOIl) this.I00iiO;
/* 2746 */                  OloIl1l1oOii oloIl1l1oOii = i0iOIl.I00000oOI;
/* 2748 */                  AgentTools agentTools = i0iOIl.I00000oIO;
/* 2750 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 2752 */                  int i10 = this.I00iiI;
/* 2755 */                  if (i10 == 0) {
/* 2771 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2774 */                      O1i1O1I mcpManagerViewModel = agentTools.getMcpManagerViewModel();
/* 2778 */                      this.I00iiI = 1;
/* 2780 */                      mcpManagerViewModel.getClass();
/* 2793 */                      boolean zBooleanValue = ((Boolean) O1i1oIi1il.I00000oOI.I00iOIl.getValue()).booleanValue();
/* 2797 */                      OlO0OIIl1 olO0OIIl1 = mcpManagerViewModel.I0000O;
/* 2799 */                      if (zBooleanValue) {
/* 2826 */                          z = false;
/* 2844 */                          do {
/* 2827 */                              value = olO0OIIl1.getValue();
/* 2835 */                              z2 = true;
/* 2844 */                          } while (!olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO((O1i1IIoO1IIl) value, null, true, null, 5)));
/* 2846 */                          IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 2855 */                          objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new O1i1O1(mcpManagerViewModel, null), this);
/* 2861 */                          if (objI0000oI00 != Ii0111o.I00iOIl) {
/* 2864 */                              objI0000oI00 = ooiIlOl1iI3;
                                    }
                                } else {
/* 2820 */                          do {
/* 2801 */                              value2 = olO0OIIl1.getValue();
/* 2811 */                              z = false;
/* 2820 */                          } while (!olO0OIIl1.I000iOII(value2, O1i1IIoO1IIl.I00000oIO((O1i1IIoO1IIl) value2, Il01100l.I00iOIl, false, null, 4)));
/* 2822 */                          objI0000oI00 = ooiIlOl1iI3;
/* 2824 */                          z2 = true;
                                }
/* 2866 */                      if (objI0000oI00 == ii0111o3) {
/* 2868 */                          return ii0111o3;
                                }
                            } else {
/* 2757 */                      if (i10 != 1) {
/* 2765 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                            return null;
                                }
/* 2759 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2762 */                      z2 = true;
/* 2763 */                      z = false;
                            }
/* 2891 */                  strI000O01llI0 = ((Boolean) O1i1oIi1il.I00000oOI.I00iOIl.getValue()).booleanValue() ? agentTools.getMcpManagerViewModel().I000O01llI0() : "";
/* 2895 */                  String str2 = oloIl1l1oOii.I000oI1ioi;
/* 2905 */                  boolean z4 = strI000O01llI0.length() > 0 ? z2 : z;
/* 2914 */                  if (str2.equals("You are an AI assistant that helps users by answering questions and completes tasks using skills. For EVERY new task or request or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. First, find the most relevant skill from the following list:\n\n___SKILLS___\n\nAfter this step you MUST go to next step. You MUST NOT use `run_intent` under any circumstances at this step.\n\n2. If a relevant skill exists, use the `load_skill` tool to read its instructions. You MUST NOT use `run_intent` under any circumstances at this step.\n\n3. Follow the skill's instructions exactly to complete the task. You MUST NOT output any intermediate thoughts or status updates. No exceptions! Output ONLY the final result when successful. It should contain one-sentence summary of the action taken, and the final result of the skill.") || str2.equals("You are an AI assistant that helps users by answering questions and completing tasks using skills and tools. For EVERY new task, request, or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. EVALUATE AND ROUTE:\n   Determine if the request should be handled by a \"Skill\" (requires loading instructions) or directly by an \"MCP Tool\".\n   - If it is a Skill: Go to Step 2.\n   - If it is an MCP Tool: Go to Step 4.\n   - If nothing is found, output \"No skills or tools found\" and stop.\n\n--- SKILLS ---\n___SKILLS___\n\n--- MCP TOOLS ---\n___TOOLS___\n\n==================================================\nFLOW A: SKILL EXECUTION\n==================================================\n\n2. Find the most relevant skill from the --- SKILLS --- list. You MUST NOT use `run_intent` or `runMcpTool` under any circumstances at this step.\n\n3. Use the `load_skill` tool to read its instructions. Follow the skill's instructions exactly to complete the task.\n   - You MUST NOT output any intermediate thoughts or status updates. No exceptions!\n   - Output ONLY the final result when successful. It should contain a one-sentence summary of the action taken and the final result of the skill.\n   - Stop here once Flow A is complete.\n\n==================================================\nFLOW B: MCP TOOL DIRECT EXECUTION\n==================================================\n\n4. Find the most relevant tool from the --- MCP TOOLS --- list.\n\n5. Call the `runMcpTool` tool with the following parameters:\n   - `toolName`: The name of the tool to run. Use the exact name from the list above. Do not hallucinate the name. Pay attention to casing and plurals.\n   - `input`: The input JSON object that matches the tool's expected input schema.\n\n6. Output ONLY the final result returned by the tool. You MUST NOT output any intermediate thoughts or status updates. No exceptions!")) {
/* 2922 */                      str2 = z4 ? "You are an AI assistant that helps users by answering questions and completing tasks using skills and tools. For EVERY new task, request, or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. EVALUATE AND ROUTE:\n   Determine if the request should be handled by a \"Skill\" (requires loading instructions) or directly by an \"MCP Tool\".\n   - If it is a Skill: Go to Step 2.\n   - If it is an MCP Tool: Go to Step 4.\n   - If nothing is found, output \"No skills or tools found\" and stop.\n\n--- SKILLS ---\n___SKILLS___\n\n--- MCP TOOLS ---\n___TOOLS___\n\n==================================================\nFLOW A: SKILL EXECUTION\n==================================================\n\n2. Find the most relevant skill from the --- SKILLS --- list. You MUST NOT use `run_intent` or `runMcpTool` under any circumstances at this step.\n\n3. Use the `load_skill` tool to read its instructions. Follow the skill's instructions exactly to complete the task.\n   - You MUST NOT output any intermediate thoughts or status updates. No exceptions!\n   - Output ONLY the final result when successful. It should contain a one-sentence summary of the action taken and the final result of the skill.\n   - Stop here once Flow A is complete.\n\n==================================================\nFLOW B: MCP TOOL DIRECT EXECUTION\n==================================================\n\n4. Find the most relevant tool from the --- MCP TOOLS --- list.\n\n5. Call the `runMcpTool` tool with the following parameters:\n   - `toolName`: The name of the tool to run. Use the exact name from the list above. Do not hallucinate the name. Pay attention to casing and plurals.\n   - `input`: The input JSON object that matches the tool's expected input schema.\n\n6. Output ONLY the final result returned by the tool. You MUST NOT output any intermediate thoughts or status updates. No exceptions!" : "You are an AI assistant that helps users by answering questions and completes tasks using skills. For EVERY new task or request or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. First, find the most relevant skill from the following list:\n\n___SKILLS___\n\nAfter this step you MUST go to next step. You MUST NOT use `run_intent` under any circumstances at this step.\n\n2. If a relevant skill exists, use the `load_skill` tool to read its instructions. You MUST NOT use `run_intent` under any circumstances at this step.\n\n3. Follow the skill's instructions exactly to complete the task. You MUST NOT output any intermediate thoughts or status updates. No exceptions! Output ONLY the final result when successful. It should contain one-sentence summary of the action taken, and the final result of the skill.";
                            }
/* 2958 */                  ?? I00000oIO = (agentTools.getSkillManagerViewModel().I000OiO().isEmpty() && strI000O01llI0.length() == 0) ? null : I0iOOlloo.I00000oIO(str2, strI000O01llI0, agentTools.getSkillManagerViewModel().I000OiO());
/* 2963 */                  O111ooi11li o111ooi11li = O111ooi11li.I00000oIO;
/* 2968 */                  Context context = (Context) this.I00iio;
/* 2973 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilI0I1;
/* 2975 */                  String str3 = oloIl1l1oOii.I00000oIO;
/* 49 */                    o111ooi11li.I0000O(context, o1oIOiI11o0, o1oIOiI11o0.I001i1O0Ol, o1oIOiI11o0.I001i1lo1io, (I0IO1io0I) this.I00ilO0, (Barcode.FORMAT_UPC_A & 64) != 0 ? null : I00000oIO, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_ITF) != 0 ? Il01100l.I00iOIl : Collections.singletonList(ToolKt.tool(agentTools)), (Barcode.FORMAT_UPC_A & Barcode.FORMAT_QR_CODE) == 0, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_UPC_A) != 0 ? null : null);
/* 3006 */                  return ooiIlOl1iI3;
                        case 1:
/* 2670 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 2672 */                  int i11 = this.I00iiI;
/* 2674 */                  if (i11 == 0) {
/* 2687 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2720 */                      I000oI1ioi i000oI1ioi = new I000oI1ioi((I0olOi00O) this.I00iiO, (Function1) this.I00iio, (I0oOiiOi0l) this.I00ilI0I1, (O0oIIIiiO1) this.I00ilO0, (IOoil1iiIilo) null, 1);
/* 2726 */                      this.I00iiI = 1;
/* 2732 */                      if (il001oo1.I0000Il00O(i000oI1ioi, this) == ii0111o4) {
/* 2734 */                          return ii0111o4;
                                }
                            } else {
/* 2677 */                      if (i11 != 1) {
/* 2679 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                            return null;
                                }
/* 2683 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2736 */                  IOOlIIilOl0.I0000Il00O();
/* 17 */                    return null;
                        case 2:
/* 2577 */                  I10i01 i10i01 = (I10i01) this.I00iio;
/* 2579 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 2581 */                  int i12 = this.I00iiI;
/* 2583 */                  if (i12 == 0) {
/* 2597 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2612 */                      if (!O0000Ioio00.I0000O(this.I00iiO, i10i01.I0000oI00.getValue())) {
/* 2616 */                          I10i01 i10i012 = (I10i01) this.I00iio;
/* 2618 */                          Object obj3 = this.I00iiO;
/* 2622 */                          OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 2624 */                          OlIOiI1iI1 olIOiI1iI1 = I10i0IOl.I00000oIO;
/* 2630 */                          I110IiI0o1Il i110IiI0o1Il = (I110IiI0o1Il) oI10i0Il.getValue();
/* 2633 */                          this.I00iiI = 1;
/* 2643 */                          if (I10i01.I00000oIO(i10i012, obj3, i110IiI0o1Il, null, null, this, 12) == ii0111o5) {
/* 2669 */                              return ii0111o5;
                                    }
                                }
/* 2667 */                      return ooiIlOl1iI3;
                            }
/* 2586 */                  if (i12 != 1) {
/* 2592 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                        return null;
                            }
/* 2588 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2648 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilO0;
/* 2650 */                  OlIOiI1iI1 olIOiI1iI12 = I10i0IOl.I00000oIO;
/* 2656 */                  Function1 function1 = (Function1) oI10i0Il2.getValue();
/* 2658 */                  if (function1 != null) {
/* 2664 */                      function1.invoke(i10i01.I0000O());
                            }
/* 2667 */                  return ooiIlOl1iI3;
                        case 3:
/* 2396 */                  byte[] bArr = (byte[]) this.I00ilI0I1;
/* 2400 */                  Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 2402 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 2404 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2409 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iio;
/* 2415 */                  AudioTrack audioTrack2 = (AudioTrack) oI10i0Il3.getValue();
/* 2417 */                  if (audioTrack2 != null) {
/* 2419 */                      audioTrack2.release();
                            }
/* 2488 */                  AudioTrack audioTrackBuild = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(this.I00iiI).setChannelMask(4).build()).setTransferMode(0).setBufferSizeInBytes(bArr.length).build();
/* 2493 */                  int length = bArr.length / 2;
/* 2494 */                  oI10i0Il3.setValue(audioTrackBuild);
/* 2498 */                  audioTrackBuild.write(bArr, 0, bArr.length);
/* 2501 */                  audioTrackBuild.play();
/* 2504 */                  long j = 0;
/* 2510 */                  while (il001oo1.I0000O(ii0110) && audioTrackBuild.getPlayState() == 3 && (playbackHeadPosition = audioTrackBuild.getPlaybackHeadPosition()) < length) {
/* 2527 */                      float f = playbackHeadPosition / length;
/* 2528 */                      long jCurrentTimeMillis = System.currentTimeMillis();
/* 2538 */                      if (jCurrentTimeMillis - j > 30) {
/* 2549 */                          ((Function1) this.I00ilO0).invoke(new Float(f));
/* 2552 */                          j = jCurrentTimeMillis;
                                }
                            }
/* 2558 */                  if (il001oo1.I0000O(ii0110) && (audioTrack = (AudioTrack) oI10i0Il3.getValue()) != null) {
/* 2568 */                      audioTrack.stop();
                            }
/* 2392 */                  return ooiIlOl1iI3;
                        case 4:
/* 2298 */                  I0IO1io0I i0IO1io0I = (I0IO1io0I) this.I00ilO0;
/* 2302 */                  Context context2 = (Context) this.I00iio;
/* 2306 */                  O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00ilI0I1;
/* 2308 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 2310 */                  int i13 = this.I00iiI;
/* 2312 */                  if (i13 == 0) {
/* 2332 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2337 */                      WhisperEngine whisperEngine2 = new WhisperEngine();
/* 2342 */                      String strI00000oOI = o1oIOiI11o02.I00000oOI(context2, o1oIOiI11o02.I000OiO);
/* 2346 */                      this.I00iiO = whisperEngine2;
/* 2349 */                      this.I00iiI = 1;
/* 2351 */                      objLoadModel = whisperEngine2.loadModel(strI00000oOI, this);
/* 2355 */                      if (objLoadModel == ii0111o7) {
/* 2357 */                          return ii0111o7;
                                }
/* 2359 */                      whisperEngine = whisperEngine2;
                            } else {
/* 2315 */                      if (i13 != 1) {
/* 2327 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                            return null;
                                }
/* 2319 */                      whisperEngine = (WhisperEngine) this.I00iiO;
/* 2321 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2324 */                      objLoadModel = obj;
                            }
/* 2366 */                  if (((Boolean) objLoadModel).booleanValue()) {
/* 2368 */                      o1oIOiI11o02.I00IlilI0i0i = whisperEngine;
/* 2370 */                      i0IO1io0I.invoke("");
                            } else {
/* 2386 */                      i0IO1io0I.invoke("Failed to load Whisper model from ".concat(o1oIOiI11o02.I00000oOI(context2, o1oIOiI11o02.I000OiO)));
                            }
/* 2389 */                  return ooiIlOl1iI3;
                        case 5:
/* 1498 */                  OoiIlOl1iI ooiIlOl1iI4 = ooiIlOl1iI3;
/* 1501 */                  Context context3 = (Context) this.I00iio;
/* 1505 */                  I1iOI11ioi1 i1iOI11ioi1 = (I1iOI11ioi1) this.I00iiO;
/* 1507 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1509 */                  int i14 = this.I00iiI;
/* 1511 */                  if (i14 != 0) {
/* 1513 */                      if (i14 == 1) {
/* 1515 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1518 */                          return ooiIlOl1iI4;
                                }
/* 1521 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                        return null;
                            }
/* 1527 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1532 */                  Uri uri = (Uri) this.I00ilO0;
/* 1534 */                  String str4 = "pcm-encoding";
/* 1538 */                  MediaExtractor mediaExtractor2 = new MediaExtractor();
                            try {
/* 1541 */                      mediaExtractor2.setDataSource(context3, uri, (Map<String, String>) null);
/* 1544 */                      int trackCount = mediaExtractor2.getTrackCount();
/* 1548 */                      int i15 = 0;
                                while (true) {
/* 1549 */                          if (i15 < trackCount) {
/* 1551 */                              MediaFormat trackFormat = mediaExtractor2.getTrackFormat(i15);
/* 1555 */                              i = integer2;
/* 1559 */                              String string = trackFormat.getString("mime");
/* 1563 */                              if (string != null && OlOolloIIOl0.I000l1(string, "audio/", false)) {
/* 1576 */                                  integer = trackFormat.getInteger("sample-rate");
/* 1587 */                                  strI000O01llI0 = string;
/* 1582 */                                  integer2 = trackFormat.getInteger("channel-count");
/* 1589 */                                  i2 = i15;
                                        } else {
/* 1591 */                                  i15++;
/* 1593 */                                  integer2 = i;
                                        }
                                    } else {
/* 1597 */                              i = integer2;
/* 1599 */                              i2 = -1;
/* 1600 */                              integer = WhisperEngine.SAMPLE_RATE;
                                    }
                                }
/* 1602 */                      if (i2 < 0) {
/* 1604 */                          mediaExtractor2.release();
/* 1607 */                          ooiIlOl1iI = ooiIlOl1iI4;
/* 1609 */                          ii0111o = ii0111o8;
                                } else {
/* 1613 */                          mediaExtractor2.selectTrack(i2);
/* 1616 */                          MediaFormat trackFormat2 = mediaExtractor2.getTrackFormat(i2);
                                    try {
/* 1620 */                              MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(strI000O01llI0);
/* 1627 */                              float[] fArrCopyOf = new float[960000];
                                        try {
/* 1629 */                                  mediaCodecCreateDecoderByType.configure(trackFormat2, (Surface) null, (MediaCrypto) null, 0);
/* 1632 */                                  mediaCodecCreateDecoderByType.start();
/* 1637 */                                  bufferInfo = new MediaCodec.BufferInfo();
/* 1640 */                                  i3 = 0;
/* 1641 */                                  i4 = 0;
/* 1642 */                                  i5 = 0;
                                        } catch (Throwable th) {
/* 1748 */                                  th = th;
                                        }
/* 1644 */                              while (i3 == 0) {
/* 1646 */                                  OoiIlOl1iI ooiIlOl1iI5 = ooiIlOl1iI4;
/* 1650 */                                  if (i4 == 0) {
/* 1652 */                                      int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(10000L);
/* 1656 */                                      if (iDequeueInputBuffer < 0) {
/* 1750 */                                          iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 10000L);
/* 1754 */                                          if (iDequeueOutputBuffer >= 0) {
/* 1756 */                                              ByteBuffer outputBuffer = mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer);
/* 1760 */                                              if (outputBuffer != null) {
/* 1762 */                                                  MediaFormat outputFormat = mediaCodecCreateDecoderByType.getOutputFormat(iDequeueOutputBuffer);
/* 1779 */                                                  int integer3 = outputFormat.containsKey(str4) ? outputFormat.getInteger(str4) : 2;
/* 1781 */                                                  int i16 = bufferInfo.size;
/* 1789 */                                                  i6 = i3;
/* 1793 */                                                  str = str4;
/* 1796 */                                                  if (integer3 == 4) {
/* 1802 */                                                      int i17 = i16 / 4;
/* 1804 */                                                      mediaExtractor = mediaExtractor2;
                                                                try {
/* 1806 */                                                          float[] fArr3 = new float[i17];
/* 1808 */                                                          outputBuffer.asFloatBuffer().get(fArr3);
                                                                    int i18 = i17 - 1;
/* 1813 */                                                          if (integer2 <= 0) {
/* 1949 */                                                              throw new IllegalArgumentException("Step must be positive, was: " + integer2 + ".");
                                                                    }
/* 1817 */                                                          z3 = false;
/* 1817 */                                                          int i19 = 0;
/* 1818 */                                                          int iI00000oIO = lIO01iiiOOo.I00000oIO(0, i18, integer2);
/* 1822 */                                                          if (iI00000oIO >= 0) {
/* 1824 */                                                              int i20 = 0;
                                                                        while (true) {
/* 1825 */                                                                  int i21 = i5;
/* 1831 */                                                                  Iterator it = lIiioliIlo.I000O01llI0(i19, integer2).iterator();
/* 1837 */                                                                  float[] fArr4 = fArr3;
/* 1839 */                                                                  i7 = i4;
/* 1841 */                                                                  double d = 0.0d;
/* 1849 */                                                                  while (((IooO10lI) it).I00iiO) {
/* 1859 */                                                                      int iNextInt = ((IooIlO1) it).nextInt() + i20;
/* 1860 */                                                                      Ii0111o ii0111o9 = ii0111o8;
                                                                                int i22 = i17 - 1;
/* 1864 */                                                                      if (iNextInt > i22) {
/* 1866 */                                                                          iNextInt = i22;
                                                                                }
/* 1871 */                                                                      d += fArr4[iNextInt];
/* 1872 */                                                                      integer = integer;
/* 1873 */                                                                      ii0111o8 = ii0111o9;
                                                                            }
/* 1879 */                                                                  ii0111o2 = ii0111o8;
/* 1881 */                                                                  i8 = integer;
/* 1884 */                                                                  float f2 = ((float) d) / integer2;
/* 1886 */                                                                  if (i21 == fArrCopyOf.length) {
/* 1893 */                                                                      fArrCopyOf = Arrays.copyOf(fArrCopyOf, fArrCopyOf.length * 2);
                                                                            }
/* 1897 */                                                                  fArr = fArrCopyOf;
/* 1898 */                                                                  i5 = i21 + 1;
/* 1900 */                                                                  fArrCopyOf[i21] = f2;
/* 1902 */                                                                  if (i20 != iI00000oIO) {
/* 1904 */                                                                      i20 += integer2;
/* 1905 */                                                                      fArrCopyOf = fArr;
/* 1906 */                                                                      integer = i8;
/* 1907 */                                                                      fArr3 = fArr4;
/* 1909 */                                                                      i4 = i7;
/* 1911 */                                                                      ii0111o8 = ii0111o2;
/* 1913 */                                                                      i19 = 0;
                                                                            } else {
/* 1915 */                                                                      fArrCopyOf = fArr;
/* 1916 */                                                                      z3 = false;
/* 2063 */                                                                      mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, z3);
/* 2072 */                                                                      if ((bufferInfo.flags & 4) != 0) {
/* 2074 */                                                                          integer = i8;
/* 2075 */                                                                          i3 = i;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
/* 1919 */                                                              ii0111o2 = ii0111o8;
/* 1921 */                                                              i7 = i4;
/* 1923 */                                                              i8 = integer;
/* 2063 */                                                              mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, z3);
/* 2072 */                                                              if ((bufferInfo.flags & 4) != 0) {
                                                                        }
                                                                    }
                                                                } catch (Throwable th2) {
/* 1876 */                                                          th = th2;
                                                                }
                                                            } else {
/* 1950 */                                                      ii0111o2 = ii0111o8;
/* 1952 */                                                      mediaExtractor = mediaExtractor2;
/* 1954 */                                                      i7 = i4;
/* 1956 */                                                      i8 = integer;
/* 1961 */                                                      int i23 = i16 / 2;
/* 1963 */                                                      short[] sArr = new short[i23];
/* 1965 */                                                      outputBuffer.asShortBuffer().get(sArr);
                                                                int i24 = i23 - 1;
/* 1970 */                                                      if (integer2 <= 0) {
/* 2114 */                                                          throw new IllegalArgumentException("Step must be positive, was: " + integer2 + ".");
                                                                }
/* 1972 */                                                      z3 = false;
/* 1972 */                                                      int i25 = 0;
/* 1973 */                                                      int iI00000oIO2 = lIO01iiiOOo.I00000oIO(0, i24, integer2);
/* 1977 */                                                      if (iI00000oIO2 >= 0) {
/* 1979 */                                                          int i26 = 0;
                                                                    while (true) {
/* 1980 */                                                              int i27 = i5;
/* 1986 */                                                              Iterator it2 = lIiioliIlo.I000O01llI0(i25, integer2).iterator();
/* 1990 */                                                              int i28 = i23;
/* 1991 */                                                              short[] sArr2 = sArr;
/* 1995 */                                                              double d2 = 0.0d;
/* 2003 */                                                              while (((IooO10lI) it2).I00iiO) {
/* 2013 */                                                                  int iNextInt2 = ((IooIlO1) it2).nextInt() + i26;
/* 2014 */                                                                  int i29 = i28;
                                                                            int i30 = i29 - 1;
/* 2018 */                                                                  if (iNextInt2 > i30) {
/* 2020 */                                                                      iNextInt2 = i30;
                                                                            }
/* 2024 */                                                                  d2 += sArr2[iNextInt2];
/* 2025 */                                                                  i28 = i29;
                                                                        }
/* 2028 */                                                              int i31 = i28;
/* 2035 */                                                              float f3 = (((float) d2) / integer2) / 32768.0f;
/* 2037 */                                                              if (i27 == fArrCopyOf.length) {
/* 2044 */                                                                  fArrCopyOf = Arrays.copyOf(fArrCopyOf, fArrCopyOf.length * 2);
                                                                        }
/* 2048 */                                                              fArr = fArrCopyOf;
/* 2049 */                                                              i5 = i27 + 1;
/* 2051 */                                                              fArrCopyOf[i27] = f3;
/* 2053 */                                                              if (i26 != iI00000oIO2) {
/* 2055 */                                                                  i26 += integer2;
/* 2056 */                                                                  fArrCopyOf = fArr;
/* 2057 */                                                                  sArr = sArr2;
/* 2059 */                                                                  i23 = i31;
/* 2061 */                                                                  i25 = 0;
                                                                        } else {
/* 1915 */                                                                  fArrCopyOf = fArr;
/* 1916 */                                                                  z3 = false;
                                                                        }
                                                                    }
                                                                }
/* 2063 */                                                      mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, z3);
/* 2072 */                                                      if ((bufferInfo.flags & 4) != 0) {
                                                                }
                                                            }
/* 2077 */                                                  str4 = str;
/* 2079 */                                                  mediaExtractor2 = mediaExtractor;
/* 2081 */                                                  ooiIlOl1iI4 = ooiIlOl1iI5;
/* 2083 */                                                  i4 = i7;
/* 2085 */                                                  ii0111o8 = ii0111o2;
                                                        } else {
/* 2115 */                                                  ii0111o2 = ii0111o8;
/* 2117 */                                                  i6 = i3;
/* 2119 */                                                  str = str4;
/* 2121 */                                                  mediaExtractor = mediaExtractor2;
/* 2123 */                                                  i7 = i4;
/* 2126 */                                                  i8 = integer;
/* 2127 */                                                  mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                        }
                                                    } else {
/* 2131 */                                              ii0111o2 = ii0111o8;
/* 2133 */                                              i6 = i3;
/* 2135 */                                              str = str4;
/* 2137 */                                              mediaExtractor = mediaExtractor2;
/* 2139 */                                              i7 = i4;
/* 2141 */                                              i8 = integer;
                                                    }
/* 2142 */                                          integer = i8;
/* 2143 */                                          i3 = i6;
/* 2077 */                                          str4 = str;
/* 2079 */                                          mediaExtractor2 = mediaExtractor;
/* 2081 */                                          ooiIlOl1iI4 = ooiIlOl1iI5;
/* 2083 */                                          i4 = i7;
/* 2085 */                                          ii0111o8 = ii0111o2;
                                                } else {
/* 1658 */                                          ByteBuffer inputBuffer = mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer);
/* 1662 */                                          if (inputBuffer != null) {
                                                        try {
/* 1665 */                                                  int sampleData = mediaExtractor2.readSampleData(inputBuffer, 0);
/* 1669 */                                                  if (sampleData < 0) {
/* 1679 */                                                      mediaCodec = mediaCodecCreateDecoderByType;
                                                                try {
/* 1683 */                                                          mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
/* 1686 */                                                          i4 = i;
                                                                } catch (Throwable th3) {
/* 1693 */                                                          th = th3;
/* 1694 */                                                          mediaExtractor = mediaExtractor2;
/* 1696 */                                                          mediaCodecCreateDecoderByType = mediaCodec;
                                                                }
                                                            } else {
/* 1700 */                                                      mediaCodec = mediaCodecCreateDecoderByType;
/* 1712 */                                                      mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, mediaExtractor2.getSampleTime(), 0);
/* 1715 */                                                      mediaExtractor2.advance();
                                                            }
/* 1688 */                                                  mediaCodecCreateDecoderByType = mediaCodec;
/* 1750 */                                                  iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 10000L);
/* 1754 */                                                  if (iDequeueOutputBuffer >= 0) {
                                                            }
/* 2142 */                                                  integer = i8;
/* 2143 */                                                  i3 = i6;
/* 2077 */                                                  str4 = str;
/* 2079 */                                                  mediaExtractor2 = mediaExtractor;
/* 2081 */                                                  ooiIlOl1iI4 = ooiIlOl1iI5;
/* 2083 */                                                  i4 = i7;
/* 2085 */                                                  ii0111o8 = ii0111o2;
                                                        } catch (Throwable th4) {
/* 1719 */                                                  th = th4;
/* 1722 */                                                  mediaExtractor = mediaExtractor2;
/* 2234 */                                                  mediaCodecCreateDecoderByType.stop();
/* 2237 */                                                  mediaCodecCreateDecoderByType.release();
/* 2240 */                                                  mediaExtractor.release();
/* 2243 */                                                  throw th;
                                                        }
                                                    } else {
/* 1726 */                                              MediaCodec mediaCodec2 = mediaCodecCreateDecoderByType;
                                                        try {
/* 1738 */                                                  mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
/* 1741 */                                                  i4 = i;
/* 1750 */                                                  iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 10000L);
/* 1754 */                                                  if (iDequeueOutputBuffer >= 0) {
                                                            }
/* 2142 */                                                  integer = i8;
/* 2143 */                                                  i3 = i6;
/* 2077 */                                                  str4 = str;
/* 2079 */                                                  mediaExtractor2 = mediaExtractor;
/* 2081 */                                                  ooiIlOl1iI4 = ooiIlOl1iI5;
/* 2083 */                                                  i4 = i7;
/* 2085 */                                                  ii0111o8 = ii0111o2;
                                                        } catch (Throwable th5) {
/* 1744 */                                                  th = th5;
/* 1745 */                                                  mediaCodecCreateDecoderByType = mediaCodec2;
/* 1722 */                                                  mediaExtractor = mediaExtractor2;
/* 2234 */                                                  mediaCodecCreateDecoderByType.stop();
/* 2237 */                                                  mediaCodecCreateDecoderByType.release();
/* 2240 */                                                  mediaExtractor.release();
/* 2243 */                                                  throw th;
                                                        }
                                                    }
                                                }
                                            }
                                            try {
/* 2234 */                                      mediaCodecCreateDecoderByType.stop();
                                            } catch (Exception unused) {
                                            }
/* 2237 */                                  mediaCodecCreateDecoderByType.release();
/* 2240 */                                  mediaExtractor.release();
/* 2243 */                                  throw th;
                                        }
/* 2146 */                              ooiIlOl1iI = ooiIlOl1iI4;
/* 2148 */                              ii0111o = ii0111o8;
/* 2150 */                              int i32 = integer;
/* 2151 */                              MediaExtractor mediaExtractor3 = mediaExtractor2;
                                        try {
/* 2153 */                                  mediaCodecCreateDecoderByType.stop();
                                        } catch (Exception unused2) {
                                        }
/* 2156 */                              mediaCodecCreateDecoderByType.release();
/* 2159 */                              mediaExtractor3.release();
/* 2164 */                              float[] fArrCopyOf2 = Arrays.copyOf(fArrCopyOf, i5);
/* 2170 */                              if (i32 != 16000 && fArrCopyOf2.length != 0) {
/* 2185 */                                  int length2 = (int) ((fArrCopyOf2.length * 16000) / i32);
/* 2186 */                                  float[] fArr5 = new float[length2];
/* 2191 */                                  float length3 = fArrCopyOf2.length / length2;
/* 2193 */                                  for (int i33 = 0; i33 < length2; i33++) {
/* 2196 */                                      float f4 = i33 * length3;
/* 2202 */                                      int iI0000Il00O = lIiioliIlo.I0000Il00O((int) f4, 0, fArrCopyOf2.length - 1);
/* 2218 */                                      float f5 = f4 - iI0000Il00O;
/* 2227 */                                      fArr5[i33] = (fArrCopyOf2[lIiioliIlo.I0000Il00O(iI0000Il00O + 1, 0, fArrCopyOf2.length - 1)] * f5) + ((1.0f - f5) * fArrCopyOf2[iI0000Il00O]);
                                            }
/* 2232 */                                  fArrCopyOf2 = fArr5;
                                        }
/* 2172 */                              fArr2 = fArrCopyOf2;
                                    } catch (Exception unused3) {
/* 2244 */                              ooiIlOl1iI = ooiIlOl1iI4;
/* 2246 */                              ii0111o = ii0111o8;
/* 2250 */                              mediaExtractor2.release();
                                    }
                                }
                            } catch (Exception unused4) {
/* 2254 */                      ooiIlOl1iI = ooiIlOl1iI4;
/* 2256 */                      ii0111o = ii0111o8;
/* 2258 */                      i = 1;
                            }
/* 2260 */                  if (fArr2 == null || fArr2.length == 0) {
/* 2289 */                      i1iOI11ioi1.I0000oI00("Could not decode audio file");
                            } else {
/* 2268 */                      O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) this.I00ilI0I1;
/* 2272 */                      this.I00iiI = i;
/* 2274 */                      Object objI000II = i1iOI11ioi1.I000II(context3, fArr2, o1oIOiI11o03, this);
/* 2278 */                      Ii0111o ii0111o10 = ii0111o;
/* 2280 */                      if (objI000II == ii0111o10) {
/* 2282 */                          return ii0111o10;
                                }
                            }
/* 2284 */                  return ooiIlOl1iI;
                        case 6:
/* 1230 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1232 */                  int i34 = this.I00iiI;
/* 1234 */                  if (i34 != 0) {
/* 1236 */                      if (i34 == 1) {
/* 1238 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1241 */                          return ooiIlOl1iI3;
                                }
/* 1245 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                        return null;
                            }
/* 1251 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1256 */                  O111Oli o111Oli = (O111Oli) this.I00iiO;
/* 1262 */                  I0iiIiI1 i0iiIiI1 = ((II00Ol1Ii) this.I00iio).I0001Ioi1lo;
/* 1264 */                  O111OO1Oi o111OO1OiI0010I0i = o111Oli.I0010I0i();
/* 1268 */                  O111oIiol1 o111oIiol1I00111O = o111Oli.I00111O();
/* 1469 */                  ClipData clipDataNewPlainText = ClipData.newPlainText("benchmark results for " + ((String) this.I00ilI0I1), IlIi0I0.I000lI(IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0("start time (ms)", "end time (ms)", "model name", "accelerator", "prefill tokens count", "decode tokens count", "runs count", "app version", "prefill speed (tokens/sec)", "decode speed (tokens/sec)", "time to first token (sec)", "first init time (ms)", "steady init time (ms)"), ",", null, null, null, 62), "\n", IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0(Long.valueOf(o111OO1OiI0010I0i.I001l0I00()), Long.valueOf(o111OO1OiI0010I0i.I001IO000()), o111OO1OiI0010I0i.I001i1O0Ol(), o111OO1OiI0010I0i.I0010I0i(), Integer.valueOf(o111OO1OiI0010I0i.I001iOo1i0O()), Integer.valueOf(o111OO1OiI0010I0i.I00111O()), Integer.valueOf(o111OO1OiI0010I0i.I001i1lo1io()), o111OO1OiI0010I0i.I0010o(), Double.valueOf(i1Iii1O.I0000O(o111oIiol1I00111O.I001IO000(), i0iiIiI1)), Double.valueOf(i1Iii1O.I0000O(o111oIiol1I00111O.I0010I0i(), i0iiIiI1)), Double.valueOf(i1Iii1O.I0000O(o111oIiol1I00111O.I001i1O0Ol(), i0iiIiI1)), Double.valueOf(o111oIiol1I00111O.I00111O()), Double.valueOf(i1Iii1O.I0000O(o111oIiol1I00111O.I001IIilI0O(), i0iiIiI1))), ",", null, null, null, 62)));
/* 1475 */                  IOO0IOIll iOO0IOIll = (IOO0IOIll) this.I00ilO0;
/* 1477 */                  this.I00iiI = 1;
/* 1487 */                  ((I0lOi1li1Ii) iOO0IOIll).I00000oIO.I00000oIO().setPrimaryClip(clipDataNewPlainText);
                            return ooiIlOl1iI3 == ii0111o11 ? ii0111o11 : ooiIlOl1iI3;
                        case 7:
/* 1144 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1146 */                  int i35 = this.I00iiI;
/* 1148 */                  if (i35 == 0) {
/* 1161 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1166 */                      OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiO;
/* 1172 */                      I1ol0OoiOI1o i1ol0OoiOI1o = new I1ol0OoiOI1o(12);
/* 1175 */                      i1ol0OoiOI1o.I00iiI = oI10i0Il4;
/* 1177 */                      VarHandle.storeStoreFence();
/* 1184 */                      IlOil1ii ilOil1iiI00000oIO = ilOlOoO1lO.I00000oIO(lOIoiooI1i01.I0000Il00O(i1ol0OoiOI1o), -1);
/* 1192 */                      I10i01 i10i013 = (I10i01) this.I00iio;
/* 1196 */                      OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00ilI0I1;
/* 1200 */                      OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00ilO0;
/* 1203 */                      I0l0lIoI i0l0lIoI = new I0l0lIoI(2);
/* 1206 */                      i0l0lIoI.I00iiI = i10i013;
/* 1208 */                      i0l0lIoI.I00iiO = oI10i0Il5;
/* 1210 */                      i0l0lIoI.I00iio = oI10i0Il6;
/* 1212 */                      VarHandle.storeStoreFence();
/* 1215 */                      this.I00iiI = 1;
/* 1221 */                      if (ilOil1iiI00000oIO.I00000oIO(i0l0lIoI, this) == ii0111o12) {
/* 1223 */                          return ii0111o12;
                                }
                            } else {
/* 1150 */                      if (i35 != 1) {
/* 1156 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                            return null;
                                }
/* 1152 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1225 */                  return ooiIlOl1iI3;
                        case 8:
/* 943 */                   ArrayList arrayList = (ArrayList) this.I00iio;
/* 947 */                   IO01o11o0lI0 iO01o11o0lI0 = (IO01o11o0lI0) this.I00iiO;
/* 951 */                   ArrayList arrayList2 = (ArrayList) this.I00ilI0I1;
/* 953 */                   Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 955 */                   int i36 = this.I00iiI;
                            try {
                            } catch (CancellationException unused5) {
/* 1107 */                      if (l11I11lO.I0000O(4, "CXCP")) {
/* 1111 */                          Log.i("CXCP", "CapturePipeline#submitRequestInternal: CameraGraph.Session could not be acquired, requests may need re-submission");
                                }
/* 1114 */                      Iterator it3 = arrayList.iterator();
/* 1122 */                      while (it3.hasNext()) {
/* 1137 */                          ((IOi10loi) it3.next()).I00iIO(new Ioi1lIO("Capture request is cancelled because camera is closed", null, 3));
                                }
                            }
                            try {
/* 959 */                       if (i36 == 0) {
/* 995 */                           lIoii1l01l0i.I00000oOI(obj);
/* 998 */                           l11I11lO.I0000O(3, "CXCP");
/* 1003 */                          oOo0l0ii10l = new OOo0l0ii10l();
/* 1008 */                          IIll0oO iIll0oOI00000oIO = iO01o11o0lI0.I000OOo1O.I00000oIO();
/* 1012 */                          this.I00ilO0 = oOo0l0ii10l;
/* 1014 */                          this.I00iiI = 1;
/* 1016 */                          objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(this);
/* 1020 */                          if (objI0000Il00O == ii0111o13) {
                                    }
/* 1095 */                          return ii0111o13;
                                }
/* 961 */                       if (i36 == 1) {
/* 987 */                           oOo0l0ii10l = (OOo0l0ii10l) this.I00ilO0;
/* 989 */                           lIoii1l01l0i.I00000oOI(obj);
/* 992 */                           objI0000Il00O = obj;
                                } else {
/* 964 */                           if (i36 != 2) {
/* 966 */                               if (i36 == 3) {
/* 968 */                                   lIoii1l01l0i.I00000oOI(obj);
/* 971 */                                   return ooiIlOl1iI3;
                                        }
/* 975 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                                return null;
                                    }
/* 981 */                           lIoii1l01l0i.I00000oOI(obj);
/* 1080 */                          OolIOoI1IiO oolIOoI1IiO = (OolIOoI1IiO) iO01o11o0lI0.I000iOII.getValue();
/* 1082 */                          this.I00iiI = 3;
/* 1084 */                          objI00000oIO = oolIOoI1IiO.I00000oIO(this);
/* 1088 */                          if (objI00000oIO != ii0111o13) {
/* 1091 */                              objI00000oIO = ooiIlOl1iI3;
                                        break;
                                    }
                                }
/* 1026 */                      IIll1i iIll1i = (IIll1i) autoCloseable;
/* 1028 */                      boolean zI00000oIO = lOOilO.I00000oIO(arrayList2);
/* 1032 */                      oOo0l0ii10l.I00iOIl = zI00000oIO;
/* 1034 */                      if (zI00000oIO) {
/* 1036 */                          iIll1i.I000l1();
                                }
/* 1047 */                      if (l11I11lO.I0000O(3, "CXCP")) {
/* 1049 */                          Objects.toString(arrayList2);
                                }
/* 1052 */                      iIll1i.I00100l0(arrayList2);
/* 1055 */                      iOOl00.I00000oIO(autoCloseable, null);
/* 1060 */                      if (oOo0l0ii10l.I00iOIl) {
/* 1062 */                          this.I00ilO0 = null;
/* 1065 */                          this.I00iiI = 2;
/* 1071 */                          if (iOOlOiI.I00000oOI(arrayList, this) != ii0111o13) {
/* 1080 */                              OolIOoI1IiO oolIOoI1IiO2 = (OolIOoI1IiO) iO01o11o0lI0.I000iOII.getValue();
/* 1082 */                              this.I00iiI = 3;
/* 1084 */                              objI00000oIO = oolIOoI1IiO2.I00000oIO(this);
/* 1088 */                              if (objI00000oIO != ii0111o13) {
                                        }
                                    }
/* 1095 */                          return ii0111o13;
                                }
/* 971 */                       return ooiIlOl1iI3;
                            } catch (Throwable th6) {
                                try {
/* 1097 */                          throw th6;
                                } catch (Throwable th7) {
/* 1099 */                          iOOl00.I00000oIO(autoCloseable, th6);
/* 1102 */                          throw th7;
                                }
                            }
/* 1023 */                  autoCloseable = (AutoCloseable) objI0000Il00O;
                            break;
                        case 9:
/* 546 */                   Context context4 = (Context) this.I00iio;
/* 550 */                   Conversation conversation = (Conversation) this.I00iiO;
/* 558 */                   Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 560 */                   int i37 = this.I00iiI;
                            try {
/* 564 */                       if (i37 == 0) {
/* 593 */                           lIoii1l01l0i.I00000oOI(obj);
/* 604 */                           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
/* 609 */                           StringBuilder sb = new StringBuilder();
/* 614 */                           sb.append("Box Chat Export");
/* 619 */                           sb.append('\n');
/* 638 */                           sb.append("Conversation: " + conversation.getTitle());
/* 641 */                           sb.append('\n');
/* 652 */                           if (conversation.getModelName().length() > 0) {
/* 670 */                               sb.append("Model: " + conversation.getModelName());
/* 673 */                               sb.append('\n');
                                    }
/* 697 */                           sb.append("Exported: " + simpleDateFormat.format(new Date()));
/* 700 */                           sb.append('\n');
/* 711 */                           sb.append(OlOolloIIOl0.I000OiO(72, "="));
/* 714 */                           sb.append('\n');
/* 717 */                           sb.append('\n');
/* 734 */                           for (Message message : (List) this.I00ilI0I1) {
/* 757 */                               String str5 = O0000Ioio00.I0000O(message.getRole(), "user") ? "You" : "Assistant";
/* 761 */                               ooiIlOl1iI2 = ooiIlOl1iI3;
                                        try {
/* 804 */                                   sb.append("[" + simpleDateFormat.format(new Date(message.getTimestamp())) + "] " + str5 + ":");
/* 807 */                                   sb.append('\n');
/* 814 */                                   sb.append(message.getContent());
/* 817 */                                   sb.append('\n');
/* 820 */                                   sb.append('\n');
/* 823 */                                   ooiIlOl1iI3 = ooiIlOl1iI2;
                                        } catch (Exception unused6) {
/* 589 */                                   iOoil1iiIilo = null;
/* 915 */                                   IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 917 */                                   Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 921 */                                   IO1OI110o1 iO1OI110o1 = new IO1OI110o1(context4, iOoil1iiIilo, 1);
/* 925 */                                   this.I00iiI = 2;
                                            break;
                                        }
                                    }
/* 827 */                           ooiIlOl1iI2 = ooiIlOl1iI3;
/* 881 */                           String str6 = "box_" + OlOoOIi0o.I00OIl(30, Pattern.compile("[^a-zA-Z0-9]").matcher(conversation.getTitle()).replaceAll("_")) + "_" + System.currentTimeMillis() + ".txt";
/* 889 */                           boolean zI0000oI00 = IO1OIo01l1.I0000oI00(context4, str6, sb.toString());
/* 893 */                           IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 895 */                           Io11l1li io11l1li2 = O1OI1l011OO1.I00000oIO;
/* 901 */                           IO1O11 io1o11 = new IO1O11(zI0000oI00, context4, str6, null, 1);
/* 904 */                           iOoil1iiIilo = null;
                                    try {
/* 906 */                               this.I00iiI = 1;
                                        break;
                                    } catch (Exception unused7) {
/* 915 */                               IiI0oillOO10 iiI0oillOO1022 = IiiIil1lOIO.I00000oIO;
/* 917 */                               Io11l1li io11l1li3 = O1OI1l011OO1.I00000oIO;
/* 921 */                               IO1OI110o1 iO1OI110o12 = new IO1OI110o1(context4, iOoil1iiIilo, 1);
/* 925 */                               this.I00iiI = 2;
                                    }
                                } else {
/* 566 */                           if (i37 != 1 && i37 != 2) {
/* 574 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                                return null;
                                    }
/* 570 */                           lIoii1l01l0i.I00000oOI(obj);
/* 583 */                           ooiIlOl1iI2 = ooiIlOl1iI3;
                                }
                            } catch (Exception unused8) {
/* 587 */                       ooiIlOl1iI2 = ooiIlOl1iI3;
                            }
/* 935 */                   return ooiIlOl1iI2;
                        case 10:
/* 470 */                   Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 472 */                   int i38 = this.I00iiI;
/* 474 */                   if (i38 == 0) {
/* 489 */                       lIoii1l01l0i.I00000oOI(obj);
/* 494 */                       IOl0iiI iOl0iiI = (IOl0iiI) this.I00iiO;
/* 498 */                       ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.I00iio;
/* 502 */                       Rect rect = (Rect) this.I00ilI0I1;
/* 514 */                       IooO1IOlo iooO1IOlo = new IooO1IOlo(rect.left, rect.top, rect.right, rect.bottom);
/* 517 */                       this.I00iiI = 1;
/* 519 */                       objI00000oIO2 = iOl0iiI.I00000oIO(scrollCaptureSession, iooO1IOlo, this);
/* 523 */                       if (objI00000oIO2 == ii0111o15) {
/* 525 */                           return ii0111o15;
                                }
                            } else {
/* 476 */                       if (i38 != 1) {
/* 484 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                            return null;
                                }
/* 478 */                       lIoii1l01l0i.I00000oOI(obj);
/* 481 */                       objI00000oIO2 = obj;
                            }
/* 537 */                   ((Consumer) this.I00ilO0).accept(lIiool1i00.I00000oIO((IooO1IOlo) objI00000oIO2));
/* 540 */                   return ooiIlOl1iI3;
                        case 11:
/* 465 */                   return I00000oIO(obj);
                        case 12:
/* 408 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 410 */                   int i39 = this.I00iiI;
/* 412 */                   if (i39 != 0) {
/* 414 */                       if (i39 == 1) {
/* 416 */                           lIoii1l01l0i.I00000oOI(obj);
/* 419 */                           return obj;
                                }
/* 422 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                        return null;
                            }
/* 427 */                   lIoii1l01l0i.I00000oOI(obj);
/* 450 */                   IiIOI1ol0o iiIOI1ol0oI000iOII = ((IiIi1o) this.I00iiO).I000o00OoI0I().I000iOII((Map) this.I00iio, (Ool1iI0OiI) this.I00ilI0I1, (IOlOo0) this.I00ilO0);
/* 454 */                   this.I00iiI = 1;
/* 456 */                   Object objI00o0iI0io1 = iiIOI1ol0oI000iOII.I00o0iI0io1(this);
                            return objI00o0iI0io1 == ii0111o16 ? ii0111o16 : objI00o0iI0io1;
                        case 13:
/* 349 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 351 */                   int i40 = this.I00iiI;
/* 353 */                   if (i40 != 0) {
/* 355 */                       if (i40 == 1) {
/* 357 */                           lIoii1l01l0i.I00000oOI(obj);
/* 360 */                           return obj;
                                }
/* 363 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                        return null;
                            }
/* 368 */                   lIoii1l01l0i.I00000oOI(obj);
/* 391 */                   IiIOI1ol0o iiIOI1ol0oI0000Il00O = ((IiIi1o) this.I00iiO).I000o00OoI0I().I0000Il00O((List) this.I00iio, (List) this.I00ilI0I1, (List) this.I00ilO0);
/* 395 */                   this.I00iiI = 1;
/* 399 */                   Object objI0010o = ((IOi10loi) iiIOI1ol0oI0000Il00O).I0010o(this);
                            return objI0010o == ii0111o17 ? ii0111o17 : objI0010o;
                        case 14:
/* 276 */                   O1oIOiI11o0 o1oIOiI11o04 = (O1oIOiI11o0) this.I00ilI0I1;
/* 280 */                   O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiO;
/* 282 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 284 */                   int i41 = this.I00iiI;
/* 286 */                   if (i41 != 0) {
/* 288 */                       if (i41 == 1) {
/* 290 */                           lIoii1l01l0i.I00000oOI(obj);
/* 348 */                           return ooiIlOl1iI3;
                                }
/* 294 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                        return null;
                            }
/* 299 */                   lIoii1l01l0i.I00000oOI(obj);
/* 310 */                   if (O1ol100o0O.I001IO000(o1oIOiI11o04, o1ol100o0O.I000iOII) == 403) {
/* 314 */                       OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00iio;
/* 316 */                       int i42 = Iil0O0iOiIil.I00000oIO;
/* 320 */                       oI10i0Il7.setValue(Boolean.TRUE);
/* 348 */                       return ooiIlOl1iI3;
                            }
/* 324 */                   IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 326 */                   Io11l1li io11l1li4 = O1OI1l011OO1.I00000oIO;
/* 336 */                   I1iIil1I i1iIil1I = new I1iIil1I((Function1) this.I00ilO0, o1ol100o0O, iOoil1iiIilo, 18);
/* 339 */                   this.I00iiI = 1;
                            return iOi1II01i0.I0000oI00(io11l1li4, i1iIil1I, this) == ii0111o18 ? ii0111o18 : ooiIlOl1iI3;
                        case 15:
/* 212 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 214 */                   int i43 = this.I00iiI;
/* 216 */                   if (i43 != 0) {
/* 218 */                       if (i43 == 1) {
/* 220 */                           lIoii1l01l0i.I00000oOI(obj);
/* 273 */                           return ooiIlOl1iI3;
                                }
/* 224 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                        return null;
                            }
/* 229 */                   lIoii1l01l0i.I00000oOI(obj);
/* 234 */                   Ol111O1I ol111O1I = (Ol111O1I) this.I00iiO;
/* 238 */                   Iililo00OiO iililo00OiO = (Iililo00OiO) this.I00iio;
/* 242 */                   IillIill1IO1 iillIill1IO1 = (IillIill1IO1) this.I00ilI0I1;
/* 246 */                   OIilII oIilII = (OIilII) this.I00ilO0;
/* 252 */                   I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(17);
/* 255 */                   i01oIoOI01l.I00iiI = ol111O1I;
/* 257 */                   i01oIoOI01l.I00iiO = iillIill1IO1;
/* 259 */                   i01oIoOI01l.I00iio = oIilII;
/* 261 */                   VarHandle.storeStoreFence();
/* 264 */                   this.I00iiI = 1;
                            return iililo00OiO.invoke(i01oIoOI01l, this) == ii0111o19 ? ii0111o19 : ooiIlOl1iI3;
                        case 16:
/* 207 */                   return I000II(obj);
                        case 17:
/* 202 */                   return I000O01llI0(obj);
                        case PoseLandmark.RIGHT_PINKY:
/* 197 */                   return I000iOII(obj);
                        case PoseLandmark.LEFT_INDEX:
/* 192 */                   return I000lI(obj);
                        case PoseLandmark.RIGHT_INDEX:
/* 187 */                   return I00100l0(obj);
                        case PoseLandmark.LEFT_THUMB:
/* 182 */                   return I000o00OoI0I(obj);
                        case PoseLandmark.RIGHT_THUMB:
/* 177 */                   return I00111O(obj);
                        case PoseLandmark.LEFT_HIP:
/* 172 */                   return I001IIilI0O(obj);
                        case PoseLandmark.RIGHT_HIP:
/* 167 */                   return I001IO000(obj);
                        case PoseLandmark.LEFT_KNEE:
/* 162 */                   return I001i1O0Ol(obj);
                        case PoseLandmark.RIGHT_KNEE:
/* 157 */                   return I001i1lo1io(obj);
                        case 27:
/* 152 */                   return I001iOo1i0O(obj);
                        case PoseLandmark.RIGHT_ANKLE:
/* 147 */                   return I001l0I00(obj);
                        default:
/* 21 */                    Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 23 */                    int i44 = this.I00iiI;
/* 25 */                    IOoil1iiIilo iOoil1iiIilo2 = null;
/* 27 */                    if (i44 == 0) {
/* 44 */                        lIoii1l01l0i.I00000oOI(obj);
/* 50 */                        O1lo00 o1lo00 = (O1lo00) this.I00iiO;
/* 55 */                        Bitmap bitmap = (Bitmap) this.I00iio;
/* 60 */                        Bitmap bitmap2 = (Bitmap) this.I00ilI0I1;
/* 62 */                        this.I00iiI = 1;
/* 73 */                        obj2 = null;
/* 75 */                        objI0000oI002 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new I0O0il1iIl(o1lo00, bitmap, bitmap2, iOoil1iiIilo2, 25), this);
/* 79 */                        if (objI0000oI002 == ii0111o20) {
/* 81 */                            return ii0111o20;
                                }
                            } else {
/* 29 */                        if (i44 != 1) {
/* 39 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                            return null;
                                }
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        objI0000oI002 = obj;
/* 36 */                        obj2 = null;
                            }
/* 84 */                    Bitmap bitmap3 = (Bitmap) objI0000oI002;
/* 90 */                    OlO0OIIl1 olO0OIIl12 = ((O1loIO) this.I00ilO0).I00000oOI;
/* 136 */                   O1loIIIOiO o1loIIIOiOI00000oIO = bitmap3 != null ? O1loIIIOiO.I00000oIO((O1loIIIOiO) olO0OIIl12.getValue(), null, null, 0, bitmap3, 0.0f, false, null, false, 215) : O1loIIIOiO.I00000oIO((O1loIIIOiO) olO0OIIl12.getValue(), null, null, 0, null, 0.0f, false, "Inpainting failed — check logcat.", false, 159);
/* 140 */                   olO0OIIl12.getClass();
/* 143 */                   olO0OIIl12.I000lI(obj2, o1loIIIOiOI00000oIO);
/* 146 */                   return ooiIlOl1iI3;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public I0iOI0o1i(I1iOI11ioi1 i1iOI11ioi1, Context context, Uri uri, O1oIOiI11o0 o1oIOiI11o0, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 5;
/* 18 */            this.I00iiO = i1iOI11ioi1;
                    this.I00iio = context;
                    this.I00ilO0 = uri;
                    this.I00ilI0I1 = o1oIOiI11o0;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public I0iOI0o1i(IOoil1iiIilo iOoil1iiIilo, IO01o11o0lI0 iO01o11o0lI0, ArrayList arrayList, ArrayList arrayList2) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 8;
/* 19 */            this.I00iiO = iO01o11o0lI0;
                    this.I00iio = arrayList;
                    this.I00ilI0I1 = arrayList2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public I0iOI0o1i(Ii1l01l ii1l01l, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 11;
/* 20 */            this.I00ilO0 = ii1l01l;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public I0iOI0o1i(IiIi1o iiIi1o, IOoil1iiIilo iOoil1iiIilo, Object obj, Object obj2, Object obj3, int i) {
                    super(2, iOoil1iiIilo);
/* 21 */            this.I00iOIl = i;
                    this.I00iiO = iiIi1o;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                    this.I00ilO0 = obj3;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 21 */        public I0iOI0o1i(OI10i0Il oI10i0Il, int i, byte[] bArr, Function1 function1, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 3;
/* 22 */            this.I00iio = oI10i0Il;
                    this.I00iiI = i;
                    this.I00ilI0I1 = bArr;
                    this.I00ilO0 = function1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 22 */        public I0iOI0o1i(OI10i0Il oI10i0Il, IolIiIl iolIiIl, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 26;
/* 23 */            this.I00ilI0I1 = oI10i0Il;
                    this.I00ilO0 = iolIiIl;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 23 */        public I0iOI0o1i(OooioIIoi0O oooioIIoi0O, O1oIOiI11o0 o1oIOiI11o0, Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 24 */            this.I00iOIl = i;
                    this.I00iiO = oooioIIoi0O;
                    this.I00ilI0I1 = o1oIOiI11o0;
                    this.I00iio = obj;
                    this.I00ilO0 = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 24 */        public I0iOI0o1i(int i, I0IO1io0I i0IO1io0I, IOoil1iiIilo iOoil1iiIilo, O1oIOiI11o0 o1oIOiI11o0, Context context) {
                    super(2, iOoil1iiIilo);
/* 25 */            this.I00iOIl = i;
                    this.I00ilI0I1 = o1oIOiI11o0;
                    this.I00iio = context;
                    this.I00ilO0 = i0IO1io0I;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 25 */        public I0iOI0o1i(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 26 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                    this.I00ilO0 = obj3;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 26 */        public I0iOI0o1i(Object obj, Object obj2, Object obj3, Object obj4, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 27 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                    this.I00ilI0I1 = obj3;
                    this.I00ilO0 = obj4;
                }
            }
