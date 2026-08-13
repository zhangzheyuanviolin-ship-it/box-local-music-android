            package p000;

            import android.content.Context;
            import androidx.work.WorkerParameters;
            
            public abstract class i01i10I1Io1 {
                public final O10oIiIi0OI0 I00000oIO(Context context, String str, WorkerParameters workerParameters) {
                    try {
                        try {
/* 31 */                    O10oIiIi0OI0 o10oIiIi0OI0 = (O10oIiIi0OI0) Class.forName(str).asSubclass(O10oIiIi0OI0.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
/* 37 */                    if (!o10oIiIi0OI0.isUsed()) {
/* 39 */                        return o10oIiIi0OI0;
                            }
/* 80 */                    throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
                        } catch (Throwable th) {
/* 94 */                    IIi0oIl.I000II().I0001Ioi1lo(i01iIoIOI01.I00000oIO, "Could not instantiate ".concat(str), th);
/* 97 */                    throw th;
                        }
                    } catch (Throwable th2) {
/* 111 */               IIi0oIl.I000II().I0001Ioi1lo(i01iIoIOI01.I00000oIO, "Invalid class: ".concat(str), th2);
/* 408 */               throw th2;
                    }
                }
            }
