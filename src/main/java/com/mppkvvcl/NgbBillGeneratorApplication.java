//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl;

import com.mppkvvcl.ui.BillGenerator;
import java.awt.EventQueue;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NgbBillGeneratorApplication {
	public NgbBillGeneratorApplication() {
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = (new SpringApplicationBuilder(new Class[]{NgbBillGeneratorApplication.class})).headless(false).run(args);
		EventQueue.invokeLater(() -> {
			BillGenerator ex = (BillGenerator)ctx.getBean(BillGenerator.class);
			ex.startPdfBillGenerator();
		});
	}
}
