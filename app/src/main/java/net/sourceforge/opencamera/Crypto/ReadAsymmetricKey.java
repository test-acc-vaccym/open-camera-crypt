package net.sourceforge.opencamera.Crypto;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Environment;
import android.util.Log;

import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.util.PrivateKeyFactory;
import org.spongycastle.crypto.util.PrivateKeyInfoFactory;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by bgardon on 3/02/17.
 */

public class ReadAsymmetricKey /* extends Activity */ {
    public static byte[] readKey(String filename) throws IOException {
        File f = new File(filename);
        int fileSize = (int)f.length();
        FileInputStream in = new FileInputStream(f);
        byte[] res = new byte[fileSize];
        int totalRead = 0;
        while (totalRead < fileSize) {
            in.read(res, totalRead, fileSize - totalRead);
        }
        return res;
    }
}
