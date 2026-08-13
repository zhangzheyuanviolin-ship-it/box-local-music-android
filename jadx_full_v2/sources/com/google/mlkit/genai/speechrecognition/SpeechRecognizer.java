            package com.google.mlkit.genai.speechrecognition;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.ContextParams;
            import android.content.pm.PackageInfo;
            import android.os.Build;
            import android.os.ParcelFileDescriptor;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaa;
            import com.google.android.gms.internal.mlkit_genai_speech.zzabg;
            import com.google.android.gms.internal.mlkit_genai_speech.zzacb;
            import com.google.android.gms.internal.mlkit_genai_speech.zzace;
            import com.google.android.gms.internal.mlkit_genai_speech.zzach;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaci;
            import com.google.android.gms.internal.mlkit_genai_speech.zzacl;
            import com.google.android.gms.internal.mlkit_genai_speech.zzacm;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaco;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaeb;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaec;
            import com.google.android.gms.internal.mlkit_genai_speech.zzakm;
            import com.google.android.gms.internal.mlkit_genai_speech.zzao;
            import com.google.android.gms.internal.mlkit_genai_speech.zzap;
            import com.google.android.gms.internal.mlkit_genai_speech.zzar;
            import com.google.android.gms.internal.mlkit_genai_speech.zzatz;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaxd;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaxk;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaxq;
            import com.google.android.gms.internal.mlkit_genai_speech.zzazq;
            import com.google.android.gms.internal.mlkit_genai_speech.zzazt;
            import com.google.android.gms.internal.mlkit_genai_speech.zzazv;
            import com.google.android.gms.internal.mlkit_genai_speech.zzazw;
            import com.google.android.gms.internal.mlkit_genai_speech.zzazy;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbb;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbd;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbe;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbg;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbi;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbj;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbl;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbn;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbnz;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbr;
            import com.google.android.gms.internal.mlkit_genai_speech.zzbt;
            import com.google.android.gms.internal.mlkit_genai_speech.zzca;
            import com.google.android.gms.internal.mlkit_genai_speech.zzcc;
            import com.google.android.gms.internal.mlkit_genai_speech.zzcf;
            import com.google.android.gms.internal.mlkit_genai_speech.zzch;
            import com.google.android.gms.internal.mlkit_genai_speech.zzci;
            import com.google.android.gms.internal.mlkit_genai_speech.zzck;
            import com.google.android.gms.internal.mlkit_genai_speech.zzcu;
            import com.google.android.gms.internal.mlkit_genai_speech.zzcw;
            import com.google.android.gms.internal.mlkit_genai_speech.zzdi;
            import com.google.android.gms.internal.mlkit_genai_speech.zzdj;
            import com.google.android.gms.internal.mlkit_genai_speech.zzdr;
            import com.google.android.gms.internal.mlkit_genai_speech.zzds;
            import com.google.android.gms.internal.mlkit_genai_speech.zzdt;
            import com.google.android.gms.internal.mlkit_genai_speech.zzeu;
            import com.google.android.gms.internal.mlkit_genai_speech.zzew;
            import com.google.android.gms.internal.mlkit_genai_speech.zzhh;
            import com.google.android.gms.internal.mlkit_genai_speech.zzhk;
            import com.google.android.gms.internal.mlkit_genai_speech.zzho;
            import com.google.android.gms.internal.mlkit_genai_speech.zzic;
            import com.google.android.gms.internal.mlkit_genai_speech.zzkm;
            import com.google.android.gms.internal.mlkit_genai_speech.zzt;
            import com.google.android.gms.internal.mlkit_genai_speech.zzv;
            import com.google.android.gms.internal.mlkit_genai_speech.zzw;
            import com.google.android.gms.internal.mlkit_genai_speech.zzxp;
            import com.google.android.gms.internal.mlkit_genai_speech.zzxq;
            import com.google.android.gms.internal.mlkit_genai_speech.zzxr;
            import com.google.android.gms.internal.mlkit_genai_speech.zzy;
            import com.google.mlkit.genai.common.DownloadStatus;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizerResponse;
            import java.io.Closeable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I000II;
            import p000.IIiOO0o;
            import p000.IOOi1I;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.Ii1Io1loiI;
            import p000.IlOil1ii;
            import p000.IllOOo00lI;
            import p000.O0ioIllo0i1;
            import p000.O1o0111OI00;
            import p000.O1o01ii1o;
            import p000.OIoi0IIoi;
            import p000.OllO00oiil;
            import p000.OoiIlOl1iI;
            import p000.ilOl0O00Il0i;
            import p000.ilOli1oOI10l;
            import p000.ilOo1lI1o10;
            import p000.lIoii1l01l0i;
            
            @Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 [2\u00020\u0001:\u0001[B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nJ\u0015\u0010\r\u001a\u00070\u000b¢\u0006\u0002\b\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010&\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u0004\u0018\u00010\u00172\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000202H\u0002¢\u0006\u0004\b5\u00104J\u001c\u00107\u001a\u00070\u000b¢\u0006\u0002\b\f2\u0006\u0010)\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010@R\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR,\u0010V\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0T\u0012\u0006\u0012\u0004\u0018\u00010U0S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizer;", "Ljava/io/Closeable;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions;", "options", "Lcom/google/mlkit/shared/logger/MLKitStatsLogger;", "mlKitStatsLogger", "Lcom/google/android/libraries/speech/transcription/recognition/grpc/GoogleAsrServiceGrpcKt$GoogleAsrServiceCoroutineStub;", "coroutineStub", "<init>", "(Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions;Lcom/google/mlkit/shared/logger/MLKitStatsLogger;Lcom/google/android/libraries/speech/transcription/recognition/grpc/GoogleAsrServiceGrpcKt$GoogleAsrServiceCoroutineStub;)V", "(Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions;)V", "", "Lcom/google/mlkit/genai/common/FeatureStatus;", "checkStatus", "(LIOoil1iiIilo;)Ljava/lang/Object;", "LOoiIlOl1iI;", "stopRecognition", "LIlOil1ii;", "Lcom/google/mlkit/genai/common/DownloadStatus;", "download", "()LIlOil1ii;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerRequest;", "request", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse;", "startRecognition", "(Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerRequest;)LIlOil1ii;", "close", "()V", "LOIoi0IIoi;", "Lcom/google/mlkit/logging/schema/SapiInferenceCommonEvent$Builder;", "Lcom/google/mlkit/logging/schema/SpeechRecognitionInferenceEvent$Builder;", "", "startTimeMs", "totalTextLength", "numPartial", "numFinal", "Lcom/google/mlkit/logging/schema/MLKitEnum$ErrorCode;", "errorCode", "logInferenceEvent", "(LOIoi0IIoi;JIIILcom/google/mlkit/logging/schema/MLKitEnum$ErrorCode;)V", "Lcom/google/android/libraries/speech/transcription/recognition/grpc/RecognitionResponse;", "response", "transformRecognitionResponse", "(Lcom/google/android/libraries/speech/transcription/recognition/grpc/RecognitionResponse;)Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse;", "", "isRecognitionAvailable", "()Z", "Lcom/google/android/libraries/speech/transcription/recognition/grpc/ClientInfo;", "buildClientInfo", "()Lcom/google/android/libraries/speech/transcription/recognition/grpc/ClientInfo;", "Lcom/google/android/libraries/speech/transcription/recognition/grpc/RecognitionRequest;", "buildRecognitionRequest", "()Lcom/google/android/libraries/speech/transcription/recognition/grpc/RecognitionRequest;", "buildStopRecognitionRequest", "Lcom/google/android/libraries/speech/transcription/recognition/grpc/ModelAvailabilityResponse;", "getFeatureStatus", "(Lcom/google/android/libraries/speech/transcription/recognition/grpc/ModelAvailabilityResponse;)I", "Lcom/google/android/libraries/speech/transcription/recognition/grpc/ModelAvailabilityResponse$ModelInfo;", "modelInfo", "", "getModelInfoIdentifier", "(Lcom/google/android/libraries/speech/transcription/recognition/grpc/ModelAvailabilityResponse$ModelInfo;)Ljava/lang/String;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerOptions;", "Lcom/google/mlkit/shared/logger/MLKitStatsLogger;", "Lcom/google/android/libraries/speech/transcription/recognition/grpc/GoogleAsrServiceGrpcKt$GoogleAsrServiceCoroutineStub;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "isAsrServiceAvailable", "Z", "Lio/grpc/ManagedChannel;", "channel$delegate", "LO0ioIllo0i1;", "getChannel", "()Lio/grpc/ManagedChannel;", "channel", "googleAsrServiceCoroutineStub", "Lcom/google/mlkit/logging/schema/SpeechRecognizerOptions;", "loggingOptions", "Lcom/google/mlkit/logging/schema/SpeechRecognizerOptions;", "Lkotlin/Function1;", "LIOoil1iiIilo;", "", "cancelRequestCallback", "Lkotlin/jvm/functions/Function1;", "LO010OIi;", "recognitionSession", "LO010OIi;", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
/* 2 */     public final class SpeechRecognizer implements Closeable {

                public static final Companion INSTANCE = new Companion(null);
                private static final zzakm zza = zzakm.AMBIENT_CONTINUOUS;
                private final SpeechRecognizerOptions zzb;
                private final zzaeb zzc;
                private final zzbl zzd;
                private final Context zze = O1o0111OI00.I0000Il00O().I00000oOI();
                private final Executor zzf;
                private final boolean zzg;
                private final O0ioIllo0i1 zzh;
                private final zzbl zzi;
                private final zzaco zzj;
                private Function1 zzk;

                /* JADX WARN: Multi-variable type inference failed */
                public SpeechRecognizer(SpeechRecognizerOptions speechRecognizerOptions, zzaeb zzaebVar, zzbl zzblVar) throws Throwable {
/* 4 */             this.zzb = speechRecognizerOptions;
/* 6 */             this.zzc = zzaebVar;
/* 8 */             this.zzd = zzblVar;
/* 20 */            Executor zza2 = speechRecognizerOptions.getZza();
/* 31 */            this.zzf = zza2 == null ? new O1o01ii1o() : zza2;
/* 43 */            this.zzh = new OllO00oiil(new IllOOo00lI() {
                        @Override
                        public final Object invoke() {
/* 3 */                     return SpeechRecognizer.zzb(this.zza);
                        }
                    });
/* 58 */            this.zzi = zzblVar == null ? new zzbl(zzg(), zzatz.zza) : zzblVar;
/* 62 */            zzacl zzaclVar = new zzacl();
/* 77 */            zzaclVar.zzc(zzhk.zzk(speechRecognizerOptions.getZzb().toLanguageTag()));
/* 82 */            zzhh zzhhVar = new zzhh();
/* 89 */            boolean z = false;
/* 90 */            zzic zzicVarListIterator = speechRecognizerOptions.getZzc().listIterator(0);
/* 99 */            while (zzicVarListIterator.hasNext()) {
/* 105 */               Integer num = (Integer) zzicVarListIterator.next();
/* 107 */               if (num != null && num.intValue() == 0) {
/* 118 */                   zzhhVar.zze(zzacm.MODE_BASIC);
                        } else if (num != null && num.intValue() == 1) {
/* 133 */                   zzhhVar.zze(zzacm.MODE_ADVANCED);
                        } else {
/* 139 */                   zzhhVar.zze(zzacm.MODE_UNKNOWN);
                        }
                    }
/* 147 */           zzaclVar.zzd(zzhhVar.zzg());
/* 154 */           this.zzj = zzaclVar.zze();
/* 162 */           this.zzk = new zzb(null);
                    try {
/* 172 */               PackageInfo packageInfo = this.zze.getPackageManager().getPackageInfo("com.google.android.tts", 0);
/* 176 */               if (packageInfo != null) {
/* 188 */                   if (packageInfo.getLongVersionCode() >= 210592173) {
/* 190 */                       z = true;
                            }
                        }
                    } catch (Exception e) {
/* 197 */               Log.e("SpeechRecognizer", "Failed to check SBG version code", e);
                    }
/* 200 */           this.zzg = z;
/* 202 */           zzaeb zzaebVar2 = this.zzc;
/* 206 */           zzxr zzxrVar = new zzxr();
/* 211 */           zzace zzaceVar = new zzace();
/* 216 */           zzaceVar.zza(this.zzj);
/* 223 */           zzxrVar.zzd(zzaceVar.zzb());
/* 232 */           zzaebVar2.zzc(zzaec.zzg(zzxrVar, 1), zzxq.SPEECH_RECOGNITION_CREATE);
                }

                public static final zzdr zza(SpeechRecognizer speechRecognizer) {
/* 5 */             zzdt zzdtVarZza = zzds.zza(zzdr.zza());
/* 9 */             zzdi zzdiVarZza = zzdj.zza();
/* 17 */            zzdiVarZza.zzb(speechRecognizer.zzf());
/* 22 */            zzdiVarZza.zza(zzakm.AMBIENT_CONTINUOUS);
/* 25 */            SpeechRecognizerOptions speechRecognizerOptions = speechRecognizer.zzb;
/* 35 */            zzdiVarZza.zzd(speechRecognizerOptions.getZzb().toLanguageTag());
/* 40 */            zzdiVarZza.zze(com.google.android.gms.internal.mlkit_genai_speech.zzm.RECOGNIZER_MODE_ONDEVICE_ONLY);
/* 43 */            zzbb zzbbVarZza = zzbd.zza();
/* 47 */            zzbe zzbeVarZza = zzbi.zza();
/* 53 */            zzbeVarZza.zzb(zzbg.OPTIMIZE_LATENCY);
/* 57 */            zzbeVarZza.zza(true);
/* 66 */            zzbbVarZza.zzb((zzbi) zzbeVarZza.zzn());
/* 69 */            zzcu zzcuVarZza = zzcw.zza();
/* 73 */            zzcuVarZza.zza(true);
/* 82 */            zzbbVarZza.zzc((zzcw) zzcuVarZza.zzn());
/* 97 */            if (speechRecognizerOptions.getZzc().contains(1)) {
/* 99 */                zzw zzwVarZza = zzaa.zza();
/* 105 */               zzwVarZza.zza(zzy.ALWAYS_ENFORCED);
/* 114 */               zzbbVarZza.zza((zzaa) zzwVarZza.zzn());
                    }
/* 117 */           zzeu zzeuVarZza = zzew.zza();
/* 121 */           zzeuVarZza.zza(true);
/* 130 */           zzbbVarZza.zzd((zzew) zzeuVarZza.zzn());
/* 139 */           zzdiVarZza.zzc((zzbd) zzbbVarZza.zzn());
/* 148 */           zzdtVarZza.zzb((zzdj) zzdiVarZza.zzn());
/* 151 */           return zzdtVarZza.zza();
                }

                public static final zzaxd zzb(SpeechRecognizer speechRecognizer) {
/* 10 */            zzazq zzazqVarZzc = zzazq.zzc(new ComponentName("com.google.android.tts", "com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService"));
/* 14 */            Context context = speechRecognizer.zze;
/* 16 */            zzazw zzazwVarZzd = zzazw.zzd(zzazqVarZzc, context);
/* 20 */            zzho zzhoVarZzk = zzho.zzk("com.google.android.tts");
/* 24 */            Executor executor = speechRecognizer.zzf;
/* 30 */            zzazwVarZzd.zzf(zzkm.zza(context, zzhoVarZzk, executor));
/* 35 */            zzazt zzaztVarZzb = zzazv.zza.zzb();
/* 40 */            zzaztVarZzb.zzc(true);
/* 43 */            zzaztVarZzb.zza(true);
/* 50 */            zzazwVarZzd.zzg(zzaztVarZzb.zzd());
/* 55 */            zzazwVarZzd.zze(zzazy.zza);
/* 58 */            zzazwVarZzd.zzc(executor);
/* 61 */            return zzazwVarZzd.zza();
                }

                public static final void zzd(SpeechRecognizer speechRecognizer, OIoi0IIoi oIoi0IIoi, long j, int i, int i2, int i3, zzxp zzxpVar) throws Throwable {
/* 3 */             zzabg zzabgVar = (zzabg) oIoi0IIoi.I00iOIl;
/* 14 */            zzabgVar.zzd(Long.valueOf(SystemClock.elapsedRealtime() - j));
/* 21 */            zzabgVar.zze(Integer.valueOf(i));
/* 24 */            zzabgVar.zzb(zzxpVar);
/* 29 */            zzxr zzxrVar = new zzxr();
/* 34 */            zzach zzachVar = (zzach) oIoi0IIoi.I00iiI;
/* 44 */            zzachVar.zzb(((zzabg) oIoi0IIoi.I00iOIl).zzf());
/* 51 */            zzachVar.zzd(Integer.valueOf(i2));
/* 58 */            zzachVar.zzc(Integer.valueOf(i3));
/* 65 */            zzxrVar.zze(zzachVar.zzh());
/* 76 */            speechRecognizer.zzc.zzc(zzaec.zzf(zzxrVar), zzxq.SPEECH_RECOGNITION_INFERENCE);
                }

                private final zzar zzf() {
/* 1 */             zzao zzaoVarZza = zzar.zza();
/* 11 */            zzaoVarZza.zzb(this.zze.getPackageName());
/* 16 */            zzaoVarZza.zza(zzap.MLKIT_SDK);
/* 23 */            return (zzar) zzaoVarZza.zzn();
                }

                private final zzaxd zzg() {
/* 7 */             return (zzaxd) this.zzh.getValue();
                }

                private final String zzh(zzcf zzcfVar) {
                    return this.zzb.getZzc().contains(1) ? String.valueOf(zzcfVar.zza().zza()) : zzcfVar.zzc().zzd();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object checkStatus(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    zzc zzcVar;
/* 3 */             if (iOoil1iiIilo instanceof zzc) {
/* 6 */                 zzcVar = (zzc) iOoil1iiIilo;
/* 8 */                 int i = zzcVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzcVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzcVar = new zzc(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object objZza = zzcVar.zza;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = zzcVar.zzc;
/* 32 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objZza);
/* 55 */                if (!this.zzg) {
/* 59 */                    return new Integer(0);
                        }
/* 63 */                zzca zzcaVarZza = zzcc.zza();
/* 71 */                zzcaVarZza.zzc(zzf());
/* 76 */                zzcaVarZza.zzb(zza);
/* 94 */                if (this.zzb.getZzc().contains(new Integer(1))) {
/* 96 */                    zzt zztVarZza = zzv.zza();
/* 100 */                   zztVarZza.zza(0);
/* 109 */                   zzcaVarZza.zza((zzv) zztVarZza.zzn());
                        }
/* 112 */               zzbl zzblVar = this.zzi;
/* 118 */               zzcc zzccVar = (zzcc) zzcaVarZza.zzn();
/* 120 */               zzcVar.zzd = this;
/* 122 */               zzcVar.zzc = 1;
/* 129 */               objZza = zzblVar.zza(zzccVar, new zzaxq(), zzcVar);
/* 133 */               if (objZza == ii0111o) {
/* 135 */                   return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                this = zzcVar.zzd;
/* 38 */                lIoii1l01l0i.I00000oOI(objZza);
                    }
/* 144 */           return new Integer(this.getFeatureStatus((zzch) objZza));
                }

                @Override
                public void close() throws Throwable {
/* 5 */             zzg().zzd();
/* 10 */            zzxr zzxrVar = new zzxr();
/* 15 */            zzacb zzacbVar = new zzacb();
/* 20 */            zzacbVar.zza(this.zzj);
/* 27 */            zzxrVar.zzc(zzacbVar.zzb());
/* 38 */            this.zzc.zzc(zzaec.zzf(zzxrVar), zzxq.SPEECH_RECOGNITION_CLOSE);
                }

                public final IlOil1ii download() {
/* 3 */             int i = 1;
/* 5 */             if (!this.zzg) {
/* 16 */                DownloadStatus.DownloadFailed downloadFailed = new DownloadStatus.DownloadFailed(new GenAiException(null, 8));
/* 21 */                Ii1Io1loiI ii1Io1loiI = new Ii1Io1loiI(i);
/* 24 */                ii1Io1loiI.I00iiI = downloadFailed;
/* 26 */                VarHandle.storeStoreFence();
/* 29 */                return ii1Io1loiI;
                    }
/* 30 */            zzci zzciVarZza = zzck.zza();
/* 38 */            zzciVarZza.zzb(zzf());
/* 41 */            zzciVarZza.zzc(true);
/* 44 */            SpeechRecognizerOptions speechRecognizerOptions = this.zzb;
/* 59 */            if (speechRecognizerOptions.getZzc().contains(1)) {
/* 61 */                com.google.android.gms.internal.mlkit_genai_speech.zzn zznVarZza = com.google.android.gms.internal.mlkit_genai_speech.zzp.zza();
/* 65 */                zznVarZza.zza(0);
/* 74 */                zzciVarZza.zza((com.google.android.gms.internal.mlkit_genai_speech.zzp) zznVarZza.zzn());
                    } else {
/* 78 */                zzbr zzbrVarZza = zzbt.zza();
/* 90 */                zzbrVarZza.zzb(speechRecognizerOptions.getZzb().toLanguageTag());
/* 95 */                zzbrVarZza.zza(zza);
/* 98 */                zzbrVarZza.zzc(false);
/* 107 */               zzciVarZza.zzd((zzbt) zzbrVarZza.zzn());
                    }
/* 112 */           AtomicBoolean atomicBoolean = new AtomicBoolean(false);
/* 115 */           zzbl zzblVar = this.zzi;
/* 158 */           return ilOo1lI1o10.I00000oIO(ilOl0O00Il0i.I00000oOI(new zzf(zzbnz.zzb(zzblVar.zzc(), zzbj.zzb(), (zzck) zzciVarZza.zzn(), zzblVar.zzb(), new zzaxq()), null, atomicBoolean)), new zzg(null));
                }

                public final int getFeatureStatus(zzch zzchVar) {
/* 1 */             List listZze = zzchVar.zze();
/* 15 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listZze, 10));
/* 18 */            Iterator it = listZze.iterator();
/* 26 */            while (it.hasNext()) {
/* 38 */                arrayList.add(zzh((zzcf) it.next()));
                    }
/* 42 */            List listZzd = zzchVar.zzd();
/* 54 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listZzd, 10));
/* 57 */            Iterator it2 = listZzd.iterator();
/* 65 */            while (it2.hasNext()) {
/* 77 */                arrayList2.add(zzh((zzcf) it2.next()));
                    }
/* 81 */            List listZzf = zzchVar.zzf();
/* 93 */            ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(listZzf, 10));
/* 96 */            Iterator it3 = listZzf.iterator();
/* 104 */           while (it3.hasNext()) {
/* 116 */               arrayList3.add(zzh((zzcf) it3.next()));
                    }
/* 120 */           SpeechRecognizerOptions speechRecognizerOptions = this.zzb;
/* 126 */           String languageTag = speechRecognizerOptions.getZzb().toLanguageTag();
/* 139 */           boolean zContains = speechRecognizerOptions.getZzc().contains(1);
/* 143 */           Companion companion = INSTANCE;
/* 149 */           if (Companion.zza(companion, arrayList3, languageTag, zContains)) {
/* 151 */               return 2;
                    }
/* 157 */           if (Companion.zza(companion, arrayList2, languageTag, zContains)) {
/* 134 */               return 1;
                    }
                    return Companion.zza(companion, arrayList, languageTag, zContains) ? 3 : 0;
                }

                public final IlOil1ii startRecognition(SpeechRecognizerRequest request) {
/* 5 */             int i = 1;
/* 7 */             if (!this.zzg) {
/* 18 */                SpeechRecognizerResponse.ErrorResponse errorResponse = new SpeechRecognizerResponse.ErrorResponse(new GenAiException(null, 8));
/* 23 */                Ii1Io1loiI ii1Io1loiI = new Ii1Io1loiI(i);
/* 26 */                ii1Io1loiI.I00iiI = errorResponse;
/* 28 */                VarHandle.storeStoreFence();
/* 31 */                return ii1Io1loiI;
                    }
/* 45 */            boolean z = request.getZza().getPfd() != null;
/* 48 */            zzaxq zzaxqVar = new zzaxq();
/* 55 */            if (Build.VERSION.SDK_INT >= 35) {
/* 88 */                zzaxqVar.zzf(zzbn.zza().zza(), this.zze.createContext(new ContextParams.Builder().setShouldRegisterAttributionSource(true).build()).getAttributionSource());
                    }
/* 91 */            if (z) {
/* 95 */                zzaxk zzaxkVarZza = zzbn.zza.zza();
/* 103 */               ParcelFileDescriptor pfd = request.getZza().getPfd();
/* 107 */               if (pfd == null) {
/* 115 */                   I000II.I001IO000("Required value was null.");
/* 6 */                     return null;
                        }
/* 109 */               zzaxqVar.zzf(zzaxkVarZza, pfd);
                    }
/* 124 */           IIiOO0o iIiOO0oI00000oIO = ilOl0O00Il0i.I00000oIO(new zzp(this, null));
/* 128 */           long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 134 */           zzabg zzabgVar = new zzabg();
/* 139 */           zzach zzachVar = new zzach();
/* 144 */           zzachVar.zze(this.zzj);
/* 154 */           zzachVar.zzf(z ? zzaci.SOURCE_PFD : zzaci.SOURCE_MIC);
/* 160 */           AtomicInteger atomicInteger = new AtomicInteger(0);
/* 165 */           AtomicInteger atomicInteger2 = new AtomicInteger(0);
/* 170 */           AtomicInteger atomicInteger3 = new AtomicInteger(0);
/* 175 */           AtomicBoolean atomicBoolean = new AtomicBoolean(true);
/* 180 */           AtomicReference atomicReference = new AtomicReference(null);
/* 183 */           zzbl zzblVar = this.zzi;
/* 237 */           return ilOo1lI1o10.I00000oIO(ilOli1oOI10l.I00000oOI(ilOl0O00Il0i.I00000oOI(new zzj(zzbnz.zza(zzblVar.zzc(), zzbj.zzc(), iIiOO0oI00000oIO, zzblVar.zzb(), zzaxqVar), null, this, atomicBoolean, zzabgVar, jElapsedRealtime, atomicInteger, atomicInteger2, atomicInteger3, atomicReference)), new zzk(zzabgVar, zzachVar, atomicReference, this, jElapsedRealtime, atomicInteger3, atomicInteger, atomicInteger2, null)), new zzl(null));
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object stopRecognition(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    zzq zzqVar;
/* 3 */             if (iOoil1iiIilo instanceof zzq) {
/* 6 */                 zzqVar = (zzq) iOoil1iiIilo;
/* 8 */                 int i = zzqVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzqVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzqVar = new zzq(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = zzqVar.zza;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = zzqVar.zzc;
/* 31 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 34 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 54 */                if (!this.zzg) {
/* 56 */                    return ooiIlOl1iI;
                        }
/* 57 */                Function1 function1 = this.zzk;
/* 59 */                zzqVar.zzc = 1;
/* 65 */                if (function1.invoke(zzqVar) == ii0111o) {
/* 67 */                    return ii0111o;
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 38 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 77 */            return ooiIlOl1iI;
                }

                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizer$Companion;", "", "<init>", "()V", "TAG", "", "SBG_APP_PACKAGE", "ON_DEVICE_GRPC_SERVICE_CLASS_NAME", "SELECTED_APPLICATION_DOMAIN", "Lcom/google/speech/soda/ApplicationDomainProto$ApplicationDomain;", "SBG_MIN_VERSION_CODE", "", "isFeatureInList", "", "modelInfoList", "", "locale", "isAdvancedMode", "bindServiceFlags", "Lio/grpc/binder/BindServiceFlags;", "getBindServiceFlags", "()Lio/grpc/binder/BindServiceFlags;", "toLoggingErrorCode", "Lcom/google/mlkit/logging/schema/MLKitEnum$ErrorCode;", "errorCode", "", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public static final boolean zza(Companion companion, List list, String str, boolean z) {
/* 6 */                 if (list.contains(str)) {
/* 5 */                     return true;
                        }
                        return z && !list.isEmpty();
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }
            }
